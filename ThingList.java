import java.util.*;
public class ThingList {
   private class Node {
      Thing data;
      Node next;
      Node(Thing t) {
         data = t;
         next = null;
      }
   }
   
   private Node head;
   
   public void addThing(Thing t) {
      Node newDot = new Node(t);
      newDot.next = head;
      head = newDot;
   }
   
   public void moveAll(Random rand) {
      Node currentDot = head;
      while (currentDot != null) {
         currentDot.data.maybeTurn(rand);
         currentDot.data.step();
         currentDot = currentDot.next;
      }
   }
   
   public void printAll() {
      Node currentDot = head;
      while (currentDot != null) {
         System.out.println(currentDot.data);
         currentDot = currentDot.next;
      }
      System.out.println("done");
      System.out.flush();
   }
}
      