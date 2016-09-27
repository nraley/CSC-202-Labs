package LabChapters1And2.TwoDotThirty;

/**
 * Created by Nelson Raley on 9/13/15.
 */
public class CardTest {
    public static void main(String[] args) {
        Card myCard1 = new Card(3, 2);  //create new card objects and pass in desired rank and suit as args
        Card myCard2 = new Card(8, 1);
        Card myCard3 = new Card(1, 4);

        System.out.println(myCard1);    //prints nicely formatted card names as formatted in toString
        System.out.println(myCard2);
        System.out.println(myCard3);
    }
}
