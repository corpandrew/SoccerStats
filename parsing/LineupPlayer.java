package parsing;

public class LineupPlayer {

    private String identifier;
    private int number;
    private String name;
    private String surname;
    private String position;
    private int minutes_played;

    public String getIdentifier() {
        return identifier;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public int getMinutes_played() {
        return minutes_played;
    }

    @Override
    public String toString() {
        return "LineupPlayer{" +
                "identifier='" + identifier + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", minutes_played=" + minutes_played +
                '}';
    }
}
