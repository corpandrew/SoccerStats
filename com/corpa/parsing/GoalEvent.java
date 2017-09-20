package com.corpa.parsing;

public class GoalEvent {
    private String player_identifier;
    private String player_fullname;
    private int minute;

    public String getPlayer_identifier() {
        return player_identifier;
    }

    public String getPlayer_fullname() {
        return player_fullname;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return "GoalEvent{" +
                "player_identifier='" + player_identifier + '\'' +
                ", player_fullname='" + player_fullname + '\'' +
                ", minute=" + minute +
                '}';
    }
}
