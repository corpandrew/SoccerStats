package requests;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.istack.internal.Nullable;
import parsing.*;

public class HttpRequest {

    public static String getResponse(RequestType requestType, @Nullable Parameters params) {
        String link = requestType.getLink();

        if (params != null) {
            for (String s : params.keySet()) {
                if (s.contains(s))
                    link = link.replace(s, params.get(s));
            }
        }

        String response = null;

        try {
            response = Unirest.get(link)
                    .header("X-Mashape-Key", "HsdxelKE1Umsh9hfsJCCah13dZAyp1YOiuijsngzYPEUBNAZvB")
                    .header("Accept", "application/json")
                    .asJson().getBody().toString().replace("{\"data\":", "");//fix formatting for parsing
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        assert response != null;

        return response.substring(0, response.length() - 1);
    }

    public static String getResponseAsString(RequestType requestType, Parameters params) {
        String link = requestType.getLink();

        if (params != null) {
            for (String s : params.keySet()) {
                if (s.contains(s))
                    link = link.replace(s, params.get(s));
            }
        }

        String response = null;

        try {
            response = Unirest.get(link)
                    .header("X-Mashape-Key", "HsdxelKE1Umsh9hfsJCCah13dZAyp1YOiuijsngzYPEUBNAZvB")
                    .header("Accept", "application/json")
                    .asJson().getBody().toString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static String getResponse(RequestType requestType) {
        return getResponse(requestType, null);
    }

    public static <T> T getResponse(RequestType requestType, @Nullable Parameters params, Class<T> className) {
        String response = getResponse(requestType, params);

        System.out.println(response);

        Gson g = new Gson();

        return g.fromJson(response, className);
    }

    public static <T> T getResponseAs(RequestType requestType, @Nullable Parameters params) {
        String response = getResponse(requestType, params);

        Class<T> classname = requestType.getClassName();

        System.out.println(response);

        Gson g = new Gson();

        return g.fromJson(response, classname);
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
        LEAGUE_DETAILS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug", Seasons.class),//league slug
        LEAGUE_MANAGERS_IN_A_SEASON("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/managers", Managers.class),//league slug, season slug
        LEAGUE_REFEREE_IN_SEASON("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/referees", Referees.class),//league slug, season slug
        LEAGUE_TOP_SCORER("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/topscorers", TopScorers.class),
        LIST_OF_LEAGUES("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues", Leagues.class),
        ROUND_MATCHES("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/rounds/round_slug/matches", Matches.class),
        ROUND_SPECIFIED_MATCH("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/rounds/round_slug/matches/match_slug", RoundSpecificMatches.class),
        SEASON_DETAILS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug", Standing.class),
        SEASON_HEAD_2_HEAD("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/rounds?team_1_slug=team_1&team_2_slug=team_2", SeasonHead2Head.class),
        SEASON_MATCHES_FOR_A_TEAM("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/rounds?team_identifier=team_identifier", SeasonHead2Head.class),
        SEASON_ROUNDS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/rounds", SeasonHead2Head.class),
        SEASON_SPECIFIED_ROUND("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/rounds/round_slug", SeasonSpecifiedRounds.class),
        SEASON_STANDINGS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/standings", SeasonLeagueStandings.class),
        SEASON_STANDINGS_POSITION("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/standings/position"),
        SEASON_TEAMS_AVAILABLE("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/teams"),
        SEASON_TEAMS_AVAILABLE_PLAYERS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/teams/team_slug/players"),
        SEASONS_AVAILABLE("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons"),
        STADIUMS_LIST("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/stadiums"),
        EVENTS_LIST("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/utils/events");

        private String link;
        private Class className;

        RequestType(String link, Class className) {
            this.link = link;
            this.className = className;
        }

        RequestType(String link) {
            this.link = link;
        }

        public String getLink() {
            return link;
        }

        public Class getClassName() {
            return className;
        }
    }

}
