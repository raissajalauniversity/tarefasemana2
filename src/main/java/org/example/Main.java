package org.example;


public class Main {
    public static void main(String[] args) {
        String reversed = Kata1.solution("world");
        String reversed2 = Kata1.solution("word");

        System.out.println(reversed);
        System.out.println(reversed2);

        Kata2 game = new Kata2();
        String[] steve = {"A", "7", "8"};
        String[] josh = {"K", "5", "9"};

        System.out.println(game.winner(steve, josh));
    }
}
