/*
Kyle Sullivan
kylsullivan@chapman.edu
2454608
cpsc 231-01
mp3a*/

import java.util.LinkedList;

public class Dealer {
    private Deck m_deck;

    // default constructor
    public Dealer() {
        m_deck = new Deck(); // issue here as well in default constructor
    }

    // returns a Linked list with n cards dealt from the member deck
    public LinkedList<Card> deals(int n) {
        LinkedList<Card> output = new LinkedList<Card>();
        if(m_deck.size() <= 0){
            return output;
        }
        for (int i = 0; i < n; i++) {
            output.add(m_deck.deal());
        }
        return output;
    }

    // returns an Integer size of the deck
    public Integer size(){
        return m_deck.size();
    }

    // toString method, returns contents of the deck
    public String toString(){
        return m_deck.toString();
    }
}