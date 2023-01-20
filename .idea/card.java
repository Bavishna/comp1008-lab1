package com.example.w23comp1008lhw2;
public class Card{
private String suit;
private String faceName;

    /**
     * this is the constructoe,it will create a new card onject in system
     * memory. it will validate the suit and faceNameare found
     * playing cards
     * @param suit"hearts","clubs","spades","diamonds"
     * @param faceName "2","3","4"..."jack","queen","king"
     */
    public Card(String suit, String faceName){
    this.suit=suit;
    this.faceName= faceName;
}
@Override
public String toString()
{
    return faceName + "of" + suit;
}
}