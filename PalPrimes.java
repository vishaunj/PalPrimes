import java.util.Scanner;                                                 //Vishaun Jones
import java.lang.StringBuilder;                                           //2/25/2022
                                                                          //Professor Silei Song
public class PalPrimes {                                                  //Assignment 2 - PalPrimes
    public static boolean isPalin(int prime) {
        String var1 = String.valueOf(prime); //The data type of the parameter is changed to String to make use of the String methods
        StringBuilder primeReversed = new StringBuilder(var1).reverse(); //A reversed version of the prime number is created

        if (var1.equals(primeReversed.toString())) { //The original input and reversed version are compared to each other, returning true or false.
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Initial Prompt
        System.out.print("Please enter the upper limit: ");

        //User input
        int upperLimit = in.nextInt();

        //Prompt letting users know the prime numbers follow
        System.out.println("The prime numbers are:");

        for (int i = 1; i <= upperLimit; ++i) {
            int amountDivided = 0;
            boolean checkPrime;
            for(int j = 1; j <= i; ++j) {
                if (i % j == 0) {
                    amountDivided = amountDivided + 1;
                }
            }

            //If the number is a prime number it is sent the isPalin method;
            if (amountDivided == 2) {
                checkPrime = isPalin(i);
                if (checkPrime == true) {  //If isPalin returns true for the prime number
                    System.out.println(i); //that prime number is printed.
                }
            }

        }

    }
}

