package com.corpa.parsing;

public class SubstitutionEvent {
    private int minute;
    private String player_in_identifier;
    private String player_in_fullname;
    private String player_out_identifier;
    private String player_out_fullname;

    public int getMinute() {
        return minute;
    }

    public String getPlayer_in_identifier() {
        return player_in_identifier;
    }

    public String getPlayer_in_fullname() {
        return player_in_fullname;
    }

    public String getPlayer_out_identifier() {
        return player_out_identifier;
    }

    public String getPlayer_out_fullname() {
        return player_out_fullname;
    }

    @Override
    public String toString() {
        return "SubstitutionEvent{" +
                "minute=" + minute +
                ", player_in_identifier='" + player_in_identifier + '\'' +
                ", player_in_fullname='" + player_in_fullname + '\'' +
                ", player_out_identifier='" + player_out_identifier + '\'' +
                ", player_out_fullname='" + player_out_fullname + '\'' +
                '}';
    }
}
