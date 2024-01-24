public class Move {
	private final String type;
	
	public Move(String t){
		type = t;
	}
	public String getType(){
		return type;
	}
	public void movePiece(Piece p, String newRow, String newCol) throws NonexistentSquareException {
		p.setCurrentRow(newRow);
		p.setCurrentCol(newCol);
   	if(!(board.searchRow(p) && board.searchCol(p))){
			throw new NonexistentSquareException("That square does not exist");
   	}
		if(newRow == "8"){
			p.promote();
		}
	}
}