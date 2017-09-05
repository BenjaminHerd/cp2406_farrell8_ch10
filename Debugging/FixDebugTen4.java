// A customer's purchase is approved if the
// purchase does not exceed the credit limit
public class FixDebugTen4
{
   public static void main(String args[])
   {
      //variable declaration
      int id = 12241;
      String name = "Franklin";
      double credit = 1000.00;
      double purchase = 1325.77;

      //class call assigning a variable to results
      FixDebugCustomerMakingPurchase cust = new
         FixDebugCustomerMakingPurchase(id, name, credit, purchase);

      //.display() method to show results of variable from class call
      cust.display();
   }
}