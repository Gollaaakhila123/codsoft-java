import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of BankAccount with an initial balance of $1000.0
        BankAccount account = new BankAccount(1000.0);

        boolean exit = false;

        // Welcome message
        System.out.println("Welcome to the ATM Interface!");
        System.out.println("Your current account balance: $" + account.getBalance());

        // Menu loop
        while (!exit) {
            // Display options
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.printf("Your current account balance is: $%.2f%n", account.getBalance());
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.printf("Your updated account balance is: $%.2f%n", account.getBalance());
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.printf("Your updated account balance is: $%.2f%n", account.getBalance());
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM Interface. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
