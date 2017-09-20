package com.corpa.parsing;

public class TeamStats {

    private int wins;
    private int draws;
    private int losts;
    private int points;
    private int scores;
    private int conceded;
    private String last_5;
    private int matches_played;
    private int goal_difference;

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosts() {
        return losts;
    }

    public int getPoints() {
        return points;
    }

    public int getScores() {
        return scores;
    }

    public int getConceded() {
        return conceded;
    }

    public String getLast_5() {
        return last_5;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public int getGoal_difference() {
        return goal_difference;
    }

    @Override
    public String toString() {
        return "TeamStats{" +
                "wins=" + wins +
                ", draws=" + draws +
                ", losts=" + losts +
                ", points=" + points +
                ", scores=" + scores +
                ", conceded=" + conceded +
                ", last_5='" + last_5 + '\'' +
                ", matches_played=" + matches_played +
                ", goal_difference=" + goal_difference +
                '}';
    }
}
