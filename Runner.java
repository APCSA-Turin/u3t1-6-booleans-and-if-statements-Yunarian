import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();

     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!
     // responses 1 & 2 are positive, 3 & 4 are neutral, 5 & 6 are negative
     int randNum = (int) (Math.random() * 6) + 1;
     if (randNum == 1) {
        System.out.println("Without a doubt.");

     } if (randNum == 2) {
        System.out.println("Absolutely!");

     } if (randNum == 3) {
        System.out.println("Perchance.");

     } if (randNum == 4) {
        System.out.println("Maybe, or maybe not.");

     } if (randNum == 5) {
        System.out.println("Never");

     } if (randNum == 6) {
        System.out.println("Very unlikely occurance.");

     }
     scan.close();
   }
}
