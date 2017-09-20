import com.google.gson.Gson;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClients;

public class Main {

    public static void main(String... args) {

        setupUnirest();
//
//        Parameters params = new Parameters();
//        params.put(Parameter.LEAGUE, "serie-a");
//        params.put(Parameter.SEASON, "17-18");
//        params.put(Parameter.TEAM, "juventus");
//
//        Standing serieStanding = HttpRequest.getResponseAs(HttpRequest.RequestType.SEASON_DETAILS, params);
//        serieStanding.getStandings().forEach(System.out::println);

    }

    private static void setupUnirest() {
        RequestConfig globalConfig = RequestConfig.custom()
                .setCookieSpec(CookieSpecs.STANDARD).build();

        HttpClient httpclient = HttpClients.custom().setDefaultRequestConfig(globalConfig).build();
        Unirest.setHttpClient(httpclient);

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
