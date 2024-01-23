import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random ran = new Random();
        int secret=ran.nextInt(100)+1;
        int minlimit=1;
        int maxlimit=100;
        int maxtrials=5;
        int guess;
        System.out.println("**********WELCOME TO NUMBER GUESSING GAME***********");
        System.out.println("TRY TO GUESS THE RANDOM NUMBER BETWEEN " +minlimit+ "to" +maxlimit);
        System.out.println("You have " +maxtrials+ " trials");
        while(maxtrials>0)
        {
            System.out.println("Enter your number!\n");
            guess=sc.nextInt();
            if(guess<0 && guess==0)
            {
                System.out.println("Invalid input!!!");
            }
            else if(guess==secret)
            {
                System.out.println("Congratulations you have guessed the correct number!!!");
                break;
            }
            else if(guess>secret)
            {
                System.out.println("Input number is too high,try again!");
                 System.out.println("You have " +(maxtrials-1)+ " trials left!");
		maxtrials--;
            }
            else if(guess<secret)
            {
                System.out.println("Input number is too low,try again!");
               System.out.println("You have " +(maxtrials-1)+ " trials left!");
		maxtrials--;            
		}
            if(maxtrials==0 && guess!=secret)
            {
                System.out.println("Sorry you have reached the maximum limits of attempts");
                System.out.println("The random number is " +secret);
            } 

        }


    }
}
