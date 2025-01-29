public class CountInString
{
    public void Countvowelsandconsonants(String str)
    {
        int vowelCount = 0;
        int consonantCount = 0;
        //iterate the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at index i
            System.out.println("name = " + ch);

        if (Character.isLetter(ch)) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;  // It's a vowel
            } else {
                consonantCount++;  // It's a consonant
            }

        }
        }
        System.out.println("Total Vowels: " + vowelCount);
        System.out.println("Total Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        //classname cha object banavane and obj ne function call karne from main
        CountInString obj = new CountInString();
        obj.Countvowelsandconsonants("girijaranadebhagwat");

    }
}