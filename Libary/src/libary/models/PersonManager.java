package libary.models;

import java.util.ArrayList;
import java.util.List;

public class PersonManager implements Manageable {

    List<Person> people;

    public PersonManager(){
        people = new ArrayList<>();
    }

    @Override
    public void add(Crudable c) {
        if(isCorrectType(c)){
            people.add((Person)c);
        }
    }

    @Override
    public void update(int ID, Crudable c) {
        int pos = getPos(ID);
        if(pos!=-1){
            people.get(pos).setName(((Person) c).getName());
        }
    }

    @Override
    public void delete(int ID) {
        int pos = getPos(ID);
        if(pos!=-1){
            people.remove(pos);
        }
    }

    @Override
    public boolean isCorrectType(Crudable c) {
        return c instanceof Person;
    }

    private int getPos(int ID) {
        int pos = 0;
        int found = -1;


        for(Person p:people){
            if(p.getID()==ID){
                found = pos;
            }
            pos++;
        }

        return found;
    }

    public Person get(int ID){
        return people.get(getPos(ID));
    }

    public List<Person> getList() {
        return people;
    }

    @Override
    public boolean isEmpty() {
        return people.isEmpty();
    }

    public void checkOut(int ID,Item item){
        int pos = getPos(ID);
        if(pos==-1){
            people.get(pos).addItem(item);
        }
    }

    public void reurnItem(int itemID,int personID){
        int pos = getPos(personID);
        if(pos==-1){
            people.get(pos).removeItem(itemID);
        }
    }
}
