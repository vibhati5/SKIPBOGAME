/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.skipbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIBHATI GILL
 */
public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void displayHand() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public int calculateScore() {
        int score = 0;
        for (Card card : cards) {
            score += card.getFaceValue();
        }
        return score;
    }
}
