import java.util.*;
public class atmproject{
   public static void main(String[] args) {
        // Variables setup
        double balance = 5000.0;
        int originalPin = 1234;
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to ATM ---");
        System.out.print("Enter your secret PIN: ");
        int enteredPin = sc.nextInt();

        // Pin Verification
        if (enteredPin == originalPin) {
            boolean isRunning = true;

            while (isRunning) {
                System.out.println("\nSelect an Option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Deposit Cash");
                System.out.println("4. Exit");
                
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: ₹" + balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        if (withdrawAmount > balance) {
                            System.out.println("Error: Insufficient Funds!");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Success! Remaining Balance: ₹" + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        balance += depositAmount;
                        System.out.println("Success! New Balance: ₹" + balance);
                        break;
                    case 4:
                        System.out.println("Thank you for using our services!");
                        isRunning = false; // Loop ko stop karne ke liye
                        break;
                    default:
                        System.out.println("Invalid input. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid PIN! Access Denied.");
        }

        sc.close();
    }
            

        }

        

    