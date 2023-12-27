package PracticalThings;

public class OddNumberChecker {

    // Method that throws an exception if the number is odd
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Odd number detected!");
        } else {
            System.out.println(number + " is an even number.");
        }
    }

    public static void main(String[] args) {
        try {
            // Testing the method with an odd number
            checkEvenNumber(5);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Testing the method with an even number
            checkEvenNumber(8);
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

// Custom exception class for odd numbers
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}