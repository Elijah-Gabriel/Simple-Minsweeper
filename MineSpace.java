import java.util.Random;

public class MineSpace
{
  Random r = new Random();
  
  private boolean Selected;
  private boolean IsaMine;
  private int SurroundingMines;
  
  public MineSpace()
  {
    this.Selected = false;
    
    if(r.nextInt(2) == 0)
    {
      this.IsaMine = false;
    }
    if(r.nextInt(2) ==1)
    {
      this.IsaMine = true;
    }
    this.SurroundingMines = 0;
  }
  
  public MineSpace(boolean aSelected, boolean aIsaMine, int aSurroundingMines)
  {
    this.setSelected(aSelected);
    this.setIsaMine(aIsaMine);
    this.setSurroundingMines(aSurroundingMines);
  }
  public boolean getSelected()
  {
    return this.Selected;
  }
  public boolean getIsaMine()
  {
    return this.IsaMine;
  }
  public int getSurroundingMines()
  {
    return this.SurroundingMines;
  }
  
  public void setSelected(boolean aSelected)
  {
     this.Selected = aSelected;
  }
  public void setIsaMine(boolean aIsaMine)
  {
    if(r.nextInt(2) == 0)
    {
      this.IsaMine = false;
    }
    else 
    {
      this.IsaMine = true;
    }
  }
  
  public void setSurroundingMines(int aSurroundingMines)
  {
    if(aSurroundingMines > 0)
    {
      this.SurroundingMines=aSurroundingMines;
    }
  }
}
  
      
                   
    
  