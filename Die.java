public class Die {

    private int side;
    private int dieTypeRandom1;
    private int dieType;
    private int x;
    private int green;
    private int yellow;


    public Die(){
        x=13;
        green=6;
        yellow=10;
    }

    public int getSide() {
        return side;
    }

    public int getType() {
        if (dieTypeRandom1 <= green){
      dieType = 1;
      return dieType;
    }
      else if (dieTypeRandom1 <= yellow){
      dieType = 2;
      return dieType;
    }
      else{
      dieType = 3;
    }
      return dieType;
    }

    public void setDieType(int myType){
        dieType = myType;
        if (dieType == 1){
            dieTypeRandom1 = green;
        }
        else if(dieType <=2){
            dieTypeRandom1 = yellow;
        }
        else{
            dieTypeRandom1 = x;
        }
    }

    public void roll(){
        side = (int) (Math.random()*6 +1);
        dieTypeRandom1 = (int) (Math.random()*x +1);
        if (dieTypeRandom1 <= green && side<=4){
            /*the number of total dice goes down, as well as the color rolled
            removes a die of that color from the game
             */
            green--;
            yellow--;
            x--;
      }
        else if (dieTypeRandom1 <= yellow && side<=4) {
            yellow--;
            x--;
      }
        else if (dieTypeRandom1 <= x && side<=4){
            x--;
      }
    }
    public void stop(){
        //resets everything
        x=13;
        green=6;
        yellow = 10;
    }

    public void rollSide(){
        //rolls the same die again, doesn't change the color
        side = (int) (Math.random()*6 +1);
        if (dieTypeRandom1 <= green && side<=4){
            green--;
            yellow--;
            x--;
        }
        else if (dieTypeRandom1 <= yellow && side<=4) {
            yellow--;
            x--;
        }
        else if (dieTypeRandom1 <= x && side<=4){
            x--;
        }
    }

}
