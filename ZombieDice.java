public class ZombieDice
{
  Die d1 = new Die();
  private int brains;
  private int shots;
  private int side;
  private int color;
  private int totalBrains;
  private int counter;


  public ZombieDice(){
    side = d1.getSide();
    color = d1.getType();
    counter = 0;

  }
  public int getBrains(){
    return brains;
  }
  public int getTotalBrains(){
    return totalBrains;
  }

  public int getShots(){
    return shots;
  }
  public int getSide(){
    return side;
  }
  public int getColor(){
    return color;
  }
  public void setColor(int myColor){
    color = myColor;
    d1.setDieType(color);
  }


  public void findDieFace(){
    //figures out if a brain or a shotgun was rolled and to the count of the type
    if (color ==1){
      counter++;
      if (side <= 3)
      brains= brains + 1;
      else if (side <=4)
      shots= shots + 1;
  }
    else if (color <=2){
      counter++;
      if (side <= 2)
      brains= brains + 1;
      else if (side <=4)
      shots= shots + 1;
  }
    else{
      counter++;
      if (side == 1)
      brains= brains + 1;
      else if (side <=4)
      shots= shots + 1;
  }
}

  public void rollZombie(){
    //gets a new die and rolls
    d1.roll();
    color = d1.getType();
    side = d1.getSide();
  }

  public void rollOnlySide(){
    //rolls the same die again
    d1.rollSide();
    side = d1.getSide();
  }

  public void endTurn(){
    // resets everything
    if (shots < 3 && counter % 3 == 0) {
      totalBrains += brains;
    }
    d1.stop();
    shots = 0;
    brains = 0;
  }
  public void resetTotal(){
    totalBrains = 0;
  }


}
