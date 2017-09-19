package parsing;

import java.util.ArrayList;

public class SeasonSpecifiedRounds extends BaseRequest{
    private ArrayList<SeasonSpecifiedRound> rounds;

    public ArrayList<SeasonSpecifiedRound> getRounds() {
        return rounds;
    }

    @Override
    public String toString() {
        return "SeasonSpecifiedRounds{" +
                "rounds=" + rounds +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
