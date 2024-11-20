package TicTacToeProject.src.tictactoe.players;

import java.util.Random;

public class AI implements Player {
    private final String name;
    private char symbol;

    public AI(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    public int[] makeMove(char[][] board) {
        int[] winningMove = findWinningMove(board, symbol);
        if (winningMove != null) {
            return winningMove;
        }

        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (board[row][col] != ' ');
        return new int[]{row, col};
    }

    private int[] findWinningMove(char[][] board, char symbol) {
        for (int row = 0; row < 3; row++) {
            int count = 0, emptyCol = -1;
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == symbol) {
                    count++;
                } else if (board[row][col] == ' ') {
                    emptyCol = col;
                }
            }
            if (count == 2 && emptyCol != -1) {
                return new int[]{row, emptyCol};
            }
        }

        for (int col = 0; col < 3; col++) {
            int count = 0, emptyRow = -1;
            for (int row = 0; row < 3; row++) {
                if (board[row][col] == symbol) {
                    count++;
                } else if (board[row][col] == ' ') {
                    emptyRow = row;
                }
            }
            if (count == 2 && emptyRow != -1) {
                return new int[]{emptyRow, col};
            }
        }

        int count = 0, emptyRow = -1, emptyCol = -1;
        for (int i = 0; i < 3; i++) {
            if (board[i][i] == symbol) {
                count++;
            } else if (board[i][i] == ' ') {
                emptyRow = i;
                emptyCol = i;
            }
        }
        if (count == 2 && emptyRow != -1) {
            return new int[]{emptyRow, emptyCol};
        }

        count = 0;
        emptyRow = -1;
        emptyCol = -1;
        for (int i = 0; i < 3; i++) {
            if (board[i][2 - i] == symbol) {
                count++;
            } else if (board[i][2 - i] == ' ') {
                emptyRow = i;
                emptyCol = 2 - i;
            }
        }
        if (count == 2 && emptyRow != -1) {
            return new int[]{emptyRow, emptyCol};
        }

        return null;
    }
}