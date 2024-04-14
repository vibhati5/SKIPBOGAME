/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.skipbo;

/**
 *
 * @author VIBHATI GILL
 */
public class Card {
    private int faceValue;
    private Suit suit;

    public Card(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}

