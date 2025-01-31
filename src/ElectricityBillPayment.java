import java.util.Scanner;

public class ElectricityBillPayment {

    public static void calculateBill(int units) {
        double totalBill = 0;

        // Calculate for the first 100 units
        if (units <= 100)
        {
            totalBill = units * 0.50;
        }
        else if (units <= 200)
        {
            totalBill = (100 * 0.50) + ((units - 100) * 0.75);
        }
        else if (units <= 300)
        {
            totalBill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        }
        else
        {
            totalBill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }

        System.out.println("Total electricity bill for " + units + " units is: " + totalBill + " Rs.");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units consumed:");
        int units = sc.nextInt();
        calculateBill(units);
        sc.close();
    }
}
