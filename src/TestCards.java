/*
Kyle Sullivan
kylsullivan@chapman.edu
2454608
cpsc 231-01
mp3a*/

public class TestCards {
    // main method to test the dealer system
    public static void main(String[] args) {
        Dealer d = new Dealer();
        String output = d.toString();
        System.out.println("New Deck");
        System.out.println(output);
        System.out.println();
        System.out.println("5 Cards Dealt:");
        System.out.println(d.deals(5));
        System.out.println();
        System.out.println("Cards after dealing");
        System.out.println(d.toString());
        System.out.println();
    }
}