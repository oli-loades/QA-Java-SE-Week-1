package models;

public interface Playable {
    boolean guess(int x, int y);

    void addShip(Ship ship);

    Grid getGrid();
}
