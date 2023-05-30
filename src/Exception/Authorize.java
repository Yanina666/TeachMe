package Exception;

import java.util.Scanner;

public class Authorize {
    static String login;
    static String password;
    static String confirmPassword;

    static Scanner enter = new Scanner(System.in);



    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        checkLoginAndPassword();

    }

    public static boolean checkLoginAndPassword() {

        try {
            System.out.print("Enter your login: ");
            String login = enter.nextLine();

            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Too much symbols or your have spaces in the login");

            }
            System.out.print("Enter the password: ");
            String password = enter.nextLine();

            if (password.length() >= 20 || password.contains(" ") || !password.matches("1,2,3,4,5,6,7,8,9,0")) {
                throw new WrongPasswordException("Passwords are wrong");
            }

            System.out.print("Enter the confirm password: ");
            String confirmPassword = enter.nextLine();

            if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords are not equals");
        }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}


