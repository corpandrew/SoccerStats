package parsing;

import java.util.ArrayList;

public class Seasons {

    private String statusReason;
    private String errorCode;
    private String statusCode;

    private ArrayList<Season> seasons;

    public String getStatusReason() {
        return statusReason;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }
}
