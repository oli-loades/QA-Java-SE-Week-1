package models;

public class Ship {

    private String name;
    private int size;
    private int x;
    private int y;
    private Direction dir;


    public Ship(String name, int size,int x, int y, Direction dir){
        this.name = name;
        this.size = size;
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
