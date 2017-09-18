package parsing;

import java.util.ArrayList;

public class Teams {

    private String statusReason;
    private String errorCode;
    private String statusCode;

    private ArrayList<Team> teams;

    public String getStatusReason() {
        return statusReason;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

}
