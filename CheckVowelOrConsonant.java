package Task29Jan_BasicIfElsePgms;

import java.util.Scanner;

public class CheckVowelOrConsonant
{
    public void VowelOrConsonant()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your string:");
        String inputstring = obj.nextLine();

        int vowelcount = 0;
        int consonantcount = 0;

        // Iterate through the string
        for (int i = 0; i < inputstring.length(); i++) {
            char ch = inputstring.charAt(i);



                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a Vowel");
                    vowelcount++;
                } else {
                    System.out.println(ch + " is a Consonant");
                    consonantcount++;
                }

        }

        // Display the counts
        System.out.println("Total Vowels: " + vowelcount);
        System.out.println("Total Consonants: " + consonantcount);

        obj.close(); // Close the scanner
    }

    public static void main(String[] args)
    {
        CheckVowelOrConsonant obj = new CheckVowelOrConsonant();
        obj.VowelOrConsonant();
    }
}