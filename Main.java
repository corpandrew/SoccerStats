import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import parsing.Seasons;
import requests.HttpRequest;
import requests.Parameters;

public class Main {

    public static void main(String... args) {

        setupUnirest();

        Parameters params = new Parameters();
        params.put(Parameters.Parameter.LEAGUE, "premier-league");
        params.put(Parameters.Parameter.SEASON, "17-18");
        params.put(Parameters.Parameter.TEAM, "liverpool");

//        Teams data = HttpRequest.getResponse(HttpRequest.RequestType.SEASON_TEAMS_AVAILABLE, params, Teams.class);
//        data.getObjectsArrayList().forEach(e -> System.out.println(e.getName()));

        Seasons seasons = HttpRequest.getResponse(HttpRequest.RequestType.SEASONS_AVAILABLE, params, Seasons.class);
        seasons.getSeasons().forEach(e -> System.out.println(e.getName()));


    }

    private static void setupUnirest() {
        Unirest.setObjectMapper(new ObjectMapper() {
            private Gson gson = new Gson();

            public <T> T readValue(String s, Class<T> aClass) {
                try{
                    return gson.fromJson(s, aClass);
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object o) {
                try{
                    return gson.toJson(o);
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
