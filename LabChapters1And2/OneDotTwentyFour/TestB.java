package LabChapters1And2.OneDotTwentyFour;
import java.util.Scanner;
/**
 * Created by Nelson Raley on 8/31/15.
 */
public class TestB {
    public static void main(String[] args) {

        ShoppingBag BagB = new ShoppingBag(0.06f);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter item quantity, or 0 to end: ");
            int itemQuant = scanner.nextInt();
            if (itemQuant == 0) break;
            System.out.println("Please enter the item cost, or 0 to end: ");
            float itemCost = scanner.nextFloat();
            if (itemCost ==0) break;

            BagB.place(itemQuant, itemCost);
        }

        System.out.print(BagB.toString());
    }
}
