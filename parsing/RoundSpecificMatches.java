package parsing;

import java.util.ArrayList;

public class RoundSpecificMatches extends BaseRequest {

    private ArrayList<RoundSpecificMatch> match;

    public ArrayList<RoundSpecificMatch> getMatch() {
        return match;
    }

    @Override
    public String toString() {
        return "RoundSpecificMatches{" +
                "match=" + match +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
