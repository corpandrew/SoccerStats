package parsing;

import java.util.ArrayList;

public class Matches extends BaseRequest {

    private ArrayList<Match> matches;

    public ArrayList<Match> getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        return "Matches{" +
                "matches=" + matches +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
