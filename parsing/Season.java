package parsing;

import java.util.ArrayList;

public class Season {
    private String identifier;
    private String season_slug;
    private String season_start;
    private String name;
    private String league_identifier;
    private String season_end;

    public String getIdentifier() {
        return identifier;
    }

    public String getSeasonSlug() {
        return season_slug;
    }

    public String getSeasonStart() {
        return season_start;
    }

    public String getName() {
        return name;
    }

    public String getLeagueIdentifier() {
        return league_identifier;
    }

    public String getSeasonEnd() {
        return season_end;
    }

    @Override
    public String toString() {
        return "Season{" +
                "identifier='" + identifier + '\'' +
                ", season_slug='" + season_slug + '\'' +
                ", season_start='" + season_start + '\'' +
                ", name='" + name + '\'' +
                ", league_identifier='" + league_identifier + '\'' +
                ", season_end='" + season_end + '\'' +
                '}';
    }
}
