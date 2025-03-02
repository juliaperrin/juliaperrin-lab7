public class TypeB extends Thing {
   private int timeSinceLast = 0;
   
   public TypeB(int row, int col, char lab) {
      super(row, col, lab); //call constructor of parent class
   }
   
   @Override
   public void maybeTurn(Random rand) {
      timeSinceLast++;
      if (timeSinceLast == 10) {
          timeSinceLast = 0;
          int decision = rand.nextInt(3);
          if (decision == 1) {
             rightTurn();
          } else if (decision == 2) {
             leftTurn();
          }
      }
   }
}
          