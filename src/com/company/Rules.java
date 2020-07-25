package com.company;

public class Rules {
    //initial values for rules
    public static int rules(int currentCellValue, int greenNeighbours) {
        // the initial value is 0
        int newCellValue = 0;
        // if the green neighbour is in cell
        if ((greenNeighbours == 2 || greenNeighbours == 3 || greenNeighbours == 6) && currentCellValue == 1) {
            newCellValue = 1;
        }
        // if the green neighbour is in cell
        if ((currentCellValue == 0) && (greenNeighbours == 3 || greenNeighbours == 6))
            newCellValue = 1;

        return newCellValue;
    }
}
