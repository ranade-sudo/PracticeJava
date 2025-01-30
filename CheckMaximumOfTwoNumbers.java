package Task29Jan_BasicIfElsePgms;
import java.util.Scanner;

public class CheckMaximumOfTwoNumbers {
    public void checkMaximumOfTwoNumbers() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter first number:");
        int Number1 = obj.nextInt();

        System.out.println("Enter second number:");
        int Number2 = obj.nextInt();

        if(Number1 > Number2)
        {
            System.out.println("Number1 is Maximum");
        }
        else if (Number1 < Number2) {
            System.out.println("Number2 is Maximum");
        } else
        {
            System.out.println("Both Numbers are equal");
        }
    }

    public static void main(String[] args) {
        CheckMaximumOfTwoNumbers obj = new CheckMaximumOfTwoNumbers();
        obj.checkMaximumOfTwoNumbers();
    }




























}
