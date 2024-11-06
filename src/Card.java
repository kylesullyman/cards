/*
Kyle Sullivan
kylsullivan@chapman.edu
2454608
cpsc 231-01
mp3a*/

public class Card {
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private Integer suit;
    private Integer rank;

    // default constructor
    public Card() {
        rank = ACE;
        suit = SPADES;
    }

    // constructor
    public Card(Integer suit, Integer rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // copy constructor
    public Card(Card card) {
        this.rank = card.rank;
        this.suit = card.suit;
    }

    // toString method
    public String toString() {
        String outputString = "";

        switch (rank) {
            case JACK:
                outputString += "Jack";
                break;
            case QUEEN:
                outputString += "Queen";
                break;
            case KING:
                outputString += "King";
                break;
            case ACE:
                outputString += "Ace";
                break;
            default:
                outputString += rank.toString();
        }

        outputString += " of ";

        switch (suit) {
            case HEARTS:
                outputString += "Hearts";
                break;
            case SPADES:
                outputString += "Spades";
                break;
            case CLUBS:
                outputString += "Clubs";
                break;
            case DIAMONDS:
                outputString += "Diamonds";
                break;
            default:
                outputString += "unknown";
                break;
        }

        outputString += "\n";

        return outputString;
    }

    // get / set methods
    public void setSuit(Integer suit) {
        this.suit = suit;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getSuit() {
        return this.suit;
    }

    public Integer getRank() {
        return this.rank;
    }

    // isEquals method
    public Boolean equals(Card card) {
        if(this.suit == card.suit && this.rank == card.rank) {
            return true;
        }
        return false;
    }
}