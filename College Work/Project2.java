import java.util.Scanner;
import java.lang.Math; 


public class Project2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String name = scan.nextLine();
        System.out.println("\nNice to meet you, " + name + "!");
        System.out.println("Tell me, " + name + " what is your favorite number?");
        int favNum = scan.nextInt();
        int doubleNum = favNum*2;
        int halfNum = favNum/2;
        int squaredNum = favNum*favNum;
        double sqrtNum = (int) Math.sqrt(favNum);
        System.out.println("\nGreat choice! Here are some fun facts about the number 5:");
        System.out.println("- Double of " + favNum + " is " + doubleNum);
        System.out.println("- Half of " + favNum + " is " + halfNum);
        System.out.println("- " + favNum + " squared is " + squaredNum);
        System.out.println("- The square root of " + favNum + " is " + sqrtNum);
        
        System.out.println("\nNow, " + name + ", let's explore division. Give me the whole number.");
        double ranNum = scan.nextDouble();
        System.out.println("Now, give me another whole number.");
        double ranNum2 = scan.nextDouble();
        double intDiv = (int) ranNum/ranNum2;
        double dDiv = (float) ranNum/ranNum;
        
        System.out.println("\nUsing integer division, " + ranNum + " divided by " + ranNum2 + " is " + dDiv);
        System.out.println("Using floating point division, " + ranNum + " divided by " + ranNum2 + " is approximately " + dDiv);
        
        System.out.println("\nThanks for participating, " + name + "!");
        System.out.println("PROGRAMMER: David\nCMSC140 Project 1");
    }
}
