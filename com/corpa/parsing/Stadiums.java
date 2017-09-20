package com.corpa.parsing;

import java.util.ArrayList;

public class Stadiums extends BaseRequest {

    private ArrayList<Stadium> stadiums;

    public ArrayList<Stadium> getStadiums() {
        return stadiums;
    }

    @Override
    public String toString() {
        return "Stadiums{" +
                "stadiums=" + stadiums +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
