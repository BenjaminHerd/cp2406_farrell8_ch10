public class FixDebugPlay
{
   public String title;
   protected String author;

   public FixDebugPlay(String title, String author)
   {
      //Since declared in class parameters, must refer to as this.title, this.author
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}