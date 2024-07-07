import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        boolean accountCreated = false;;

        while (true) {
            System.out.println("Please choose one of the options: ");
            System.out.println("1) Create Account, 2) Deposit, 3) Withdraw, 4) Check Balance, 5) Exit");

            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:


                    System.out.println("Please enter a bank account number: ");
                    String bankAccountNumber = scanner.next();
                    bankAccount.setAccountNumber(bankAccountNumber);

                    System.out.println("Please enter account holder name: ");
                    String holderName = scanner.next();
                    bankAccount.setHolderName(holderName);

                    System.out.println("Please enter initial balance: ");
                    int initialBalance = scanner.nextInt();
                    bankAccount.setInitialBalance(initialBalance);

                    accountCreated = true;
                    System.out.println("Account created: " + bankAccountNumber + " " + holderName + " " + initialBalance);
                    break;

                case 2:
                    if (!accountCreated) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }

                    System.out.println("You are depositing to this account: "
                            + bankAccount.getAccountNumber() + " "
                            + bankAccount.getHolderName() + " "
                            + bankAccount.getBalance());
                    System.out.println("How much do you want to deposit? -- ");
                    int depositAmount = scanner.nextInt();
                    bankAccount.deposit(depositAmount);
                    System.out.println("Your new balance is " + bankAccount.getBalance());
                    break;

                case 3:
                    if (!accountCreated) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }

                    System.out.println("You are withdrawing from this account: "
                            + bankAccount.getAccountNumber() + " "
                            + bankAccount.getHolderName() + " "
                            + bankAccount.getBalance());
                    System.out.println("How much do you want to withdraw? -- ");
                    int withdrawAmount = scanner.nextInt();
                    if (bankAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Your new balance is " + bankAccount.getBalance());
                    } else {
                        System.out.println("Your account does not have enough funds!");
                    }
                    break;

                case 4:
                    if (!accountCreated) {
                        System.out.println("No account found. Please create an account first.");
                        break;
                    }

                    System.out.println("Your total balance is " + bankAccount.getBalance());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unexpected value: " + userInput);
            }
        }
    }
}