package com.corpa.parsing;

import java.util.ArrayList;

public class RoundSpecificMatches extends BaseRequest {

    private ArrayList<RoundSpecificMatch> matches;

    public ArrayList<RoundSpecificMatch> getMatch() {
        return matches;
    }

    @Override
    public String toString() {
        return "RoundSpecificMatches{" +
                "matches=" + matches +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
