package parsing;

import java.util.ArrayList;

public class Managers extends BaseRequest {

    private ArrayList<Manager> managers;

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "managers=" + managers +
                ", statusReason='" + statusReason + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
