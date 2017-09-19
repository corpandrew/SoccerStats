package parsing;

public class TeamStanding {

    private String identifier;
    private int position;
    private String team_identifier;
    private String team;

    public String getIdentifier() {
        return identifier;
    }

    public int getPosition() {
        return position;
    }

    public String getTeam_identifier() {
        return team_identifier;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "TeamStanding{" +
                "identifier='" + identifier + '\'' +
                ", position=" + position +
                ", team_identifier='" + team_identifier + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
