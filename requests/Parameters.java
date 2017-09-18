package requests;

import java.util.HashMap;

public class Parameters extends HashMap<String, String> {

    public void put(Parameter param, String value) {
        put(param.getValue(), value);
    }

    public Parameters build() {
        return this;
    }

    public enum Parameter{

        SEASON("season_slug"), TEAM("team_slug"), LEAGUE("league_slug");

        String value;

        Parameter(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
