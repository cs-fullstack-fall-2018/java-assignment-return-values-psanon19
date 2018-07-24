import java.util.Scanner;
public class Password_Checker {

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);
        String password1, password2 = "";

        System.out.print("Enter your new password: ");
        password1 = scanInput.nextLine();

        System.out.print("Enter new password again: ");
        password2 = scanInput.nextLine();

        System.out.println("Does passwords match? " + checkPassword(password1, password2));

    }

    public static boolean checkPassword(String one, String two) {
       return one.equals(two) ;
       
    }

}
