// A Play has a title and author
// A Musical is a Play that also has a composer

public class FixDebugTen1
{
   public static void main(String args[])
   {
      //Line calls a class with a variable assigned to the results
      // 'new' word instantiates the new variable to be created from the call
      FixDebugPlay performance1 = new
        FixDebugPlay("Death of a Salesman", "Arthur Miller");
      FixDebugMusical performance2 = new
        FixDebugMusical("Guys and Dolls", "Jo Swerling", "Frank Loesser");

      //.display() function call to display variable from class call
      performance1.display();
      performance2.display();
   }
}
