package com.corpa.parsing;

import java.util.ArrayList;

public class Leagues extends BaseRequest {

    private ArrayList<League> leagues;

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    @Override
    public String toString() {
        return "Leagues{" +
                "leagues=" + leagues +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
