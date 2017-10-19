package com.company;

import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class Deck
{
    private Stack<Animals> deckStack = new Stack<>();

    public Deck()
    {
        for (int i = 0; i < 5; i++)
        {
            deckStack.add(new Orca()); deckStack.add(new Elephant()); deckStack.add(new Crocodile()); deckStack.add(new Icebear());deckStack.add(new Lion()); deckStack.add(new Seal()); deckStack.add(new Fox()); deckStack.add(new Pike()); deckStack.add(new Hedgehog()); deckStack.add(new Sardine()); deckStack.add(new Mouse());

            if(i>0)
            {
                deckStack.add(new Mosquito());
            }

        }
        deckStack.add(new Joker());
        Collections.shuffle(deckStack);
    }

    public Animals drawFromDeck()
    {
        if (!(deckStack.isEmpty()))
        {
            return deckStack.pop();
        }
        return null;
    }

    public Stack<Animals> getDeckStack()
    {
        return deckStack;
    }
}
