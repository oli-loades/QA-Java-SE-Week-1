package models;

public class Player implements Playable {
    private Grid grid;

    public Player(Grid grid) {
        this.grid = grid;
    }

    @Override
    public boolean guess(int x, int y) {
        return false;
    }

    @Override
    public void addShip(Ship ship) {
        grid.addShip(ship);
    }

    @Override
    public Grid getGrid() {
        return grid;
    }
}
