import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Rooms r1 = new Rooms("1", "2", "Darya");
        Rooms r2 = new Rooms("2", "3", "Bagh");
        Rooms r3 = new Rooms("3", "2", "Darya");
        List<Rooms> r = new ArrayList<>();
        r.add(r1);
        r.add(r2);
        r.add(r3);
        Person p1 = new Person("ali", "mohamadi", "123");
        Person p2 = new Person("hasan", "mohamadi", "456");
        Person p3 = new Person("hosein", "mohamadi", "789");
        List<Person> p = new ArrayList<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        Hotel h1 = new Hotel("Shayan", Degree.five, r, p);
        System.out.println(h1);
    }
}
