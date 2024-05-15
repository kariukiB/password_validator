package password_validator;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "johndoe";
        String currentPassword = "ABC_1234";
        int passwordLength = 8;
        String newPassword;
        boolean isValid = false;
        System.out.println("********************************");
        System.out.println("Welcome to your password manager tool.");
        printPasswordRules();


        do {
            System.out.println("Kindly provide a new password.");
            newPassword = scanner.next();

            if ((newPassword).equalsIgnoreCase(currentPassword)) {
                System.out.println("New password cannot be same as old password");

            } else if ((newPassword.toLowerCase()).contains(username.toLowerCase())) {
                System.out.println("Your username cannot be part of the password");

            } else if (newPassword.length() < passwordLength) {
                System.out.println("Your password should be at least 8 characters long");

            } else if (newPassword.matches("[a-zA-Z0-9 ]*")) {
                System.out.println("Your password must contain a special character");

            } else if (newPassword.equals(newPassword.toLowerCase())) {
                System.out.println("Your password must contain an uppercase letter");

            } else {
                System.out.println("Password changed successfully");
                isValid = true;
            }
        } while (!isValid);

        scanner.close();

    }
    public static  void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }
}
