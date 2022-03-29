import java.util.Scanner;
import java.util.Random;

public class HiLo {
   public static void main(String args[]){
      System.out.println("V�lkommen till HiLo!\nVilken sv�rhetsgrad?");
      System.out.print("1.L�tt   (1-10) \n2.Mellan (1-100) \n3.Sv�rt  (1-1000) \n");

      Scanner in = new Scanner(System.in);
      
      int input = in.nextInt();
      
      if (input == 1){
         System.out.println("Du lyckades p� " + playGame(10) + "f�rs�k");
      } else if (input == 2){
         System.out.println("Du lyckades p� " + playGame(100) + "f�rs�k");
      } else if (input == 3) {
         System.out.println("Du lyckades p� " + playGame(1000) + " f�rs�k");
      } else {
         System.out.println("Sv�rhetsgraden finns tyv�rr inte.");
      }
      
     }
     
     public static int playGame(int maxNumber){
         int guessTry = 0;
         int guess = -1;
         Scanner in = new Scanner(System.in);
     
         Random rand = new Random();
         
         int number = (int)(Math.random()* maxNumber) + 1;
         
         while(number != guess){
         
            guessTry++;
         
            System.out.println("Gissa p� ett tal mellan 1 och " + maxNumber);
         
            guess = in.nextInt();
            giveResponse(number, guess);
         }         
         
         return guessTry;
     } 
     
     public static void giveResponse(int answer, int guess){
         if (answer == guess){
            System.out.println("Helt r�tt!");
         } else if (answer < guess){
            System.out.println("Gissningen var f�r h�g");
         } else {
            System.out.println("Gissningen var f�r l�g");
         }
     }
     
}