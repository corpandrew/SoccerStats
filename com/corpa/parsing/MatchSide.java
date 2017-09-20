package com.corpa.parsing;

public class MatchSide {

    private String team;
    private int goals;
    private int ball_possession;
    private int goal_attempts;
    private int shots_on_goal;
    private int shots_off_goal;
    private int blocked_shots;
    private int free_kicks;
    private int corner_kicks;
    private int offsides;
    private int throw_in;
    private int goalkeeper_saves;
    private int fouls;
    private int red_cards;
    private int yellow_cards;
    private Lineup lineups;

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getBall_possession() {
        return ball_possession;
    }

    public int getGoal_attempts() {
        return goal_attempts;
    }

    public int getShots_on_goal() {
        return shots_on_goal;
    }

    public int getShots_off_goal() {
        return shots_off_goal;
    }

    public int getBlocked_shots() {
        return blocked_shots;
    }

    public int getFree_kicks() {
        return free_kicks;
    }

    public int getCorner_kicks() {
        return corner_kicks;
    }

    public int getOffsides() {
        return offsides;
    }

    public int getThrow_in() {
        return throw_in;
    }

    public int getGoalkeeper_saves() {
        return goalkeeper_saves;
    }

    public int getFouls() {
        return fouls;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    @Override
    public String toString() {
        return "MatchSide{" +
                "team='" + team + '\'' +
                ", goals=" + goals +
                ", ball_possession=" + ball_possession +
                ", goal_attempts=" + goal_attempts +
                ", shots_on_goal=" + shots_on_goal +
                ", shots_off_goal=" + shots_off_goal +
                ", blocked_shots=" + blocked_shots +
                ", free_kicks=" + free_kicks +
                ", corner_kicks=" + corner_kicks +
                ", offsides=" + offsides +
                ", throw_in=" + throw_in +
                ", goalkeeper_saves=" + goalkeeper_saves +
                ", fouls=" + fouls +
                ", red_cards=" + red_cards +
                ", yellow_cards=" + yellow_cards +
                ", lineups=" + lineups +
                '}';
    }
}
