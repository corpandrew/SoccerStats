import com.corpa.parsing.Match;
import com.corpa.parsing.Matches;
import com.corpa.parsing.Round;
import com.corpa.parsing.SeasonHead2Head;
import com.corpa.requests.HttpRequest;
import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {

    public static void main(String... args) throws ParseException {

        setupUnirest();
//
//        Parameters params = new Parameters();
//        params.put(Parameter.LEAGUE, "serie-a");
//        params.put(Parameter.SEASON, "17-18");
//        params.put(Parameter.TEAM, "juventus");
//
//        Standing serieStanding = HttpRequest.getResponseAs(HttpRequest.RequestType.SEASON_DETAILS, params);
//        serieStanding.getStandings().forEach(System.out::println);


        SeasonHead2Head seasonHead2Head = HttpRequest.getSeasonRounds("serie-a", "17-18");
        ArrayList<Round> rounds = seasonHead2Head.getRounds();

        ArrayList<Match> matchesThisSeason = new ArrayList<>();


        ArrayList<Round> roundsThatHaveHappened = new ArrayList<>();
        Calendar currentTime = Calendar.getInstance();
        Calendar roundTime = Calendar.getInstance();

        for (Round r : rounds) {
            roundTime.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(r.getEnd_date()));

            if (roundTime.before(currentTime))
                roundsThatHaveHappened.add(r);
            else
                break;
        }
        try {
            for (Round r : roundsThatHaveHappened) {
                Matches matches = HttpRequest.getRoundMatches("serie-a", r.getRound_slug(), "17-18");
                System.out.println(matches);
                matchesThisSeason.addAll(matches.getMatches());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        matchesThisSeason.forEach(e -> {
            System.out.println("Score between: " + e.getHome().getTeam() + " and " + e.getAway().getTeam() + " was " + e.getMatch_result());
        });
    }

    private static void setupUnirest() {
        Unirest.setObjectMapper(new ObjectMapper() {
            private Gson gson = new Gson();

            public <T> T readValue(String s, Class<T> aClass) {
                try {
                    return gson.fromJson(s, aClass);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object o) {
                try {
                    return gson.toJson(o);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
