package com.corpa.parsing;

public class CardEvent {

    private String player_identifier;
    private String player_fullname;
    private int minute;
    private String type;

    public String getPlayer_identifier() {
        return player_identifier;
    }

    public String getPlayer_fullname() {
        return player_fullname;
    }

    public int getMinute() {
        return minute;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CardEvent{" +
                "player_identifier='" + player_identifier + '\'' +
                ", player_fullname='" + player_fullname + '\'' +
                ", minute=" + minute +
                ", type='" + type + '\'' +
                '}';
    }
}
