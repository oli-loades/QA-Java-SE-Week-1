package libary.models;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

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
            if (items.get(pos) instanceof Book && item instanceof Book) {
                ((Book) items.get(pos)).setTitle((((Book) item).getTitle()));
                ((Book) items.get(pos)).setAuthor(((Book) item).getAuthor());
            } else if (items.get(pos) instanceof Newspaper && item instanceof Newspaper) {
                ((Newspaper) items.get(pos)).setPublisher(((Newspaper) item).getPublisher());
                ((Newspaper) items.get(pos)).setType(((Newspaper) item).getType());
            } else if (items.get(pos) instanceof Map && item instanceof Map) {
                ((Map) items.get(pos)).setRegion(((Map) item).getRegion());
                ((Map) items.get(pos)).setType(((Map) item).getType());
            }
        }
    }


    public void delete(int ID) {
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
        items.get(getPos(ID)).setInStock(true);
    }

    public void checkoutItem(int ID) {
        items.get(getPos(ID)).setInStock(false);
    }
}
