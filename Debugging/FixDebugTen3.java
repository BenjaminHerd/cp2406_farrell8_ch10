// A PhoneBook is a Book with a city

//import statement for Java option pane
import javax.swing.*;
public class FixDebugTen3
{
   public static void main(String[] args)
   {
      //variable declaration
      String area, inStr;
      int pages;

      //Variable assigned to result of input dialog box
      area = JOptionPane.showInputDialog(null, 
         "Enter city for phone book");

      //same deal here
      inStr = JOptionPane.showInputDialog(null, 
         "Enter number of pages in " + area + "'s phone book");

      //Changes input String to an integer
      pages = Integer.parseInt(inStr);

      //variable assigned to results of the class call
      FixDebugPhoneBook pb = new FixDebugPhoneBook(pages, area);

      //.display() to display results of class call
      pb.display();
   }
}