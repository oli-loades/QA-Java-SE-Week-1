package libary.models;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    List<Person> people;

    public PersonManager() {
        people = new ArrayList<>();
    }

    public void add(Person p) {
        people.add((Person) p);
    }


    public void update(int ID, Person p) {
        int pos = getPos(ID);
        if (pos != -1) {
            people.get(pos).setName(p.getName());
        }

    }

    public void delete(int ID) {
        int pos = getPos(ID);
        if (pos != -1) {
            people.remove(pos);
        }
    }


    private int getPos(int ID) {
        int pos = 0;
        int found = -1;


        for (Person p : people) {
            if (p.getID() == ID) {
                found = pos;
            }
            pos++;
        }

        return found;
    }

    public Person get(int ID) {
        return people.get(getPos(ID));
    }

    public List<Person> getList() {
        return people;
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public void checkOut(int ID, Item item) {
        int pos = getPos(ID);
        if (pos == -1) {
            people.get(pos).addItem(item);
        }
    }

    public void returnItem(int itemID, int personID) {
        int pos = getPos(personID);
        if (pos == -1) {
            people.get(pos).removeItem(itemID);
        }
    }
}
