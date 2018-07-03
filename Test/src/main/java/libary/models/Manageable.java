package libary.models;

public interface Manageable {

    void add(Crudable c);

    void update(int ID, Crudable c);

    void delete(int ID);

    boolean isCorrectType(Crudable c);

    boolean isEmpty();
}
