package TicTacToeProject.src.tictactoe.game;

public interface IBoard {
    void initializeBoard();
    boolean isCellEmpty(int row, int col);
    void placeSymbol(int row, int col, char symbol);
    boolean isFull();
    char[][] getBoard();
    void printBoard();
}