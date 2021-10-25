package com.tictactoegame;

import java.util.Scanner;

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

    // UC2-Player to choose X or O
    public char player;
    public char computer;
    public void playerInput() {
        System.out.print("Enter for player X or O - ");
        Scanner scanInput = new Scanner(System.in);
        char getUserInput = scanInput.next().charAt(0);

        if (getUserInput == 'X' || getUserInput == 'O') {
            if (getUserInput == 'X') {
                this.player = 'X';
                this.computer = 'O';
            } else {
                this.player = 'O';
                this.computer = 'X';
            }
        } else {
            System.out.println("Invalid Input");
            playerInput();
        }
        System.out.println("Player Select - " + this.player + " Computer Select - " + this.computer);
    }
}