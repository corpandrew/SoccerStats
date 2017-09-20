package com.corpa.parsing;

public class SeasonMatch {
    private String identifier;
    private String match_slug;
    private String date_match;
    private String home_team;
    private String away_team;
    private String match_result;
    private String match_result_first_time;
    private int played;
    private Referee referee;
    private Stadium stadium;

    public String getIdentifier() {
        return identifier;
    }

    public String getMatch_slug() {
        return match_slug;
    }

    public String getDate_match() {
        return date_match;
    }

    public String getHome_team() {
        return home_team;
    }

    public String getAway_team() {
        return away_team;
    }

    public String getMatch_result() {
        return match_result;
    }

    public String getMatch_result_first_time() {
        return match_result_first_time;
    }

    public int getPlayed() {
        return played;
    }

    public Referee getReferee() {
        return referee;
    }

    public Stadium getStadium() {
        return stadium;
    }

    @Override
    public String toString() {
        return "SeasonMatch{" +
                "identifier='" + identifier + '\'' +
                ", match_slug='" + match_slug + '\'' +
                ", date_match='" + date_match + '\'' +
                ", home_team='" + home_team + '\'' +
                ", away_team='" + away_team + '\'' +
                ", match_result='" + match_result + '\'' +
                ", match_result_first_time='" + match_result_first_time + '\'' +
                ", played=" + played +
                ", referee=" + referee +
                ", stadium=" + stadium +
                '}';
    }
}
