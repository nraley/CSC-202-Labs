package LabChapters1And2.OneDotTwentyFour;

/**
 * Created by Nelson Raley on 8/31/15.
 */
public class TestA {

    public static void main(String[] args) {

        ShoppingBag BagA = new ShoppingBag(0.05f);

        BagA.place(4, 1.49f);
        BagA.place(3, 5.68f);
        BagA.place(1, 19.99f);
        System.out.print(BagA.toString());
    }

}
