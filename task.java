import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            double f = (c * 9/5) + 32;
            System.out.println(c + "°C is equal to " + f + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            double c = (f - 32) * 5/9;
            System.out.println(f + "°F is equal to " + c + "°C");
        } else {
            System.out.println("Invalid choice! Please restart and pick 1 or 2.");
        }
        
        scanner.close();
    }
}
