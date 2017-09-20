package com.corpa.parsing;

import java.util.ArrayList;

public class Teams extends BaseRequest {

    private ArrayList<Team> teams;

    public ArrayList<Team> getTeams() {
        return teams;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teams=" + teams +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
