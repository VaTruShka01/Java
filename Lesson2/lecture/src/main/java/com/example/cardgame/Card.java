package com.example.cardgame;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    //these are instance variables. when you create a instance of your class
    //the system will reserve space in memory to store these items
    private String faceName;
    private String suit;
    /**
     * this is a constructor. it is called whe we want to instantuate(create an instance) of our object
     * it looks like a method but does not have a return type and must have the exact same name of class
     */
    public Card(String faceNumber, String suit){
        setFaceName(faceNumber);
        setSuit(suit);

    }
    //Validation get setters
    public String getFaceName() {
        return faceName;
    }

    public static List<String> getValidFaceNames(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    public static List<String> getSuitNames(){
        return Arrays.asList("hearts","spades","clubs","diamonds");
    }

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if(getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + "must be in the list");
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        if (getSuitNames().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " must be in the list");
    }

    public String toString(){
        return faceName + " of " + suit;
    }

    /**
     * this method returns the colour of the card red = heart or diamond
     * black = spade or club
     */

    public String getColour(){
        if(suit.equals("hearts")|| suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

    public int getCardValue(){
        List<String> faceNames = getValidFaceNames();
        int indexOfCard = faceNames.indexOf(faceName);
        return indexOfCard+2;


     }

    /**
     * This will return an Image
     */

    public Image getImage()
    {
        String fileName = "images/" + faceName + "_of_" + suit +".png";
        System.out.println(fileName);
        return new Image(Card.class.getResourceAsStream(fileName));
    }


}
