package requests;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.istack.internal.Nullable;

import java.util.Map;

public class HttpRequest {

    public static HttpResponse<JsonNode> getResponse(RequestType requestType, @Nullable Parameters params) {
        String link = getLink(requestType);

        if (params != null) {
            for (String s : params.keySet()) {
                if (s.contains(s))
                    link = link.replace(s, params.get(s));
            }
        }

        HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.get(link)
                    .header("X-Mashape-Key", "HsdxelKE1Umsh9hfsJCCah13dZAyp1YOiuijsngzYPEUBNAZvB")
                    .header("Accept", "application/json")
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static <T> HttpResponse<T> getResponseAsT(RequestType requestType, @Nullable Parameters params, Class<T> className) {
        String link = getLink(requestType);

        if (params != null) {
            for (String s : params.keySet()) {
                if (s.contains(s))
                    link = link.replace(s, params.get(s));
            }
        }

        HttpResponse<T> response = null;

        try {
            response = Unirest.get(link)
                    .header("X-Mashape-Key", "HsdxelKE1Umsh9hfsJCCah13dZAyp1YOiuijsngzYPEUBNAZvB")
                    .header("Accept", "application/json")
                    .asObject(className);
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static HttpResponse<JsonNode> getResponse(RequestType requestType) {
        return getResponse(requestType, null);
    }

    private static String getLink(RequestType requestType) {
        String link = "";

        switch (requestType) {
            case LEAGUE_DETAILS:
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug";
                break;
            case LEAGUE_MANAGERS_IN_A_SEASON:
                break;
            case LEAGUE_REFEREE_IN_SEASON:
                break;
            case LEAGUE_TOP_SCORER:
                break;
            case LIST_OF_LEAGUES:
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues";
                break;
            case ROUND_MATCHES:
                break;
            case ROUND_SPECIFIED_MATCH:
                break;
            case SEASON_DETAILS:
                break;
            case SEASON_HEAD_2_HEAD:
                break;
            case SEASON_MATCHES_FOR_A_TEAM:
                break;
            case SEASON_ROUNDS:
                break;
            case SEASON_SPECIFIED_ROUND:
                break;
            case SEASON_STANDINGS:
                break;
            case SEASON_STANDINGS_POSITION:
                break;
            case SEASON_TEAMS_AVAILABLE:
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/teams";
                break;
            case SEASON_TEAMS_AVAILABLE_PLAYERS://league slug, season slug, team slug
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/teams/team_slug/players";
                break;
            case SEASONS_AVAILABLE://league slug
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons";
                break;
            case STADIUMS_LIST:
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/stadiums";
                break;
            case EVENTS_LIST:
                link = "https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/utils/events";
                break;
        }
        return link;
    }

    public enum RequestType {
        LEAGUE_DETAILS/*("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug")*/,
        LEAGUE_MANAGERS_IN_A_SEASON(), LEAGUE_REFEREE_IN_SEASON,
        LEAGUE_TOP_SCORER, LIST_OF_LEAGUES, ROUND_MATCHES, ROUND_SPECIFIED_MATCH,
        SEASON_DETAILS, SEASON_HEAD_2_HEAD, SEASON_MATCHES_FOR_A_TEAM, SEASON_ROUNDS,
        SEASON_SPECIFIED_ROUND, SEASON_STANDINGS, SEASON_STANDINGS_POSITION,
        SEASON_TEAMS_AVAILABLE, SEASON_TEAMS_AVAILABLE_PLAYERS, SEASONS_AVAILABLE,
        STADIUMS_LIST, EVENTS_LIST;
    }

}
