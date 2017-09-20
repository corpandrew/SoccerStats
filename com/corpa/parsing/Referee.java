package com.corpa.parsing;

public class Referee {
    private String identifier;
    private String name;
    private String surname;
    private boolean assistant;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getAssistant() {
        return assistant;
    }

    @Override
    public String toString() {
        return "Referee{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", assistant=" + assistant +
                '}';
    }
}
