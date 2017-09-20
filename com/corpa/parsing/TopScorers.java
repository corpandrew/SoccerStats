package com.corpa.parsing;

import java.util.ArrayList;

public class TopScorers extends BaseRequest{

    private ArrayList<Scorer> topscorers;

    public ArrayList<Scorer> getTopscorers() {
        return topscorers;
    }

    @Override
    public String toString() {
        return "TopScorers{" +
                "topscorers=" + topscorers +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
