package libary.models;

import java.util.ArrayList;
import java.util.List;

public class Person implements Crudable{

    private int ID;
    private String name;
    private List<Item> items;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
        items = new ArrayList<>();
    }

    public void addItem(Item newItem) {
        items.add(newItem);
    }

    public List<Item> getItemList() {
        return items;
    }

    public void removeItem(int ID) {
        int pos = 0;
        int found = -1;

        for (Item i : items) {
            if (i.getID() == ID) {
                found = pos;
            }
            pos++;
        }

        if (found != -1) {
            items.remove(found);
        }
    }

    public void clearItemList() {
        items.clear();
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " name: " + name;
    }
}
