package com.tictactoegame;

public class TicTacToeGame {
    public static void main(String[] args) {
        Operation printBoard = new Operation();
        char [][] gameBoard = {{' ','|',' ','|',' ' },
                               {'-','+','-','+','-' },
                               {' ','|',' ','|',' ' },
                               {'-','+','-','+','-' },
                               {' ','|',' ','|',' ' }};
        printBoard.printGameBoard(gameBoard);
        printBoard.playerInput();
    }
}
