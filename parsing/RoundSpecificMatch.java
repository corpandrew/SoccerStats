package parsing;

import java.util.ArrayList;

public class RoundSpecificMatch {

    private ArrayList<Referee> referees;
    private ArrayList<Summary> summaries;
    private Stadium stadium;
    private String identifier;
    private String match_slug;
    private String date_match;
    private MatchSide home;
    private MatchSide away;
    private String match_result;
    private String match_result_first_time;
    private int played;
    private String group_name;

    public ArrayList<Referee> getReferees() {
        return referees;
    }

    public ArrayList<Summary> getSummaries() {
        return summaries;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getMatch_slug() {
        return match_slug;
    }

    public String getDate_match() {
        return date_match;
    }

    public MatchSide getHome() {
        return home;
    }

    public MatchSide getAway() {
        return away;
    }

    public String getMatch_result() {
        return match_result;
    }

    public String getMatch_result_first_time() {
        return match_result_first_time;
    }

    public int getPlayed() {
        return played;
    }

    public String getGroup_name() {
        return group_name;
    }

    @Override
    public String toString() {
        return "RoundSpecificMatch{" +
                "referees=" + referees +
                ", summaries=" + summaries +
                ", stadium=" + stadium +
                ", identifier='" + identifier + '\'' +
                ", match_slug='" + match_slug + '\'' +
                ", date_match='" + date_match + '\'' +
                ", home=" + home +
                ", away=" + away +
                ", match_result='" + match_result + '\'' +
                ", match_result_first_time='" + match_result_first_time + '\'' +
                ", played=" + played +
                ", group_name='" + group_name + '\'' +
                '}';
    }
}
