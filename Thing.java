import java.util.*;
public abstract class Thing {
   protected int row, col, dir;
   protected char lab;
   
   public Thing(int row, int col, char lab) {
      this.row = row;
      this.col = col;
      this.lab = lab;
      this.dir = 0;
   }  
   
   public abstract void maybeTurn(Random rand);
   
   public void rightTurn() {  
      dir = (dir + 1) % 4; 
   }
   
   public void leftTurn() {
      dir = (dir + 3) % 4;
   }
   
   public void step() {
      int [] dc = {0, 1, 0, -1};
      int [] dr = {1, 0, -1, 0};
      row += dr[dir];
      col += dc[dir];
   }
   
   @Override
   public String toString() {
      return row + " " + col + " " + lab;
   }
}
   
   