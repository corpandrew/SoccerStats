package com.corpa.parsing;

import java.util.ArrayList;

public class Seasons extends BaseRequest{

    private ArrayList<Season> seasons;

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "seasons=" + seasons +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
