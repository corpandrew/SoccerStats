package com.corpa.parsing;

public class Summary {

    private String identifier;
    private String event_time;
    private Event home_events;
    private Event away_events;

    public String getIdentifier() {
        return identifier;
    }

    public String getEvent_time() {
        return event_time;
    }

    public Event getHome_events() {
        return home_events;
    }

    public Event getAway_events() {
        return away_events;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "identifier='" + identifier + '\'' +
                ", event_time='" + event_time + '\'' +
                ", home_events=" + home_events +
                ", away_events=" + away_events +
                '}';
    }
}
