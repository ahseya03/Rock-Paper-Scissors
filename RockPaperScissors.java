// Name:Ayesha Mahmood
// Date:6/3/2021
// Description: This is my main class where usr will play with the computer rock paper sccisors game.
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class RockPaperScissors 
{
   public static void main(String args[]) throws IOException
   {
      String choice, choice1;
      String userInput; 
      int num = 0;
      RPS controller = new RPS();
      do{
                                
         num = controller.getComputerChoice();
         System.out.println("Choose: Rock, Paper or Scissors.");
         Scanner userChoice = new Scanner(System.in);
         choice1 = userChoice.next();
         choice = choice1.toLowerCase();
         controller.findWinner(num, choice);
      
         System.out.println("Do you want to continue, yes or no?");
              
         userInput = userChoice.next();
         userInput = userInput.toLowerCase();
      
      }while(userInput.equals("yes"));
      try{
      
         controller.FileWriter();  
      }
      catch(FileNotFoundException e){
         System.out.println("file was not found");
      }
   }
}

