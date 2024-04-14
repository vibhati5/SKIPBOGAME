/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ca.sheridancollege.skipbo;

import java.util.Scanner;

/**
 *
 * @author NARIPJEET SINGH
 */
public class Skipbo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); 
        SkipBoGame game = new SkipBoGame(numPlayers);
        game.playGame();
        game.displayTotalScores();
        game.displayGameWinner();
        scanner.close();
    }
}
