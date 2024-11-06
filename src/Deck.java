/*
Kyle Sullivan
2454608
kylsullivan@chapman.edu
CPSC 231-01
MP3A - Cards
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Deck {
    private LinkedList<Card> m_cards = new LinkedList<Card>();

    // fills the deck in order
    public Deck() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 2; j < 14; ++j) {
                m_cards.add(new Card(i, j)); // issue here in default constructor
            }
        }
    }

    // deep copy copy constructor
    public Deck(Deck deck) {
        for (Card card : this.m_cards) {
            this.m_cards.remove(card);
        }

        for (Card card : deck.m_cards) {
            this.m_cards.add(card);
        }
    }

    public String toString() {
        String outputString = "";

        outputString += m_cards.toString();

        return outputString;
    }

    // returns an int representing the size of the deck
    public Integer size() {
        return m_cards.size();
    }

    // removes a random card from the member cards list and returns it
    public Card deal() {
        Random rand = new Random();

        int randomIndex = rand.nextInt(this.m_cards.size());

        Card output = this.m_cards.remove(randomIndex);

        return output;
    }
}