import java.util.ArrayList;

public class Board {
	// the board is represented by a 2D array of strings
	private String[][] board;
	private final String[] rows = {"1","2","3","4","5","6","7","8"};
	private final String[] cols = {"a","b","c","d","e","f","g","h"};

	public Board(){
		board = new String[8][8];
		for(int i=7; i>=0; i--){
			for(int j=0; j<8; j++){
				board[i][j] = cols[j] + rows[i];
			}
		}
	}

	public boolean searchRow(Piece p){
		boolean found = false;
		for(int i=0; i<8; i++){
			if(board[p.getCurrentRow()][i].equals(p.getCurrentRow())){
				found = true;
			}
		}
		if(found){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean searchCol(Piece p){
		boolean found = false;
		for(int i=0; i<8; i++){
			if(board[p.getCurrentCol()][i].equals(p.getCurrentCol())){
				found = true;
			}
		}
		if(found){
			return true;
		}
		else {
			return false;
		}
	}
}

