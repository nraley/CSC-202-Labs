package LabChapters1And2.TwoDotThirty;
import java.util.Collections;
import java.util.Arrays;
/**
 * Created by Nelson Raley on 9/13/15.
 */
public class DeckOfCards implements DeckOfCardsInterface{

    private Card[] deck;
    private int cardIndex = 0;
    private int deckIndex = 0;

    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        System.out.println(myDeck.toString());
    }

    public DeckOfCards() {
        deck = new Card[52];
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 1; suit <= 4; suit++ ) {
                deck[deckIndex++] = new Card(rank, suit);
            }
        }
        shuffle();
    }

    @Override
    public void shuffle() {
        deckIndex = 0;
        Collections.shuffle(Arrays.asList(deck));
    }

    @Override
    public int cardsLeft() {
        return 52 - deckIndex;
    }

    @Override
    public Card dealCard() {
        if (deckIndex == 52) {
            shuffle();
        }
        return deck[deckIndex++];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Card c : deck) {
            sb.append(c);
            sb.append("\n");
        }

        return sb.toString();
    }
}
