package models;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private int x;
    private int y;
    private List<Ship> ships;

    private boolean grid[][];

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
        ships = new ArrayList<>();
        grid = new boolean[y][x];
        initGrid();
    }

    private void initGrid() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                grid[j][i] = false;
            }
        }
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

    public boolean addShip(Ship ship) {
        boolean isAdded = false;

        if (isValidMove(ship) && !isOccupied(ship)) {

            isAdded = true;
            int shipX = ship.getX() - 1;
            int shipY = ship.getY() - 1;

            for (int i = 0; i < ship.getSize(); i++) {
                switch (ship.getDir()) {
                    case NORTH:
                        grid[shipY + i][shipX] = true;
                        break;
                    case EAST:
                        grid[shipY][shipX + i] = true;
                        break;
                    case SOUTH:
                        grid[shipY - i][shipX] = true;
                        break;
                    case WEST:
                        grid[shipY][shipX - i] = true;
                        break;
                }
            }

            ships.add(ship);

        }
        return isAdded;
    }

    private boolean isValidMove(Ship ship) {
        boolean isValid = false;
        switch (ship.getDir()) {
            case NORTH:
                if (ship.getY() +
                        ship.getSize() - 1 <= y) {
                    isValid = true;
                }
                break;
            case EAST:
                if (ship.getX() +
                        ship.getSize() - 1 <= x) {
                    isValid = true;
                }
                break;
            case SOUTH:
                if (ship.getY() -
                        ship.getSize() + 1 > 0) {
                    isValid = true;
                }
                break;
            case WEST:
                if (ship.getX() -
                        ship.getSize() + 1 > 0) {
                    isValid = true;
                }
                break;
        }
        return isValid;
    }

    private boolean isOccupied(Ship ship) {
        boolean occupied = false;
        int shipX = ship.getX() - 1;
        int shipY = ship.getY() - 1;
        for (int i = 0; i < ship.getSize(); i++) {
            switch (ship.getDir()) {
                case NORTH:
                    if (grid[shipY + i][shipX] == true) {
                        occupied = true;
                    }
                    break;
                case EAST:
                    if (grid[shipY][shipX + i] == true) {
                        occupied = true;
                    }
                    break;
                case SOUTH:
                    if (grid[shipY - i][shipX] == true) {
                        occupied = true;
                    }
                    break;
                case WEST:
                    if (grid[shipY][shipX - i] == true) {
                        occupied = true;
                    }
                    break;
            }
        }
        return occupied;
    }

    public String printGrid() {
        String g="";
        for (int i = x-1; i >= 0; i--) {
            for (int j = 0; j < y; j++) {
                g += grid[i][j] + " ";
            }
            g += "\n";
        }

        return g;
    }
}
