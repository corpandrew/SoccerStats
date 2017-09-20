package com.corpa.parsing;

public class Player {
    private String identifier;
    private String name;
    private String fullname;
    private String nationality;
    private int number;
    private String position;
    private String birthday;
    private String team;
    private String team_identifier;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getFullname() {
        return fullname;
    }

    public String getNationality() {
        return nationality;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getTeam() {
        return team;
    }

    public String getTeam_identifier() {
        return team_identifier;
    }

    @Override
    public String toString() {
        return "Player{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", number=" + number +
                ", position='" + position + '\'' +
                ", birthday='" + birthday + '\'' +
                ", team='" + team + '\'' +
                ", team_identifier='" + team_identifier + '\'' +
                '}';
    }
}
