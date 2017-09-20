package com.corpa.parsing;

import java.util.ArrayList;

public class Players extends BaseRequest {

    private ArrayList<Player> players;

    public ArrayList<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Players{" +
                "players=" + players +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
