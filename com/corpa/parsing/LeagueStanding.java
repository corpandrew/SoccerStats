package com.corpa.parsing;

public class LeagueStanding {
    private String identifier;
    private int position;
    private String team_identifier;
    private String team;
    private TeamStats overall;
    private TeamStats home;
    private TeamStats away;
    private int penalization_points;

    public String getIdentifier() {
        return identifier;
    }

    public int getPosition() {
        return position;
    }

    public String getTeam_identifier() {
        return team_identifier;
    }

    public String getTeam() {
        return team;
    }

    public TeamStats getOverall() {
        return overall;
    }

    public TeamStats getHome() {
        return home;
    }

    public TeamStats getAway() {
        return away;
    }

    public int getPenalization_points() {
        return penalization_points;
    }

    @Override
    public String toString() {
        return "LeagueStanding{" +
                "identifier='" + identifier + '\'' +
                ", position=" + position +
                ", team_identifier='" + team_identifier + '\'' +
                ", team='" + team + '\'' +
                ", overall=" + overall +
                ", home=" + home +
                ", away=" + away +
                ", penalization_points=" + penalization_points +
                '}';
    }
}
