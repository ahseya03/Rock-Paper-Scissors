// Name:Ayesha Mahmood
// Date:6/16/2021
// Description: This is RPS non driver class that will make the functions for my main method class.
import java.util.*;
import java.io.*;
import java.util.Scanner; 

public class RPS {

   private int playerScore = 0;
   private int computerScore = 0;
   private int scoreBoard[]={0,0,0};

      
   public RPS() {}

   public int getPlayerScore() { 
      return playerScore;}
   public int getComputerScore() { 
      return computerScore;}

      
   public int getComputerChoice() {
      Random rand = new Random();
      return rand.nextInt(3);
   
   }
   
   public void findWinner(int num, String choice) {
      
    
      switch (num){
         case 0:
         
            String num1 = "rock";
            System.out.println("System chose Rock"); 
            if (choice.matches(num1)){
               System.out.println("Its a tie!");
               scoreBoard[1]++;
            
            }
            else if (choice.matches("paper")){
               System.out.println("You win!");
              
               scoreBoard[2]++;
            }
            else if (choice.matches("scissors")){
               System.out.println("You lose!");
            
               scoreBoard[0]++;
            }
            else {
               System.out.println();
               System.out.println("ERROR: Please choose Rock, Paper or Scissors");
            
            }
            break;
         case 1:
            String num2 = "paper";
            System.out.println("System chose Paper");
            if (choice.matches(num2)){
               System.out.println("Its a tie!");
               scoreBoard[1]++;
            
            }
            else if (choice.matches("scissors")){
               System.out.println("You win!");
               scoreBoard[2]++;
            }
            else if (choice.matches("rock")){
               System.out.println("You lose!");
               scoreBoard[0]++;
            }
            else {
               System.out.println();
               System.out.println("ERROR: Please choose Rock, Paper or Scissors");
            }
            break;
         case 2: 
            String num3 = "scissors";
            System.out.println("System chose Scissors");
            if (choice.matches(num3)){
               System.out.println("Its a tie!");
               scoreBoard[1]++;
            }
            else if (choice.matches("rock")){
               System.out.println("You win!");
               scoreBoard[2]++;
            }
            else if (choice.matches("paper")){
               System.out.println("You lose!");
               scoreBoard[0]++;
            }
            else {
               System.out.println();
               System.out.println("ERROR: Please choose Rock, Paper or Scissors");
            }
              
                  
      }
   }
   public void FileWriter()throws FileNotFoundException{
      PrintWriter outputFile = new PrintWriter("stats.txt");
      outputFile.println("You won " + scoreBoard[2] + " times");
      outputFile.println("Computer won "+ scoreBoard[0] +" times"); 
      outputFile.println("ties "+ scoreBoard[1] +" times");       
      outputFile.close();
   }

   
}
