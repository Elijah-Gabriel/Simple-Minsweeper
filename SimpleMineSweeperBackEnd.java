public SimpleMineSweeperBackEnd
{
  private MineSpace[][] Spaces;
  private static final int SPACE_AMT=5; 
  private numNotMinesLeft;
  private boolean gameOver;
  private boolean win;
   
  int x = 0;
  int y=0;
  public void resetSpaces()
  {
    int count = 0;
    for(int i =0;i<SPACE_AMT;i++)
    {
      for(int j=0;j<SPACE_AMT;j++)
      {
      Spaces[i][j] = new MineSpace();
      if(Spaces[i][j].getIsaMine() = true)
      {
        count++;
      }
           
    }
  }
}
  private int numbermines(x,y)
  {
    count = 0;
    if(Spaces[x+1][y].IsaMine
         {
      count++
}