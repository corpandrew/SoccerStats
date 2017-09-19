package parsing;

public class Stadium {
    private String identifier;
    private String name;
    private String city;

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
