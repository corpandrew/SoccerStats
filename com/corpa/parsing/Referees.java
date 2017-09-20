package com.corpa.parsing;

import java.util.ArrayList;

public class Referees extends BaseRequest{

    private ArrayList<Referee> referees;

    public ArrayList<Referee> getReferees() {
        return referees;
    }

    @Override
    public String toString() {
        return "Referees{" +
                "referees=" + referees +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
