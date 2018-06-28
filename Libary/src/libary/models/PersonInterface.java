package libary.models;

import java.util.List;

public interface PersonInterface {

    void addItem(Item newItem);

    List<Item> getItemList();

    void removeItem(int ID);

    void clearItemList();

    void setName(String newName);

    String getName();

    int getID();

    String toString();
}
