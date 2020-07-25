package com.company;

import java.util.List;

public class FindCountOfNeighbours {
    public static int findCountOfGreenCells(List<Integer> list) {
        // here we search for the count of the green cells
        // and we give for initial value as first 0
        int countGreenNeighbours = 0;
        // we loop in list our neighbours
        for (int neighbor : list) {
            // if the cell is 1 we add green neighbour
            if (neighbor == 1)
                countGreenNeighbours++;
        }
        return countGreenNeighbours;
    }
}
