package com.company;

import java.util.ArrayList;

public class GetNeighbours {
    public static ArrayList<Integer> getNeighbours(int i, int j, int[][] grid) {
        // making an arraylist where we get neighbours
        // in which cells are they and we add them
        ArrayList<Integer> neighbours = new ArrayList<>();
        if (i != grid.length - 1)
            neighbours.add(grid[i + 1][j]);

        if (i != grid.length - 1 && j != grid[0].length - 1)
            neighbours.add(grid[i + 1][j + 1]);

        if (j != grid[0].length - 1)
            neighbours.add(grid[i][j + 1]);
        if (i != 0) {
            neighbours.add(grid[i - 1][j]);
        }
        if (i != 0 && j != grid[0].length - 1)
            neighbours.add(grid[i - 1][j + 1]);

        if (i != grid.length - 1 && j != 0)
            neighbours.add(grid[i + 1][j - 1]);

        if (j != 0)
            neighbours.add(grid[i][j - 1]);
        if (i != 0 && j != 0)
            neighbours.add(grid[i - 1][j - 1]);

        return neighbours;
    }

}
