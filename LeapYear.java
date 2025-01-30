package Task29Jan_BasicIfElsePgms;

import java.util.Scanner;

public class LeapYear {
    public void LeapyearTest()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What year you want to test ?");
        int LY = sc.nextInt();

        if(LY%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

    }
    public static void main(String[] args)
    {
        LeapYear obj=new LeapYear();
        obj.LeapyearTest();
    }
}
