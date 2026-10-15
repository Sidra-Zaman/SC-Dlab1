import java.util.Scanner;

// A simple class to represent a Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display a greeting
    public void introduce() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }
}

public class task {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Welcome to the Eclipse Java App ===");
        
        // Using Scanner to get user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        // Create an object using the user's input
        Person user = new Person(userName, userAge);

        // Call the method
        System.out.println("\n--- Output ---");
        user.introduce();

        // Close the scanner resource
        scanner.close();
    }
}