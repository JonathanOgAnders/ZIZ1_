package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        ArrayList<Animals> hand1 = new ArrayList<>();
        ArrayList<Animals> hand2 = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            hand1.add(deck.drawFromDeck());
            hand2.add(deck.drawFromDeck());
        }

        int h1 = 0;
        int h2 = 0;

        System.out.println("Hand 1: " + hand1 + "\nHand 2: " + hand2);

        for (Animals a: hand1)
        {
            for (Animals b: hand2)
            {
                h1 += b.compareAnimals(a);
            }
        }
        for (Animals a: hand2)
        {
            for (Animals b: hand1)
            {
                h2 += b.compareAnimals(a);
            }
        }

        System.out.println("h1: " + h1 + "\nh2: " + h2);

        if(h1 == h2)
        {
            System.out.println("It's a draw!");
        }
        else if(h1 > h2)
        {
            System.out.println("hand 1 won");
        } else
        {
            System.out.println("hand 2 won");
        }
    }
}
