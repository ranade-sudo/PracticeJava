import java.util.Scanner;

public class CheckPositievNegative
{
    public void PositiveNegative()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your number:");
        int Num = obj.nextInt();
        if(Num<0)
        {
            System.out.println("Negative number");
        } else if (Num>0)
        {
            System.out.println("Positive Number")    ;
        } else if (Num==0)
        {
            System.out.println("Number is Not Positive Not Negative");
        } else
        {
            System.out.println("Enter only Number not a string");
        }
        obj.close();

    }

    public static void main(String[] args) {
        CheckPositievNegative obj=new CheckPositievNegative();
        obj.PositiveNegative();
    }












}
