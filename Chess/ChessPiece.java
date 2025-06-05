package chess;

public class ChessPiece {
    private String type;
    private String color;
    private char symbol;

    public ChessPiece(String type, String color) {
        this.type = type;
        this.color = color;
        this.symbol = getUnicodeSymbol(type, color);
    }

    private char getUnicodeSymbol(String type, String color) {
        return switch (type) {
            case "King"   -> color.equals("White") ? '\u2654' : '\u265A';
            case "Queen"  -> color.equals("White") ? '\u2655' : '\u265B';
            case "Rook"   -> color.equals("White") ? '\u2656' : '\u265C';
            case "Bishop" -> color.equals("White") ? '\u2657' : '\u265D';
            case "Knight" -> color.equals("White") ? '\u2658' : '\u265E';
            case "Pawn"   -> color.equals("White") ? '\u2659' : '\u265F';
            default       -> '?';
        };
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
