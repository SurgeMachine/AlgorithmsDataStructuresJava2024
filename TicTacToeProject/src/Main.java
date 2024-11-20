package TicTacToeProject.src;

import TicTacToeProject.src.tictactoe.players.Human;
import TicTacToeProject.src.tictactoe.players.AI;
import TicTacToeProject.src.tictactoe.players.Player;
import TicTacToeProject.src.tictactoe.game.TicTacToe;
public class Main {
    public static void main(String[] args) {
        Player player1 = new AI("Игрок 1", 'X');
        Player player2 = new AI("Компьютер", 'O');
        TicTacToe game = new TicTacToe(player1, player2);
        game.playGame();
    }
}