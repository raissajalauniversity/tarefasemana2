package org.example;

public class Kata2 {

    public String winner(String[] deckSteve, String[] deckJosh) {
        String cartas = "23456789TJQKA";
        int steveScore = 0;
        int joshScore = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            int s = cartas.indexOf(deckSteve[i]);
            int j = cartas.indexOf(deckJosh[i]);

            if (s > j) {
                steveScore++;
            } else if (j > s) {
                joshScore++;
            }
        }

        if (steveScore > joshScore) {
            return "Steve wins " + steveScore + " to " + joshScore;
        } else if (joshScore > steveScore) {
            return "Josh wins " + joshScore + " to " + steveScore;
        } else {
            return "Tie";
        }
    }

}
