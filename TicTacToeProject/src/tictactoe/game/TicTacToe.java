package TicTacToeProject.src.tictactoe.game;

import TicTacToeProject.src.tictactoe.players.Player;
import TicTacToeProject.src.tictactoe.players.Human;
import TicTacToeProject.src.tictactoe.players.AI;
import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Rules rules;

    public TicTacToe(Player player1, Player player2) {
        board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
        rules = new Rules();
    }

    public void playGame() {
        boolean gameEnded = false;
        while (!gameEnded) {
            board.printBoard();
            int[] move = getMove();
            board.placeSymbol(move[0], move[1], currentPlayer.getSymbol());

            if (rules.checkWin(board.getBoard(), currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println("Победил игрок: " + currentPlayer.getName());
                gameEnded = true;
            } else if (board.isFull()) {
                board.printBoard();
                System.out.println("Ничья!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }

    private int[] getMove() {
        if (currentPlayer instanceof Human) {
            return getHumanMove();
        } else if (currentPlayer instanceof AI) {
            return ((AI) currentPlayer).makeMove(board.getBoard());
        }
        return new int[]{0, 0};
    }

    private int[] getHumanMove() {
        Scanner scanner = new Scanner(System.in);
        int row = -1, col = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Ход " + currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ")");
                System.out.print("Введите строку (0, 1, или 2): ");
                row = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите столбец (0, 1, или 2): ");
                col = Integer.parseInt(scanner.nextLine());

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board.isCellEmpty(row, col)) {
                    validInput = true;
                } else {
                    System.out.println("Некорректный ход или ячейка занята. Попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите целое число от 0 до 2. Попробуйте снова.");
            }
        }

        return new int[]{row, col};
    }
}