package com.corpa.requests;

import com.corpa.parsing.*;
import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.istack.internal.Nullable;

public class HttpRequest {

    private static String getResponse(RequestType requestType, @Nullable Parameters params) {
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

//        System.out.println(response);

        Gson g = new Gson();

        return g.fromJson(response, className);
    }

    @SuppressWarnings("unchecked")
    private static <T> T getResponseAs(RequestType requestType, @Nullable Parameters params) {
        String response = getResponse(requestType, params);

        Class<T> classname = requestType.getClassName();

//        System.out.println(response);

        Gson g = new Gson();

        return g.fromJson(response, classname);
    }

    @SuppressWarnings("unchecked")
    private static <T> T getResponseAs(RequestType requestType, @Nullable Parameter... parameters) {
        Parameters paramMap = new Parameters(parameters);

        String response = getResponse(requestType, paramMap);

        Class<T> classname = requestType.getClassName();

//        System.out.println(response);

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
        LEAGUE_DETAILS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug", Leagues.class),//league slug
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
        SEASON_STANDINGS_POSITION("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/standings/position", SeasonLeagueStandings.class),
        SEASON_TEAMS_AVAILABLE("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/teams", Teams.class),
        SEASON_TEAMS_AVAILABLE_PLAYERS("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons/season_slug/teams/team_slug/players", Players.class),
        SEASONS_AVAILABLE("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/leagues/league_slug/seasons", Seasons.class),
        STADIUMS_LIST("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/stadiums", Stadiums.class),
        EVENTS_LIST("https://sportsop-soccer-sports-open-data-v1.p.mashape.com/v1/utils/events", Events.class);

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

    public static Leagues getSeasons(String league_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        return getResponseAs(RequestType.LEAGUE_DETAILS, new Parameters(leagueParameter));
    }

    public static Managers getLeagueManagers(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.LEAGUE_MANAGERS_IN_A_SEASON, new Parameters(leagueParameter, seasonParameter));
    }

    public static Referees getLeagueReferees(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.LEAGUE_REFEREE_IN_SEASON, new Parameters(leagueParameter, seasonParameter));
    }

    public static TopScorers getLeagueTopScorer(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.LEAGUE_TOP_SCORER, new Parameters(leagueParameter, seasonParameter));
    }

    public static Leagues getLeagues() {
        return getResponseAs(RequestType.LIST_OF_LEAGUES);
    }

    public static Matches getRoundMatches(String league_slug, String round_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter roundParameter = new Parameter(Parameter.APIParam.ROUND, round_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.ROUND_MATCHES, new Parameters(leagueParameter, roundParameter, seasonParameter));
    }

    public static RoundSpecificMatches getRoundSpecificMatches(String league_slug, String match_slug, String round_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter matchParameter = new Parameter(Parameter.APIParam.MATCH, match_slug);
        Parameter roundParameter = new Parameter(Parameter.APIParam.ROUND, round_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.ROUND_SPECIFIED_MATCH, new Parameters(leagueParameter, matchParameter, roundParameter, seasonParameter));
    }

    public static Standing getSeasonDetails(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.SEASON_DETAILS, new Parameters(leagueParameter, seasonParameter));
    }

    public static SeasonHead2Head getSeasonHead2Head(String league_slug, String season_slug, String team_1, String team_2) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        Parameter teamOneParameter = new Parameter(Parameter.APIParam.TEAM_1, team_1);
        Parameter teamTwoParameter = new Parameter(Parameter.APIParam.TEAM_2, team_2);
        return getResponseAs(RequestType.SEASON_HEAD_2_HEAD, new Parameters(leagueParameter, teamOneParameter, teamTwoParameter, seasonParameter));
    }

    public static SeasonHead2Head getSeasonMatches(String league_slug, String season_slug, String team_identifier) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        Parameter teamIdentifier = new Parameter(Parameter.APIParam.TEAM_IDENTIFIER, team_identifier);
        return getResponseAs(RequestType.SEASON_MATCHES_FOR_A_TEAM, new Parameters(leagueParameter, teamIdentifier, seasonParameter));
    }

    public static SeasonHead2Head getSeasonRounds(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.SEASON_ROUNDS, new Parameters(leagueParameter, seasonParameter));
    }

    public static SeasonSpecifiedRounds getSeasonSpecifiedRound(String league_slug, String round_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter roundParameter = new Parameter(Parameter.APIParam.ROUND, round_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.SEASON_SPECIFIED_ROUND, new Parameters(leagueParameter, roundParameter, seasonParameter));
    }

    public static SeasonLeagueStandings getSeasonStandings(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.SEASON_STANDINGS, new Parameters(leagueParameter, seasonParameter));
    }

    public static SeasonLeagueStandings getSeasonStandingsPosition(String league_slug, int position, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter positionParameter = new Parameter(Parameter.APIParam.POSITION, position + "");
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.SEASON_STANDINGS_POSITION, new Parameters(leagueParameter, positionParameter, seasonParameter));
    }

    public static Teams getSeasonTeamsAvailable(String league_slug, String season_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        return getResponseAs(RequestType.SEASON_TEAMS_AVAILABLE, new Parameters(leagueParameter, seasonParameter));
    }

    public static Players getSeasonTeamsAvailablePlayers(String league_slug, String season_slug, String team_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        Parameter seasonParameter = new Parameter(Parameter.APIParam.SEASON, season_slug);
        Parameter teamParameter = new Parameter(Parameter.APIParam.TEAM, team_slug);
        return getResponseAs(RequestType.SEASON_TEAMS_AVAILABLE_PLAYERS, new Parameters(leagueParameter, seasonParameter, teamParameter));
    }

    public static Seasons getSeasonsAvailable(String league_slug) {
        Parameter leagueParameter = new Parameter(Parameter.APIParam.LEAGUE, league_slug);
        return getResponseAs(RequestType.SEASONS_AVAILABLE, new Parameters(leagueParameter));
    }

    public static Stadiums getStadiumsList() {
        return getResponseAs(RequestType.STADIUMS_LIST);
    }

    public static Events getEventsList() {
        return getResponseAs(RequestType.EVENTS_LIST);
    }
}