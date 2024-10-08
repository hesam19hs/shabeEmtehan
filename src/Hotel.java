import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private Degree stars;
    private List<Rooms> rooms;
    private List<Person> persons;
    public Hotel(String name, Degree stars, List<Rooms> rooms, List<Person> persons) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;
        this.persons = persons;
    }
    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", rooms=" + rooms +
                ", persons=" + persons +
                '}';
    }
}
