/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.skipbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NARIPJEET SINGH
 */
public class SkipBoGame {
    private Deck deck;
    private List<Player> players;

    public SkipBoGame(int numPlayers) {
        deck = new Deck();
        players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name for Player " + i + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }
    }

    public void playRound() {
        for (Player player : players) {
            System.out.println("\n" + player.getName() + "'s turn");
            player.getHand().addCard(deck.dealCard());
            player.getHand().displayHand();
        }
        Player roundWinner = getRoundWinner();
        System.out.println("\nRound winner: " + roundWinner.getName());
    }

    private Player getRoundWinner() {
        Player roundWinner = players.get(0);
        int maxScore = roundWinner.getHand().calculateScore();
        for (Player player : players) {
            int score = player.getHand().calculateScore();
            if (score > maxScore) {
                roundWinner = player;
                maxScore = score;
            }
        }
        return roundWinner;
    }

    public void displayScores() {
        System.out.println("\nRound scores:");
        for (Player player : players) {
            int score = player.getHand().calculateScore();
            System.out.println(player.getName() + ": " + score);
            player.addToTotalScore(score);
        }
    }

    public boolean playAgain(Scanner scanner) {
        System.out.print("\nDo you want to play another round? (yes/no): ");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("yes");
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean continuePlaying = true;
        while (continuePlaying) {
            playRound();
            displayScores();
            continuePlaying = playAgain(scanner);
        }
        scanner.close();
    }

    public void displayTotalScores() {
        System.out.println("\nTotal scores after all rounds:");
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getTotalScore());
        }
    }

    public void displayGameWinner() {
        Player gameWinner = players.get(0);
        int maxTotalScore = gameWinner.getTotalScore();
        for (Player player : players) {
            int totalScore = player.getTotalScore();
            if (totalScore > maxTotalScore) {
                gameWinner = player;
                maxTotalScore = totalScore;
            }
        }
        System.out.println("\nGame winner: " + gameWinner.getName());
    }
}

