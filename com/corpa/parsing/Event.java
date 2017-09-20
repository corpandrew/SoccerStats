package com.corpa.parsing;

import java.util.ArrayList;

public class Event {
    private ArrayList<GoalEvent> goals;
    private ArrayList<CardEvent> cards;
    private ArrayList<SubstitutionEvent> substitutions;

    public ArrayList<GoalEvent> getGoals() {
        return goals;
    }

    public ArrayList<CardEvent> getCards() {
        return cards;
    }

    public ArrayList<SubstitutionEvent> getSubstitutions() {
        return substitutions;
    }

    @Override
    public String toString() {
        return "Event{" +
                "goals=" + goals +
                ", cards=" + cards +
                ", substitutions=" + substitutions +
                '}';
    }
}
