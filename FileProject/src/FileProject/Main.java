package FileProject;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("a", 1, "b");
        Person p2 = new Person("c", 2, "d");
        Person p3 = new Person("e", 3, "f");
        Person p4 = new Person("g", 4, "h");
        Person p5 = new Person("i", 5, "j");

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        write(people);

        people.clear();
        print(people);

        people = read();
        print(people);
    }

    private static void write(ArrayList<Person> people) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));) {
            for (Person p : people) {
                out.write(p.toString());
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("whoops");
        }
    }

    private static ArrayList<Person> read() {
        ArrayList<Person> people = new ArrayList<>();
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader("test.txt"));) {
            while ((line = in.readLine()) != null) {
                String split[] = line.split(",");
                people.add(new Person(split[0], Integer.parseInt(split[1]), split[2]));
            }
        } catch (IOException e) {
            System.out.println("whoops");
        }
        return people;
    }

    private static void print(ArrayList<Person> people){
        if(people.isEmpty()){
            System.out.println("list empty");
        }else {
            for (Person p : people) {
                System.out.println(p.toString());
            }
        }
    }
}
