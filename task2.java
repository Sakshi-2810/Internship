import java.util.Random;
import java.util.Scanner;
public class task2
{
    public static void main(String args[])
    {
        int score=0,ans=1;
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        do{
       
        int n,x=r.nextInt(99)+1;
        
        do{
         
        System.out.println("Enter your value"); 
        n=sc.nextInt();  
            if(n==x)
            {
                System.out.println("Congrats!!!\nYou guessed correctly.");
                score++;
            }
            else if(n<x) System.out.println("Guess higher");
            else System.out.println("Guess lower");
        }while(n!=x);
        System.out.println("Your score = "+score+"\nEnter 1 to continue");
        ans=sc.nextInt();
    }while(ans==1);
    sc.close();
    }
}