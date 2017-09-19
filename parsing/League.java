package parsing;

public class League {

    private String identifier;
    private String league_slug;
    private String name;
    private String nation;
    private String level;
    private String federation;

    public String getIdentifier() {
        return identifier;
    }

    public String getLeague_slug() {
        return league_slug;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getLevel() {
        return level;
    }

    public String getFederation() {
        return federation;
    }

    @Override
    public String toString() {
        return "League{" +
                "identifier='" + identifier + '\'' +
                ", league_slug='" + league_slug + '\'' +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", level='" + level + '\'' +
                ", federation='" + federation + '\'' +
                '}';
    }
}
