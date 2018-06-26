package PersonProject;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("a", 1, "b");
        Person p2 = new Person("c", 2, "d");
        Person p3 = new Person("e", 3, "f");

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        for (Person p : people) {
            System.out.println(p.toString());
        }

        //task 16
        System.out.println(search("a",people).toString());//found

        System.out.println(search("z",people).toString()); //needs exection handling
    }
    private static Person search(String name, ArrayList<Person> people) {
        Person result = null;
        for (Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                result = p;
            }
        }
        return result;
    }
}
