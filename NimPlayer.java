public class NimPlayer
{
  private int pieces;
  private boolean random;
  
  public NimPlayer(int piecesD)
  {
    pieces = piecesD;
  }
  public int play(int piecesLeft)
  {
    pieces = piecesLeft;
    if ((pieces%3) == 0)//checks to see if the number of pieces left is divisible by 3 to determine move
    {
      return 2;
    }
    else if ((pieces%3) == 2)//strategy: if the remainder of the number of pieces dvided by 3 is 2 then it should take 1 piece
    {
      return 1;
    }
    else//if the number of pieces isn't divisble by 3 and the remainder isn't 2, then it must be 1
    {
      random = (Math.random())>=(.05);//in this situation there is no "best move" so it picks randomly how many to take
      if (random == true)
      {
        return 2;
      }
      else
      {
        return 1;
      }
    }
  }
}