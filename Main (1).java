public class Main {
  public static void main(String[] args){
    Move capture = new Move("capture");
    Move regularMove = new Move("regularMove");

    // scenario 1: initialization of board
    Board board = new Board();

    // scenario 2: piece gets promoted
    Player player1 = new Player("Player1");
    Piece h1 = new Piece("h1","1","h","1","h","Player1");

    regularMove.movePiece(h1,"8","g");

    
      

    // scenario 3: piece tries to move to an invalid position
    Player player2 = new Player("Player2");
    Piece a1 = new Piece("a1", "1", "a", "1", "a", "Player2");

    regularMove.movePiece(a1,"z","9");


      
  }
}