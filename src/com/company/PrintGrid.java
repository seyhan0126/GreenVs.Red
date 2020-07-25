package com.company;

public class PrintGrid {
    public static void printGrid(int[][] grid) {
        // we just loop the grid and print it by row and column iteration
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
