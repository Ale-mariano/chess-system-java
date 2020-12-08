package application;

import boardagame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		
		Board board = new Board (8, 8, 0);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}
	
}
