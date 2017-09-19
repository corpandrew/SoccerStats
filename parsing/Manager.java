package parsing;

public class Manager {
    private String identifier;
    private String name;
    private String surname;
    private String team;
    private String team_identifier;
    private String manager_slug;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTeam() {
        return team;
    }

    public String getTeamIdentifier() {
        return team_identifier;
    }

    public String getManager_slug() {
        return manager_slug;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", team='" + team + '\'' +
                ", team_identifier='" + team_identifier + '\'' +
                ", manager_slug='" + manager_slug + '\'' +
                '}';
    }
}
