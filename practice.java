import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.io.File;


public class practice {
    public static void main(String[] args) throws IOException {
        Scanner inputFile = new Scanner(new File("accounts.txt"));
        String[] accountNumbers = new String[100];
        double[] balances = new double[100];

        int numAccounts = readData(accountNumbers, balances, inputFile);

        char userInput;
        do {
            printMenu();
            Scanner input = new Scanner(System.in);
            userInput = input.next().charAt(0);

            switch (userInput) {
                case 'p':
                    printAccounts(accountNumbers, balances, numAccounts);
                    break;

                case 'q':
                    break;

                case 'b':
                    getBalance(accountNumbers, balances, numAccounts);
                    break;

                case 'd':
                    deposit(accountNumbers, balances, numAccounts);
                    System.out.println("Deposit successful.\n");
                    break;

                case 'w':
                    withdraw(accountNumbers, balances, numAccounts);
                    System.out.println("Withdrawal successful.\n");
                    break;

                case 'a':
                    if (addAccount(accountNumbers, numAccounts)) {
                        numAccounts++;
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (userInput != 'q');

        inputFile.close();
    }

    public static int readData(String[] accounts, double[] balances, Scanner file) {
        int accountCounter = 0;
        while (file.hasNext()) {
            String str = file.next();
            double d = file.nextDouble();
            accounts[accountCounter] = str;
            balances[accountCounter] = d;
            accountCounter++;
        }
        return accountCounter;
    }

    public static void printMenu() {
        System.out.println("Choices: ");
        System.out.println("b: get balance");
        System.out.println("d: make deposit");
        System.out.println("w: make withdrawal");
        System.out.println("a: add account");
        System.out.println("p: print accounts to screen");
        System.out.println("q: quit");
        System.out.println("Enter a letter choice: ");
    }

    public static void printAccounts(String[] str, double[] balances, int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%s %5.2f\n", str[i], balances[i]);
        }
    }

    public static int index(String[] digits, String account, int size) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(digits[i], account)) {
                return i;
            }
        }
        return -1;
    }

    public static void getBalance(String[] accountNumbers, double[] balances, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("account number: ");
        String account = input.next();

        int i = index(accountNumbers, account, size);

        if (i == -1) {
            System.out.println("Sorry, that account doesn't exist.");
        } else {
            System.out.printf("The balance is $%.2f \n", balances[i]);
        }
    }

    public static double deposit(String[] accountNumbers, double[] balances, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("account number: ");
        String account = input.next();
        int i = index(accountNumbers, account, size);

        if (i == -1) {
            System.out.println("Sorry, that account doesn't exist.");
        } else {
            System.out.println("amount to deposit: ");
            double depositAmount = input.nextDouble();
            balances[i] += depositAmount;
        }
        return balances[i];
    }

    public static double withdraw(String[] accountNumbers, double[] balances, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("account number: ");
        String account = input.next();

        int i = index(accountNumbers, account, size);

        if (i == -1) {
            System.out.println("Sorry, that account doesn't exist.");
        } else {
            System.out.println("amount to withdraw: ");
            double withdrawalAmount = input.nextDouble();
            balances[i] -= withdrawalAmount;
        }
        return balances[i];
    }

    public static boolean addAccount(String[] accountNumbers, int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("new account number (six digits): ");
        String newAccount = input.next();

        if (size >= 100) {
            System.out.println("Sorry, the database is full.\n");
        }

        int digitCounter = 0;
        // loops through user input to count if there are only 6 digits
        for (int i = 0; i < newAccount.length(); i++) {
            char c = newAccount.charAt(i);
            digitCounter++;
        }
        if (digitCounter != 6) {
            return false;
        } else {
            accountNumbers[size] = newAccount;
        }
        return true;
    }
}