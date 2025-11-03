package com.amates.jokempo.play;

import java.util.Scanner;

public class PlayJokempo {

    public static void main(String[] args) {

        int pedra = 1;
        int papel = 2;
        int tesoura = 3;

        int userScore = 0;
        int adversaryScore = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Sua jogada (pedra, papel ou tesoura): ");
            String userInput = scanner.next();

            System.out.print("Jogada do adversário (pedra, papel ou tesoura): ");
            String adversaryInput = scanner.next();

            // Conversão da entrada para número
            if (userInput.equalsIgnoreCase("pedra")) {
                userScore = pedra;
            } else if (userInput.equalsIgnoreCase("papel")) {
                userScore = papel;
            } else if (userInput.equalsIgnoreCase("tesoura")) {
                userScore = tesoura;
            } else {
                System.out.println("Entrada inválida do usuário.");
                continue; // volta ao início do loop
            }

            if (adversaryInput.equalsIgnoreCase("pedra")) {
                adversaryScore = pedra;
            } else if (adversaryInput.equalsIgnoreCase("papel")) {
                adversaryScore = papel;
            } else if (adversaryInput.equalsIgnoreCase("tesoura")) {
                adversaryScore = tesoura;
            } else {
                System.out.println("Entrada inválida do adversário.");
                continue;
            }

            // Comparação das jogadas
            if (userScore == adversaryScore) {
                System.out.println("Empate!");
            } else if ((userScore == pedra && adversaryScore == tesoura)
                    || (userScore == papel && adversaryScore == pedra)
                    || (userScore == tesoura && adversaryScore == papel)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }

            break; // Sai do loop após uma rodada
        }

        scanner.close();
    }
}
