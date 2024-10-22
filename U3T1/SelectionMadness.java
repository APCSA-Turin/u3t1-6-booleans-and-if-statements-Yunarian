package U3T1;
public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
      
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
      int selectedFortune = (int) (Math.random() * 5) + 1;
      if (selectedFortune == 1) {
         return "Today will be a nice day.";

      } else if (selectedFortune == 2) {
         return "Perhaps today will be good";

      } else if (selectedFortune == 3) {
         return "Who knows what your fortune is";

      } else if (selectedFortune == 4) {
         return "This day doesn't look too good for you";

      } else {
         return "Prepare for the worst";

      }
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3 */
    public int largest(int num1, int num2, int num3) {
       if (num1 >= num2 && num1 >= num3) {
         return num1;

       } else if (num2 >= num1 && num2 >= num3) {
         return num2;

       } else {
         return num3;

       }
    }

      /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
   public boolean rightTriangle(int side1, int side2, int side3) {
      int largestNum = largest(side1, side2, side3);
      double sumOfSidesSquared = Math.pow(side1,2) + Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(largestNum, 2);

      if (sumOfSidesSquared == Math.pow(largestNum, 2)) {
         return true;
      }
      return false;
   }
  
  }
  
