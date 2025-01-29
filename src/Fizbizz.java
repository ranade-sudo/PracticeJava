
//Write a program that prints numbers from 1 to 100. However, for multiples of 3,print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz."(for loop, if else)


public class Fizbizz {
    public void printfizbuzzf1() {
        int N = 3;
        int N1 = 5;
        for (int i = 1; i <= 100; i++)
        {

            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("Fizzbuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                    System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of Fizbizz class
        Fizbizz fizzbizznew = new Fizbizz();

        // Call the fizzBuzz method
        fizzbizznew.printfizbuzzf1();
    }

}