import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());

   
  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    ThingList listOfThings = new ThingList(); //add thing list
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        listOfThings.addThing(new TypeA(45, 50, 'o')); //Add TypeA thing to list
        listOfThings.addThing(new TypeB(55, 50, 'b')); //Adds TypeB thing
        listOfThings.addThing(new TypeC(50, 50, 'm')); //Adds magenta TypeC thing
      }

      // Print out each thing.
      // (SEEMS LIKE A NICE PRINTALL() METHOD CALL WOULD WORK HERE)
      // (SEEMS LIKE A toString() METHOD IN THE CLASS WOULD ALSO BE NICE)
      
      listOfThings.printAll();
      
      // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
      listOfThings.moveAll(rand);
      count++;
    }
  }
}
