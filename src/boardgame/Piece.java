package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	//checks if it is possible for the piece to move to a given position.
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumns()];
		
	}
	public boolean isThereanyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat.length; j++) {
				if(mat[i][j]);
				return true;
			}
		}
		return false;
	}

}
