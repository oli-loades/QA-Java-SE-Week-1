package libary.models;

public class Library {
    private PersonManager personMan;
    private ItemManager itemMan;

    public Library(){
        personMan = new PersonManager();
        itemMan = new ItemManager();
    }

    public void addItem(boolean inStock, String author,String title){// adds book
        itemMan.add(new Book(inStock,author,title));
    }

    public void addItem( boolean inStock, NewspaperType type,String publisher){//add newspaper
        itemMan.add(new Newspaper(inStock,publisher,type));
    }

    public void addItem( boolean inStock, MapType type,String region){//adds map
        itemMan.add(new Map(inStock,type,region));
    }

    public void updateItem(int ID ,boolean inStock, String author,String title){//updates book
        itemMan.update(ID,new Book(inStock,author,title));
    }

    public void updateItem(int ID ,boolean inStock, NewspaperType type,String publisher){//updates newspaper
        itemMan.update(ID,new Newspaper(inStock,publisher,type));
    }

    public void updateItem(int ID,boolean inStock, MapType type,String region){//update map
        itemMan.update(ID,new Map(inStock,type,region));
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
