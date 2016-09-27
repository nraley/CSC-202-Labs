package LabChapters1And2.TwoDotThirty;

/**
 * Created by Nelson Raley on 9/13/15.
 */
public class DeckOfCardsTest {

    DeckOfCards myDeck = new DeckOfCards();

    public static void main(String[] args) {
        DeckOfCardsTest test = new DeckOfCardsTest();
        test.specialTest();
    }

    public void randomTest() {
        System.out.println(myDeck.toString());
        System.out.println(myDeck.dealCard());
        System.out.println(myDeck.cardsLeft());
        System.out.println(myDeck.dealCard());
        System.out.println(myDeck.cardsLeft());
        System.out.println(myDeck.toString());
        myDeck.shuffle();
        System.out.println(myDeck.dealCard());
    }

    public void specialTest() {
        System.out.println(myDeck.toString());
        for (int i = 1; i <= 51; i++) {
            System.out.println(myDeck.dealCard());
        }
        System.out.println(myDeck.cardsLeft());
        System.out.println(myDeck.dealCard());
        System.out.println(myDeck.cardsLeft());
    }
}
