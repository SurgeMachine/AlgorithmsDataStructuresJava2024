package TicTacToeProject.src.tictactoe.players;

public class Human implements Player {
    private final String name;
    private char symbol;

    public Human(String name, char symbol) {
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
}