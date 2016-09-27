package LabChapters1And2.TwoDotThirty;

/**
 * Created by Nelson Raley on 9/13/15.
 */
public class Card {

    protected int rank;
    protected int suit;
    protected String[] rankNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",  //create array of rank names
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    protected String[] suitNames = {"Clubs", "Diamonds", "Hearts", "Spades"};               //create array of suit names

    public Card(int rank, int suit) {   //constructor for card
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {      //toString returns nicely formatted "____ of ____" string
        return rankNames[rank - 1] + " of " + suitNames[suit - 1];  //finds rank/suit name by looking in arrays at correct index
    }

    public int getRank() {
        return rank;
    }   //rank getter

    public int getSuit() {
        return suit;
    }   //rank setter

}
