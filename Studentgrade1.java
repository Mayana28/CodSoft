import java.util.Scanner;
public class Studentgrade1 
{
    public static void main(String args[]) 
    {
        int marks[] = new int[5];
        int i,roll_number, avg, sum = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("******Welcome to StudentGrade Calculator******");
        System.out.println("Enter your name: ");
        name =sc.nextLine();
        System.out.println("Enter yur roll number: ");
        roll_number=sc.nextInt();

        for (i = 0; i < 5; i++)
        {
            System.out.println("Enter your marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            //taing input from user of each subject
            sum = sum + marks[i];
        }
        System.out.println("The sum of all the subjects is: " +sum+" "+ "out of 500");
        avg = sum / 5;
        System.out.println("The average of all the subjects is:"+avg);
        System.out.println();
        System.out.println("The Grade is: ");
        if (avg >=90) 
        {
            System.out.println(name+" "+"You have got A+");
        } 
        else if (avg < 90 && avg >= 80) 
        {
            System.out.println(name+" "+"You have got A");
        } 
        else if (avg < 80 && avg >= 70) 
        {
            System.out.println(name+" "+"You have got B");
        }
         else if (avg < 70 && avg >= 60) 
        {
            System.out.println(name+" "+"You have got C");
        } 
	  else if (avg < 60 && avg >= 45)
        {
            System.out.println(name+" "+"You have got D");
        }
         
        else if (avg < 45 && avg >=35 ) 
        {
            System.out.println(name+" "+"You have got F");
        } 
	  else 
        {
            System.out.println(name+" "+"You are fail!!");
        }
    }
}
