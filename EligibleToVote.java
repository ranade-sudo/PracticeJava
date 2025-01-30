package Task29Jan_BasicIfElsePgms;
import java.util.Scanner;

public class EligibleToVote {
    public void Eligibility()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if (age>=18)
        {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }
    public static void main(String[] args) {
        EligibleToVote obj=new EligibleToVote();
        obj.Eligibility();
    }

}
