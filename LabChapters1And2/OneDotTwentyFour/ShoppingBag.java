package LabChapters1And2.OneDotTwentyFour;

/**
 * Created by Nelson Raley on 8/31/15.
 */
public class ShoppingBag {

    private int totalItemQuantity;
    private float totalItemCost;
    private float taxRate;


    public ShoppingBag (float taxRate) {
        this.taxRate = taxRate;
    }

    public void place (int itemQuantity, float itemCost) {
        totalItemQuantity += itemQuantity;
        totalItemCost += (itemQuantity * itemCost);
    }

    public int getItemQuantity () {
        return totalItemQuantity;
    }

    public float getTotalRetail () {
        return totalItemCost;
    }

    public float totalCost () {
        return (totalItemCost + (totalItemCost * taxRate));
    }

    public String toString () {
        return String.format("There are %d items in the bag.  The total retail cost of the items is $%.2f. %n" +
                "The total cost of the items with tax is $%.2f.", getItemQuantity(), getTotalRetail(), totalCost());
    }
}
