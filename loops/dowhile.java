import java.util.Scanner;
public class dowhile{
    public static void main(String[] args) {
        
  
Scanner sc = new Scanner(System.in);
int choice;

do {
    System.out.println("\n--- Menu ---");
    System.out.println("1. Option A");
    System.out.println("2. Option B");
    System.out.println("3. Exit");
    System.out.print("Enter your choice: ");
    
    choice = sc.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("You selected Option A");
            break;
        case 2:
            System.out.println("You selected Option B");
            break;
        case 3:
            System.out.println("Goodbye!");
            break;
        default:
            System.out.println("Invalid choice!");
    }
} while (choice != 2);
    }}