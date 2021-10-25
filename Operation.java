package com.tictactoegame;
public class Operation {
    // UC1-Create Tic Tac Toe Game Board
    public static void printGameBoard(char [][] gameBoard) {
        for(char[] row :gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}