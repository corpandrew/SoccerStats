package parsing;

public class Scorer {

    private String identifier;
    private String fullname;
    private String player_identifier;
    private String nationality;
    private String number;
    private String position;
    private String goals;
    private String penalties;
    private String matches;
    private String team;
    private String team_identifier;

    public String getIdentifier() {
        return identifier;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPlayer_identifier() {
        return player_identifier;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getGoals() {
        return goals;
    }

    public String getPenalties() {
        return penalties;
    }

    public String getMatches() {
        return matches;
    }

    public String getTeam() {
        return team;
    }

    public String getTeam_identifier() {
        return team_identifier;
    }

    @Override
    public String toString() {
        return "Scorer{" +
                "identifier='" + identifier + '\'' +
                ", fullname='" + fullname + '\'' +
                ", player_identifier='" + player_identifier + '\'' +
                ", nationality='" + nationality + '\'' +
                ", number='" + number + '\'' +
                ", position='" + position + '\'' +
                ", goals='" + goals + '\'' +
                ", penalties='" + penalties + '\'' +
                ", matches='" + matches + '\'' +
                ", team='" + team + '\'' +
                ", team_identifier='" + team_identifier + '\'' +
                '}';
    }
}
