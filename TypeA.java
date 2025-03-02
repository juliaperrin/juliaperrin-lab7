public class TypeA extends Thing {
   public TypeA(int row, int col, char lab) {
      suber(row, col, lab);
   }
   
   @Override
   public void maybeTurn(Random rand) {
      int decision = rand.nextInt(3);
      if (decision == 1) {
         rightTurn();
      } else if (decision == 2) {
         leftTurn();
      }
   }
}