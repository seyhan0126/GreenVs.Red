package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.NextGenerations.nextGeneration;
import static com.company.PrintGrid.printGrid;
import static com.company.Rules.rules;

public class Main {
    //    private static int[][] grid =
//            {{0, 0, 0},
//                    {1, 1, 1},
//                    {0, 0, 0}};
    //static grid variable
    private static int[][] grid =
            {       {1, 0, 0, 1},
                    {1, 1, 1, 1},
                    {0, 1, 0, 0},
                    {1, 0, 1, 0}
            };

    public static void main(String[] args) {
        //info for the example
        System.out.println("4, 4 (4x4) Grid");
        //printing the grid
        printGrid(grid);
        System.out.println();
        //variables for counting by looping the count of green cells in the 2,2 cell greens after each loop
        // x value
        int x =2;
        // y value
        int y=2;
        // looping value
        int n=15;
        // printing information for values which we input
        System.out.println(x + ", " + y + ", " + n);
        // printing the result
        // bellow of the console u find the result
        System.out.println("\n The result is: "+countOfGreenCellGenerations(x,y,n));
        System.out.println("#Expected result i guess :)");
    }

    // method count how many green cells have a cell
    public static int countOfGreenCellGenerations(int x, int y, int n) {
        int counter = (grid[y][x] == 1) ? 1 : 0;
        for (int i = 0; i < n; i++) {
            // looping new grid
            grid = nextGeneration(grid);
            System.out.println();
            printGrid(grid);
            // if the grid contains 1 in the cell we add and sum
            if (grid[y][x]==1){
                counter++;
            }
        }
        // returning sum
        return counter;
    }



}
