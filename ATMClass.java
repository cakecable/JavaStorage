import java.util.Scanner;

class ATMClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StoreClass store = new StoreClass();

        // money in bank and wallet
        int moneyBank = 3000;
        int moneyWallet = 200;

        // ATM interaction
        String input1 = "";
        while (!input1.equals("yes") && !input1.equals("no")) {
            System.out.println("Your Wallet Balance: " + moneyWallet);
            System.out.println("Would you like to use this ATM System? (yes/no)");
            input1 = scan.nextLine().toLowerCase();
            if (!input1.equals("yes") && !input1.equals("no")) {
                System.out.println("Invalid input. Please answer with 'yes' or 'no'.");
            }
        }

        if (input1.equals("yes")) {
            String input2 = "";
            while (!input2.equals("withdraw") && !input2.equals("deposit")) {
                System.out.println("Your Bank Balance: " + moneyBank);
                System.out.println("What would you like to do? \nOptions: \n Withdraw \n Deposit");
                input2 = scan.nextLine().toLowerCase();
                if (!input2.equals("withdraw") && !input2.equals("deposit")) {
                    System.out.println("Invalid option. Please select 'withdraw' or 'deposit'.");
                }
            }

            if (input2.equals("withdraw")) {
                while (true) {
                    System.out.println("How much would you like to withdraw?");
                    int withdrawAmount = scan.nextInt();
                    if (withdrawAmount > moneyBank) {
                        System.out.println("You do not have enough money in your bank. Try again.");
                    } else {
                        moneyWallet += withdrawAmount;
                        moneyBank -= withdrawAmount;
                        System.out.println("Transaction successful.");
                        System.out.println("Wallet Balance: " + moneyWallet + "\nBank Balance: " + moneyBank);
                        break;
                    }
                }
            } else if (input2.equals("deposit")) {
                while (true) {
                    System.out.println("How much would you like to deposit?");
                    int depositAmount = scan.nextInt();
                    if (depositAmount > moneyWallet) {
                        System.out.println("You do not have enough money in your wallet. Try again.");
                    } else {
                        moneyWallet -= depositAmount;
                        moneyBank += depositAmount;
                        System.out.println("Transaction successful.");
                        System.out.println("Wallet Balance: " + moneyWallet + "\nBank Balance: " + moneyBank);
                        break;
                    }
                }
            }
        }

        System.out.println("Would you like to visit the store? (yes/no)");
        String storeChoice = scan.next().toLowerCase();
        if (storeChoice.equals("yes")) {
            store.buyItem(moneyBank, moneyWallet); 
        }

        scan.close();

    }
}
