import java.util.Scanner;
import java.util.Random;

public class HiLo {
   public static void main(String args[]){
      System.out.println("Välkommen till HiLo!\nVilken svårhetsgrad?");
      System.out.print("1.Lätt   (1-10) \n2.Mellan (1-100) \n3.Svårt  (1-1000) \n");

      Scanner in = new Scanner(System.in);
      
      int input = in.nextInt();
      
      if (input == 1){
         System.out.println("Du lyckades på " + playGame(10) + "försök");
      } else if (input == 2){
         System.out.println("Du lyckades på " + playGame(100) + "försök");
      } else if (input == 3) {
         System.out.println("Du lyckades på " + playGame(1000) + " försök");
      } else {
         System.out.println("Svårhetsgraden finns tyvärr inte.");
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
         
            System.out.println("Gissa på ett tal mellan 1 och " + maxNumber);
         
            guess = in.nextInt();
            giveResponse(number, guess);
         }         
         
         return guessTry;
     } 
     
     public static void giveResponse(int answer, int guess){
         if (answer == guess){
            System.out.println("Helt rätt!");
         } else if (answer < guess){
            System.out.println("Gissningen var för hög");
         } else {
            System.out.println("Gissningen var för låg");
         }
     }
     
}