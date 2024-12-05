import java.util.Scanner;

class StoreClass {
    public void buyItem(int moneyBank, int moneyWallet) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Store!");
        System.out.println("We have the following items for sale:");
        System.out.println("1. Water - $100");
        System.out.println("2. Food - $200");

        int itemPrice = 0;
        while (itemPrice == 0) {
            System.out.println("Which item would you like to buy? (Enter 1 for Water, 2 for Food)");
            int itemChoice = scan.nextInt();
            if (itemChoice == 1) {
                itemPrice = 100;
            } else if (itemChoice == 2) {
                itemPrice = 200;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }

        String paymentChoice = "";
        while (!paymentChoice.equals("bank") && !paymentChoice.equals("wallet")) {
            System.out.println("Would you like to pay using money from your bank or your wallet?");
            paymentChoice = scan.next().toLowerCase();
            if (!paymentChoice.equals("bank") && !paymentChoice.equals("wallet")) {
                System.out.println("Invalid choice. Please select 'bank' or 'wallet'.");
            }
        }

        if (paymentChoice.equals("bank")) {
            if (itemPrice > moneyBank) {
                System.out.println("You don't have enough money in your bank to buy this item.");
            } else {
                moneyBank -= itemPrice;
                System.out.println("You bought the item using your bank balance.");
                System.out.println("Your new Bank Balance: " + moneyBank);
            }
        } else if (paymentChoice.equals("wallet")) {
            if (itemPrice > moneyWallet) {
                System.out.println("You don't have enough money in your wallet to buy this item.");
            } else {
                moneyWallet -= itemPrice;
                System.out.println("You bought the item using your wallet balance.");
                System.out.println("Your new Wallet Balance: " + moneyWallet);
            }
        }
    }
}
