package com.corpa.parsing;

import java.util.ArrayList;

public class Standing extends BaseRequest {

    private ArrayList<TeamStanding> standings;

    public ArrayList<TeamStanding> getStandings() {
        return standings;
    }

    @Override
    public String toString() {
        return "Standing{" +
                "standings=" + standings +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
