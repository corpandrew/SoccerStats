package com.corpa.parsing;

import java.util.ArrayList;

public class SeasonLeagueStandings extends BaseRequest{

    private ArrayList<LeagueStanding> standings;

    public ArrayList<LeagueStanding> getStandings() {
        return standings;
    }

    @Override
    public String toString() {
        return "SeasonLeagueStandings{" +
                "standings=" + standings +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
