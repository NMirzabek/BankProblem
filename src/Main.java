import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalSum = 0;

        while (true) {
            System.out.println("Please choose one of the options: ");
            System.out.println("1) Create Account, 2) Deposit, 3) Withdraw, 4) Check Balance, 5) Card Number, 6) Card Color");

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Please enter a bank account number: ");
                    scanner = new Scanner(System.in);
                    String bankAccountNumber = scanner.next();

                    System.out.println("Please enter account holder name: ");
                    scanner = new Scanner(System.in);
                    String holderName = scanner.next();

                    System.out.println("Please enter initial balance: ");
                    scanner = new Scanner(System.in);
                    String initialBalance = scanner.next();

                    System.out.println(bankAccountNumber + " " + holderName + " " + initialBalance);
                    break;

                case 2:
                    System.out.println("how much do you want to deposit? -- ");
                    scanner = new Scanner(System.in);
                    int newDeposit = scanner.nextInt();
                    totalSum += newDeposit;
                    System.out.println("Your total balance is " + totalSum);
                    break;

                case 3:
                    System.out.println("How much do you want to withdraw? -- ");
                    scanner = new Scanner(System.in);
                    int withdraw = scanner.nextInt();
                    if (totalSum > withdraw) {
                        totalSum -= withdraw;
                        System.out.println("Your total balance is " + totalSum);
                    } else {
                        System.out.println("Your account does not have enough funds!");
                        System.out.println("Please check your account and try again.");
                    }
                    break;

                case 4:
                    System.out.println("Your total balance is " + totalSum);
                    break;

                case 5:
                    System.out.println("8600 3404 9701 2670");
                    break;

                case 6:
                    System.out.println("Black");
                    break;

            }
        }
    }
}