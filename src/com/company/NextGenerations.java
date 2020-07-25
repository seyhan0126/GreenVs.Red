package com.company;

import java.util.ArrayList;

import static com.company.FindCountOfNeighbours.findCountOfGreenCells;
import static com.company.GetNeighbours.getNeighbours;
import static com.company.Rules.rules;

// next generation
public class NextGenerations {
    public static int[][] nextGeneration(int[][] grid) {
        int rowSize = grid.length;// row size of grid
        int colSize = grid[0].length;// column size of grid
        ArrayList list = new ArrayList();
        // creating next generation
        int[][] newGenerationGrid = new int[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                //looping in list
                list = getNeighbours(i, j, grid);
                // storing the count of greens
                int countGreenCells = findCountOfGreenCells(list);
                //and giving rules that we add 1 in green cells
                newGenerationGrid[i][j] = rules(grid[i][j], countGreenCells);
            }
        }
        return newGenerationGrid;
    }
}
