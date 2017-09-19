import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import parsing.Standing;
import requests.HttpRequest;
import requests.Parameters;

public class Main {

    public static void main(String... args) {

        setupUnirest();

        Parameters params = new Parameters();
        params.put(Parameters.Parameter.LEAGUE, "serie-a");
        params.put(Parameters.Parameter.SEASON, "17-18");
        params.put(Parameters.Parameter.TEAM, "juventus");

        Standing serieStanding = HttpRequest.getResponseAs(HttpRequest.RequestType.SEASON_DETAILS, params);
        serieStanding.getStandings().forEach(System.out::println);

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
