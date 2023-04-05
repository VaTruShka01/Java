package com.example.cardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;


//implements Initializable means the CardHandViewContoller is also an Initializable
//Initializable is

public class CardHandViewController implements Initializable {

        @FXML
        private Button button;

        @FXML
        private Label colourLable;

        @FXML
        private Label faceNameLabel;

        @FXML
        private ImageView imageView;

        @FXML
        private Label suitLable;

        @FXML
        private Label valueLable;

    private DeckOfCards deck;

    @FXML
    void dealNextCard() {
        Card cardSelected = deck.dealTopCard();
        faceNameLabel.setText("Face Name: "+cardSelected.getFaceName());
        colourLable.setText("Colour: "+cardSelected.getColour());
        suitLable.setText("Suit: "+cardSelected.getSuit());
        valueLable.setText("Value: " + cardSelected.getCardValue());
        imageView.setImage(cardSelected.getImage());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new DeckOfCards();
        dealNextCard();
    }
}


