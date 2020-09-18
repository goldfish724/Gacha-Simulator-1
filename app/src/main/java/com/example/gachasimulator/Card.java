package com.example.gachasimulator;

public class Card {
    int id, image;

    public Card(int cardImage, int cardID)
    {
        id = cardID;
        image = cardImage;
    }
    public int getCardImage() {return image;}
    public int getCardID() {return id;}

}
