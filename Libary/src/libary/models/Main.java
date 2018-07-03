package libary.models;

public class Main {

    public static void main(String[] args) {
	Library lib = new Library();
	lib.addItem(true,"abc","xyz");
        lib.addItem(true,NewspaperType.BROADSHEET,"xyz");
    }
}
