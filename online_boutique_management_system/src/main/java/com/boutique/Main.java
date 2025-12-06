import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Welcome to Online Boutique Management System!");
        System.out.println("1. View Products");
        System.out.println("2. Add to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Remove from Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Viewing Products...");
                break;
            case 2:
                System.out.println("Adding Product to Cart...");
                break;
            case 3:
                System.out.println("Viewing Cart...");
                break;
            case 4:
                System.out.println("Removing Product from Cart...");
                break;
            case 5:
                System.out.println("Proceeding to Checkout...");
                break;
            case 6:
                System.out.println("Exiting System...");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
