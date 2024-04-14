/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.skipbo;

/**
 *
 * @author VIBHATI GILL
 */
public class Player {
    private String name;
    private Hand hand;
    private int totalScore;

    public Player(String name) {
        this.name = name;
        hand = new Hand();
        totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void addToTotalScore(int score) {
        totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }
}


