import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login1 = scanner.nextLine();
        System.out.println("Enter password: ");
        String password1 = scanner.nextLine();
        System.out.println("Confirm password: ");
        String passwordcheck1 = scanner.nextLine();
        System.out.println(passwordCheck(login1, password1, passwordcheck1));

//    System.out.println(passwordCheck("user", "asdasadsa121!@A", "asdasa"));
    }
    public static boolean passwordCheck(String login, String password, String confirmPassword) {

        try {
            if ((login.matches("^[a-z0-9_-]{8,15}$")) &&
                    password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
                    && (password.equals(confirmPassword))) {
                return true;
            }
            if(!password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")) {
                throw new WrongPasswordException("Password is not correct, password must contain " +
                        "at least 8 characters with combination of numbers, symbol and Uppercase letter", 1);
            }
            if(!login.matches("^[a-z0-9_-]{8,15}$")){
                throw new WrongLoginException("Login is not true, Login must contain " +
                        "at least 8 characters (you can also add numbers)", 2);
            }
            if(!confirmPassword.equals(password)){
                throw new WrongPasswordException("Confirmation of password is not true", 3);
            }
        } catch (WrongLoginException e) {
            System.out.println("Login is not true, Login must contain " +
                    "at least 8 characters up to 15. (you can also combine with numbers)");
        } catch (WrongPasswordException e) {
            System.out.println("Password or confirmation of password is not correct. " +
                    "Password must contain at least 8 characters with combination of numbers, " +
                    "symbol and Uppercase letter");
        }
        return false;
    }

}



