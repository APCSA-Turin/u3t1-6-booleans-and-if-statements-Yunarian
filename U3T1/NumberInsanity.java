package U3T1;
import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }


   // helper method that returns string containing message to be printed
   private String result(int num) {
        boolean isOdd = num % 2 == 1;
        boolean isDivisibleBy5 = num % 5 == 0;
        boolean isDivisibleBy7 = num % 7 == 0;

        if (num < 0) {
            return "That's not a positive number!!!!";
        
        // for odd numbers
        } else if (isDivisibleBy5 & isDivisibleBy7) {
            return "Divisible by 5 and 7!!";

        } else if (isDivisibleBy7) {
            return "Divisible by 7!!";
        
        // for even numbers
        } else if (isOdd) {
            return "Is not divisible by 5 or 7";
            
        } else if (num >= 100) {
            return "Big even number!!";

        } else if (num >= 50) {
            return "Medium even number!!";

        } else {
            return "Small even number!!";

        }
    
       // complete the code for this method;
       // make no other changes to the program
   }
}

