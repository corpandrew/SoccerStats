package com.corpa.parsing;

import java.util.ArrayList;

public class SeasonHead2Head extends BaseRequest{

    private ArrayList<Round> rounds;

    public ArrayList<Round> getRounds() {
        return rounds;
    }

    @Override
    public String toString() {
        return "SeasonHead2Head{" +
                "rounds=" + rounds +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
