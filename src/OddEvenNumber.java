import java.util.Scanner;

public class OddEvenNumber {
    // Method to check if the number is odd or even
    public void oddEvenNumber() {
        Scanner sc = new Scanner(System.in);  // Create a single Scanner object

        System.out.println("Enter the number:");

        // Read input as an integer
        int n = sc.nextInt();  // Read the integer number from the user

        // Check if the number is even or odd
        if (n % 2 == 0) {
            System.out.println("Even number: " + n);  // Print if the number is even
        } else {
            System.out.println("Odd number: " + n);   // Print if the number is odd
        }

        sc.close();  // Close the scanner after use
    }

    // Main method to call the oddEvenNumber method
    public static void main(String[] args) {
        OddEvenNumber obj = new OddEvenNumber();  // Create an object of OddEvenNumber
        obj.oddEvenNumber();  // Call the method to check even or odd
    }
}
