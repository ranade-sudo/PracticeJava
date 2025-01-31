import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//Take the below User info and store it into the variables:
//Age (integer) , Salary (double or float) , Credit Score (integer)
//Age Validation: Check if the age is a positive integer, Ensure the age is at least 18 years old, Max age can be 80.
//Salary Validation:Check if the salary is a positive number,Define a minimum salary threshold (e.g., 30,000).
//Credit Score Validation:Check if the credit score is a positive integer Define a minimum credit score threshold (e.g., 650) Max credit score threshold (e.g., 850).
public class LoanEligibilityCode
{
    public static boolean isEligibleForLoan(int age, double salary, int creditScore) {
        if (age < 18 || age > 80) {
            System.out.println("Age must be between 18 and 80.");
            return false;
        }
        if (salary < 30000) {
            System.out.println("Salary must be at least 30,000.");
            return false;
        }
        if (creditScore < 650) {
            System.out.println("Credit score must be at least 650.");
            return false;
        }

        // If all conditions are met
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for input
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        // Validate age
        if (age <= 0) {
            System.out.println("Age must be a positive integer.");
            return; // Exit if age is invalid
        }

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        // Validate salary
        if (salary <= 0) {
            System.out.println("Salary must be a positive number.");
            sc.close();
            return; // Exit if salary is invalid
        }

        System.out.println("Enter your credit score:");
        int creditScore = sc.nextInt();

        // Validate credit score
        if (creditScore <= 0) {
            System.out.println("Credit score must be a positive integer.");
            sc.close();
            return; // Exit if credit score is invalid
        }

        // Check loan eligibility based on input values
        if (isEligibleForLoan(age, salary, creditScore)) {
            System.out.println("Congratulations! You are eligible for the loan.");
        } else {
            System.out.println("Sorry, you are not eligible for the loan.");
        }

        sc.close();  // Close the scanner after use
    }
}

