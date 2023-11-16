import java.util.Scanner;

public class ATMInterface {
    private String userId;
    private String userPin;

    public ATMInterface(String userId, String userPin) {
        this.userId = userId;
        this.userPin = userPin;
    }

    public void startATM() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Interface");
        System.out.print("Enter User ID: ");
        String enteredUserId = scanner.nextLine();

        System.out.print("Enter User PIN: ");
        String enteredPin = scanner.nextLine();

        if (validateUser(enteredUserId, enteredPin)) {
            System.out.println("Welcome, " + userId + "!");
            displayOptions();
            int choice = scanner.nextInt();

            while (choice != 5) {
                switch (choice) {
                    case 1:
                        viewTransactionsHistory();
                        break;
                    case 2:
                        performWithdrawal();
                        break;
                    case 3:
                        performDeposit();
                        break;
                    case 4:
                        performTransfer();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                displayOptions();
                choice = scanner.nextInt();
            }

            System.out.println("Thank you for using the ATM Interface. Goodbye!");
        } else {
            System.out.println("Invalid User ID or PIN. Exiting...");
        }
    }

    private boolean validateUser(String enteredUserId, String enteredPin) {
        return userId.equals(enteredUserId) && userPin.equals(enteredPin);
    }

    private void displayOptions() {
        System.out.println("\nATM Menu:");
        System.out.println("1. View Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
    }

    private void viewTransactionsHistory() {
        System.out.println("Transaction history will be displayed here.");
    }

    private void performWithdrawal() {
        System.out.println("Withdrawal functionality will be implemented here.");
    }

    private void performDeposit() {
        System.out.println("Deposit functionality will be implemented here.");
    }

    private void performTransfer() {
        System.out.println("Transfer functionality will be implemented here.");
    }

    public static void main(String[] args) {
        ATMInterface atm = new ATMInterface("user123", "1234"); // Sample user ID and PIN
        atm.startATM();
    }
}