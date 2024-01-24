import java.util.ArrayList;

public class Piece {
  private final String name, type;
  private final String initialRow, initialCol;
  private final String currentRow, currentCol;
  private ArrayList<Board> possibleMoves;
  private Player owner;
  
  public Piece(String n, String r, String c, Player p){
    name = n;
    type = "regular";
    initialRow = r;
    initialCol = c;
    currentRow = r;
    currentCol = c;
    possibleMoves = new ArrayList<Board>();
    owner = p;
  }

  public String getName(){
    return name;
  }
  public String getCurrentRow(){
    return currentRow;
  }
  public String getCurrentCol(){
    return currentCol;
  }
  public void setCurrentRow(String newRow){
    currentRow = newRow;
  }
  public void setCurrentCol(String newCol){
    currentCol = newCol;
  }
  public void promote(){
    type = "king";
    System.out.println(name + " has been promoted to a king!");
  }
}