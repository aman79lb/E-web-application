import java.util.Random;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordPattern {
    public static List<String> generatePasswordPattern(String charset, int minLength, int maxLength) {
        /**
         * Generates a list of all possible password patterns using characters in the given character set.
         * Password patterns have length between the minimum and maximum length (inclusive).
         */
        List<String> passwordPatterns = new ArrayList<String>();
        for (int length = minLength; length <= maxLength; length++) {
            generatePatternsRecursive(charset, "", length, passwordPatterns);
        }
        return passwordPatterns;
    }

    private static void generatePatternsRecursive(String charset, String currentPattern, int patternLength, List<String> passwordPatterns) {
        if (currentPattern.length() == patternLength) {
            passwordPatterns.add(currentPattern);
            return;
        }
        for (int i = 0; i < charset.length(); i++) {
            generatePatternsRecursive(charset, currentPattern + charset.charAt(i), patternLength, passwordPatterns);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the characters to use in the password: ");
        String charset = scanner.nextLine();

        System.out.print("Enter the minimum length of the password: ");
        int minLength = scanner.nextInt();

        System.out.print("Enter the maximum length of the password: ");
        int maxLength = scanner.nextInt();

        List<String> passwordPatterns = generatePasswordPattern(charset, minLength, maxLength);
        System.out.println(passwordPatterns);
    }
}
/*
In this updated version, the program prompts the user for input using the Scanner class.
 The program asks for the character set to use, 
 the minimum and maximum lengths for the password pattern.
 The program then generates the list of password patterns using the generatePasswordPattern method and displays the result.

*/

/*
public class PasswordPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user inputs
        System.out.print("Enter the length of the password: ");
        int passwordLength = scanner.nextInt();
        System.out.print("Enter the number of uppercase letters: ");
        int numUppercase = scanner.nextInt();
        System.out.print("Enter the number of lowercase letters: ");
        int numLowercase = scanner.nextInt();
        System.out.print("Enter the number of digits: ");
        int numDigits = scanner.nextInt();
        System.out.print("Enter the number of special characters: ");
        int numSpecialChars = scanner.nextInt();

        // Generate the password pattern
        StringBuilder pattern = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < numUppercase; i++) {
            pattern.append('U');
        }

        for (int i = 0; i < numLowercase; i++) {
            pattern.append('L');
        }

        for (int i = 0; i < numDigits; i++) {
            pattern.append('D');
        }

        for (int i = 0; i < numSpecialChars; i++) {
            pattern.append('S');
        }

        for (int i = pattern.length(); i < passwordLength; i++) {
            int rand = random.nextInt(4);

            if (rand == 0) {
                pattern.append('U');
            } else if (rand == 1) {
                pattern.append('L');
            } else if (rand == 2) {
                pattern.append('D');
            } else {
                pattern.append('S');
            }
        }

        // Shuffle the pattern
        char[] patternArr = pattern.toString().toCharArray();
        for (int i = patternArr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = patternArr[index];
            patternArr[index] = patternArr[i];
            patternArr[i] = temp;
        }

        // Print the password pattern
        System.out.println("Password Pattern: " + new String(patternArr));
    }
}


*/