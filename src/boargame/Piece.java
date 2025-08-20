package boargame;

public class Piece  {
	
	protected Position position;
	private Board board;
	
	public Piece(Position postion) {
		this.position = postion;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	

}
