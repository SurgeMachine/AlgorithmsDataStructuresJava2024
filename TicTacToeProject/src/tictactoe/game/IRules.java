package TicTacToeProject.src.tictactoe.game;

public interface IRules {
    boolean checkWin(char[][] board, char symbol);
}