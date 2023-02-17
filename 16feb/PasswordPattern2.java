/*
import java.util.Scanner;

public class PasswordPattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the target password from the user
        System.out.print("Enter the target password: ");
        String targetPassword = scanner.nextLine();

        // Get the character set from the user
        System.out.print("Enter the characters to use in the password: ");
        String charset = scanner.nextLine();

        // Get the minimum and maximum password lengths from the user
        System.out.print("Enter the minimum length of the password: ");
        int minLength = scanner.nextInt();
        System.out.print("Enter the maximum length of the password: ");
        int maxLength = scanner.nextInt();

        // Try all possible password patterns until we find the correct one
        boolean passwordFound = false;
        StringBuilder currentPassword = new StringBuilder(minLength);
        for (int length = minLength; length <= maxLength && !passwordFound; length++) {
            generatePasswordRecursive(charset, currentPassword, length, targetPassword, 0, passwordFound);
        }

        // Print the result
        if (passwordFound) {
            System.out.println("The password is: " + currentPassword);
        } else {
            System.out.println("Password not found.");
        }
    }

    private static void generatePasswordRecursive(String charset, StringBuilder currentPassword, int patternLength, String targetPassword, int index, boolean passwordFound) {
        if (index == patternLength) {
            // Check if the current password pattern matches the target password
            if (currentPassword.toString().equals(targetPassword)) {
                passwordFound = true;
            }
            return;
        }

        for (int i = 0; i < charset.length() && !passwordFound; i++) {
            // Add a character from the character set to the current password pattern
            currentPassword.append(charset.charAt(i));

            // Recursively generate the rest of the password pattern
            generatePasswordRecursive(charset, currentPassword, patternLength, targetPassword, index + 1, passwordFound);

            // Remove the last character from the current password pattern before trying the next one
            currentPassword.deleteCharAt(currentPassword.length() - 1);
        }
    }
}
*/