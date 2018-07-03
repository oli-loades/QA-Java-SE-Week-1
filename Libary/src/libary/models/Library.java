package libary.models;

public class Library {
    private PersonManager personMan;
    private ItemManager itemMan;

    public Library(){
        personMan = new PersonManager();
        itemMan = new ItemManager();
    }



    public void addItem(Item item){// adds book
        itemMan.add(item);
    }

    public void update(int ID,Item item){
        itemMan.update(ID,item);
    }

    public void removeItem(int ID){
        itemMan.remove(ID);
    }

    public void returnItem(int personID, int itemID){
        personMan.returnItem(itemID,personID);
        itemMan.returnItem(itemID);
    }

    public void checkoutItem(int personID, int itemID){
        personMan.checkoutItem(personID,itemMan.get(itemID));
        itemMan.checkoutItem(itemID);
    }

    public int getNumUsers(){
        return personMan.getList().size();
    }

    public int getNumItems(){
        return itemMan.getList().size();
    }

    public void addUser(String name){
        personMan.add(new Person(name));
    }

    public void updateUser(int ID, String name){
        personMan.update(ID, new Person(name));
    }

    public Person getUser(int ID){
        return personMan.get(ID);
    }

    public void removeUser(int ID){
        personMan.remove(ID);
    }

    public Book getBook(int ID)throws ClassCastException{
        return (Book) itemMan.get(ID);
    }

    public Map getMap(int ID) throws ClassCastException{
        return (Map) itemMan.get(ID);
    }

    public Newspaper getNewspaper(int ID)throws ClassCastException{
        return (Newspaper) itemMan.get(ID);
    }


}
