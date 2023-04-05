package com.example.cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck = new ArrayList<>();
    public DeckOfCards(){

        List<String> suits = Card.getSuitNames();
        List<String> faceNames = Card.getValidFaceNames();

        for(int i = 0; i<suits.size(); i++){
            System.out.println(suits.get(i));
            for (String faceName : faceNames)
                deck.add(new Card(faceName, suits.get(i)));


        }

    }

    /**
     * method deals top card
     */

    public Card dealTopCard(){
        if(deck.size()>0)
            return deck.remove(0);
        else
            return null;


    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

}
