import java.util.Scanner;
import java.util.ArrayList;

public class StoreInventory 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();

        System.out.println("How many items are in your store?");
        int numItems = scan.nextInt();


        System.out.println("Once you enter one item please press enter:");
        for (int i = 0; i < numItems; i++) 
        { 
            String inputItem = scan.nextLine();
            itemList.add(inputItem);
        }

        System.out.println("Current store items: " + itemList);
        int[] price = new int[numItems];
        int[] indiNumItems = new int[numItems]; 
        
        System.out.println("\nFor each item that is listed, please enter the price of each item in your inventory");
        System.out.println(" ");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i) + " Price?");
            int priceItems = scan.nextInt();
            price[i] = priceItems; 
        }
        
        System.out.println("\nFor each item that is going to be listed, please enter the amount of inventory you have for this:");
        System.out.println(" ");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i) + " Amount?");
            int inputNumItems = scan.nextInt();
            indiNumItems[i] = inputNumItems; 
        }
        System.out.println(" ");
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println("Total Inventory of " + itemList.get(i) + ": " + indiNumItems[i]);
            System.out.println( "Total Price of all " + itemList.get(i) +": " + price[i]*indiNumItems[i] + "$");
            System.out.println(" ");
        }
    }
}
