import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import parsing.Data;
import parsing.Teams;
import requests.HttpRequest;
import requests.Parameters;

public class Main {

    public static void main(String... args) {

        setupUnirest();

        Parameters params = new Parameters();
        params.put(Parameters.Parameter.LEAGUE, "premier-league");
        params.put(Parameters.Parameter.SEASON, "17-18");
        params.put(Parameters.Parameter.TEAM, "liverpool");

//        String response = HttpRequest.getResponse(HttpRequest.RequestType.SEASON_TEAMS_AVAILABLE, params).getBody().toString();

        Gson g = new Gson();


        String response = HttpRequest.getResponse(HttpRequest.RequestType.SEASON_TEAMS_AVAILABLE, params).getBody().toString();

        System.out.println(response);

        Data data = g.fromJson(response, Data.class);

//        System.out.println(response.getObjectsArrayList().get(0));

//        data.getTeams().getObjectsArrayList().forEach(e -> System.out.println(e.getName()));
        Teams teams = data.getTeams();
        Teams.Team liverpool = teams.getObjectsArrayList().get(6);
        String liverpoolWeb = liverpool.getTeamWebsite();

        System.out.println(liverpoolWeb);

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
