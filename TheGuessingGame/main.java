import java.util.Scanner;

public class main 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        //Declaration.
        int guessNum, randomNum;
        boolean continuePlay = true, inputCorrect = true, endGame = true;
        String replay;
        //Scanner input = new Scanner(System.in);
        
        //Start of the program.
        System.out.println("Let's play a guessing game!");
        System.out.println("");
        
        while(continuePlay)
        {
            //Random number generator.
            randomNum = (int)(Math.random() * 10) + 1;
            
            //Guess the number.
            System.out.println("I'm thinking of a number between 1 and 10.");
            System.out.print("What do you think it is: ");
            
            do
            {
                //User input the number.
                guessNum = input.nextInt();
                inputCorrect = true;
                
                if(guessNum < 0 || guessNum > 10) //If user input number less than 0 or more than 10.
                {
                    inputCorrect = false;
                    System.out.print("I said, between 1 and 10. Try again: ");
                }
            }
            while(!inputCorrect);
            
            if(guessNum == randomNum) //If user input number is same as random number.
            {
                System.out.println("You're right!");
                System.out.println("");
            }
            else
            {
                System.out.println("You're wrong! The number was " + randomNum);
                System.out.println("");
            }
            
            //Asking user if to play again or not.
            do
            {
                System.out.print("Play again?(Y or N): ");
                replay = input.next();
                System.out.println("");
                endGame = true;
                
                if(replay.equalsIgnoreCase("Y"))
                {
                    
                }
                else if(replay.equalsIgnoreCase("N"))
                {
                    continuePlay = false;
                }
                else
                {
                    endGame = false;
                }
            }
            while(!endGame);
            
            System.out.println("Thank you for playing.");
        }
    }
}
