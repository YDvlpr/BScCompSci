package chess;

public class Main {

	public static void main(String[] args) {
		ChessPiece[][] board = new ChessPiece[8][8];
		
		String[] backRow = {"Rook", "Knight", "Bishop", "Queen", "King", "Bishop", "Knight", "Rook"};
		
		// placing black pieces
		for(int i = 0; i < 8; i++) {
			board[0][i] = new ChessPiece(backRow[i], "Black");
			board[1][i] = new ChessPiece("Pawn","Black");
		}
		
		// placing white pieces
		for(int i = 0; i < 8; i++) {
			board[7][i] = new ChessPiece(backRow[i], "White");
			board[6][i] = new ChessPiece("Pawn", "White");
		}
		
		// print the board
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				if(board[row][col] != null) {
					System.out.print(board[row][col] + " ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}

}
