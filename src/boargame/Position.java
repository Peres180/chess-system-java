package boargame;

public class Position {
	
	private int row;
	private int collum;
	
	public Position() {
		
	}

	public Position(int row, int collum) {
		this.row = row;
		this.collum = collum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollum() {
		return collum;
	}

	public void setCollum(int collum) {
		this.collum = collum;
	}

	@Override
	public String toString() {
		return row + ", " + collum;
	}
	

}
