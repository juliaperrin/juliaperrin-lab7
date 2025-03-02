import java.util.*;
public class TypeC extends Thing {
   
   private boolean switchDirection = true;
   
   public TypeC(int row, int col, char lab) {
      super(row, col, lab);
   }
   
   @Override
   public void maybeTurn(Random rand) {
      if (switchDirection) {
         rightTurn();
      } else {
         leftTurn();
      }
      switchDirection = !switchDirection; //switch the direction of the turn each time to create zigzag pattern
   }
}