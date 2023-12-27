package PracticalThings;
public class VowelChecker {

    // Method that throws an exception if the string does not contain vowels
    public static void checkForVowels(String input) throws NoVowelsException {
        if (!containsVowels(input)) {
            throw new NoVowelsException("String does not contain any vowels!");
        } else {
            System.out.println("String contains vowels: " + input);
        }
    }

    // Helper method to check if the string contains vowels
    private static boolean containsVowels(String input) {
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            // Testing the method with a string containing vowels
            checkForVowels("Hello, World!");
        } catch (NoVowelsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Testing the method with a string without vowels
            checkForVowels("BRRR");
        } catch (NoVowelsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

// Custom exception class for strings without vowels
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}