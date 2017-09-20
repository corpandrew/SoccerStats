package com.corpa.parsing;

import java.util.ArrayList;

public class Events extends BaseRequest {
    private ArrayList<String> events;

    public ArrayList<String> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "Events{" +
                "events=" + events +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
