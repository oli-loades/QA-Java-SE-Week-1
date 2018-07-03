package libary.models;

import java.util.ArrayList;
import java.util.List;

public class ItemManager implements Removable{

    List<Item> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }


    public void update(int ID, Item item) {
        int pos = getPos(ID);
        if (pos != -1) {
            if (items.get(pos) instanceof Book && item instanceof Book) {//the item being edited is of type book and the item passed in is of type book
                items.add(pos,item);
            } else if (items.get(pos) instanceof Newspaper && item instanceof Newspaper) {
                items.add(pos,item);
            } else if (items.get(pos) instanceof Map && item instanceof Map) {
                items.add(pos,item);
            }
        }
    }

    public void remove(int ID) {
        int pos = getPos(ID);
        if (pos != -1) {
            items.remove(pos);
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    private int getPos(int ID) {
        int pos = 0;
        int found = -1;

        for (Item item : items) {
            if (item.getID() == ID) {
                found = pos;
            }
            pos++;
        }

        return found;
    }

    public List<Item> getList() {
        return items;
    }

    public Item get(int ID) {
        return items.get(getPos(ID));
    }

    public void returnItem(int ID) {
        int pos = getPos(ID);
        if(pos!=-1) {//is found
            items.get(pos).setInStock(true);
        }
    }

    public void checkoutItem(int ID) {
        int pos = getPos(ID);
        if(pos!=-1) {
            items.get(getPos(ID)).setInStock(false);
        }
    }
}
