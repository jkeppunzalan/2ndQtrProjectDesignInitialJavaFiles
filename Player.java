public class Player {
    private String name;
    private int wins, losses;
    private double winRate;

    public Player(String n){
      name = n;
      wins = 0;
      losses = 0;
      winRate = 0.0;
    }

    public String getName(){
        return name;
    }
    public int getWins(){
      return wins;
    }
    public int getLosses(){
      return losses;
    }
    public double getWinRate(){
      return winRate;
    }
    public void setname(Player p, String newName){
       p.name = newName;
    }
    public void processResult(){
      //add a wins or a loss to the player’s record depending on the results of the match
      
    }
}