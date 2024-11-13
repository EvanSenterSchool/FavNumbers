import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int x = InputHelper.getInt(scan, "Enter your favorite Int: ");
        double y = InputHelper.getDouble(scan, "Enter your favorite Double: ");

        System.out.println("Your favorite int is: " + x + " and your favorite double is: " + y);
    }
}
