package com.example.gachasimulator;

public class dokkan_cards {
    String name;
    int image;
    public dokkan_cards(int cardImage, String cardName)
    {
        name = cardName;
        image = cardImage;
    }

    public int getCardImage()
    {
        return image;
    }
    public String getCardName()
    {
        return name;
    }

}
