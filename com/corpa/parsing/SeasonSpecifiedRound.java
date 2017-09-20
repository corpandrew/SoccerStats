package com.corpa.parsing;

import java.util.ArrayList;

public class SeasonSpecifiedRound {

    private String identifier;
    private String name;
    private String start_date;
    private String end_date;
    private String round_slug;
    private ArrayList<SeasonMatch> matches;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getRound_slug() {
        return round_slug;
    }

    public ArrayList<SeasonMatch> getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        return "SeasonSpecifiedRound{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", round_slug='" + round_slug + '\'' +
                ", matches=" + matches +
                '}';
    }
}
