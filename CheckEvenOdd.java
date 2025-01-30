package Task29Jan_BasicIfElsePgms;
import java.util.Scanner;

public class CheckEvenOdd
{
    public void EvenOdd() {
        {

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your number:");
            int Num = obj.nextInt();

            if (Num % 2 == 0) {
                System.out.println(Num + " is Even");
            } else {
                System.out.println(Num + " is Odd");

            }
            obj.close();



        }
    }

    public static void main(String[] args) {
        CheckEvenOdd obj = new CheckEvenOdd();
        obj.EvenOdd();
    }
}