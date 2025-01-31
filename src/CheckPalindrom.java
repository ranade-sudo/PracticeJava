import java.util.Scanner;

public class CheckPalindrom {

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        int startofinputstring = 0;
        int endofinputstring = str.length() - 1;

        // Loop to compare characters from both ends of the string
        while (startofinputstring < endofinputstring)
        {
            // If characters don't match, it's not a palindrome
            if (str.charAt(startofinputstring) != str.charAt(endofinputstring))
            {
                return false;
            }
            startofinputstring++;  // Move the start pointer towards the right
            endofinputstring--;    // Move the end pointer towards the left
        }

        // If all characters match, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Create an instance of the CheckPalindrom class
        CheckPalindrom checker = new CheckPalindrom();

        // Ask the user to input a string
        System.out.println("Enter a string to check if it's a palindrome:");

        // Read the input string
        String input = sc.nextLine();

        // Call the isPalindrome method and display the result
        if (checker.isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Close the Scanner object to free resources
        sc.close();
    }
}
