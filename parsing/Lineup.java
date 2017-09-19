package parsing;

import java.util.ArrayList;

public class Lineup {

    private ArrayList<LineupPlayer> startings;
    private ArrayList<LineupPlayer> benches;
    private Manager manager;

    public ArrayList<LineupPlayer> getStartings() {
        return startings;
    }

    public ArrayList<LineupPlayer> getBenches() {
        return benches;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Lineup{" +
                "startings=" + startings +
                ", benches=" + benches +
                ", manager=" + manager +
                '}';
    }
}
