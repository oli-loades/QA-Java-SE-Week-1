package libary.models;

public class Libarary {
    private PersonManager personMan;
    private ItemManager itemMan;

    public Libarary(){
        personMan = new PersonManager();
        itemMan = new ItemManager();
    }

    public void returnItem(int personID, int itemID){
        personMan.returnItem(itemID,personID);
        itemMan.returnItem(itemID);
    }

}
