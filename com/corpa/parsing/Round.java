package com.corpa.parsing;

public class Round {

    private String identifier;
    private String name;
    private String start_date;
    private String end_date;
    private String round_slug;
    private String match_slug;
    private String date_match;
    private String home_team;
    private String away_team;
    private String match_result;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getRound_slug() {
        return round_slug;
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

    @Override
    public String toString() {
        return "Round{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", round_slug='" + round_slug + '\'' +
                ", match_slug='" + match_slug + '\'' +
                ", date_match='" + date_match + '\'' +
                ", home_team='" + home_team + '\'' +
                ", away_team='" + away_team + '\'' +
                ", match_result='" + match_result + '\'' +
                '}';
    }
}
