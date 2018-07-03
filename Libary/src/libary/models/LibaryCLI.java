package libary.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibaryCLI {
    private Library lib;
    private Scanner sc;

    public LibaryCLI() {
        lib = new Library();
    }

    public void launch() {
        System.out.println(mianMenu());
        int in = 0;
        do {
            try {
                in = sc.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println(error());
                in = -1;
            }
            switch (in) {
                case 1:
                    items();
                    break;
                case 2:
                    System.out.println(userMenu());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println(error());
                    break;

            }
        } while (in != 0);

    }

    private String mianMenu() {
        return "!) Items \n2)user\n3)checkout item\n4)return item\n0)exit";
    }

    private String itemMenu() {
        return "1)add item\n2)update item\n3)remove item\n4)view item details";
    }

    private String userMenu() {
        return "1)add user\n2)update user\n3)remove user4)\nview user";
    }

    private String itemCatMenu() {
        return "1)Book\n2)Map\n3)newspaper";
    }

    private String error() {
        return "select value from menu";
    }

    private void items() {
        int in;
        System.out.println(itemMenu());
        try {
            in = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(error());
            in = 0;
        }
        switch (in) {
            case 1:
                System.out.println(itemCatMenu());
                break;
            case 2:
                System.out.println();
                break;
            case 3:
                break;
            default:
                System.out.println(error());
                break;
        }


    }
}

//add item
//delete item
//update item
//add user
//remove user
// update user
//return item
//checkout item
//view item
//exit

//item menu
//user menu
//checkout
//reurn