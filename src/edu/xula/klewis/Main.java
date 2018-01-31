package edu.xula.klewis;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Hello World!");


        ArrayList<Integer> list = randomNums(10, 20);
        System.out.println("Random list "+ list);
    }



    private static ArrayList<Integer> randomNums(int num, int bound) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int j = 0; j < num; j++) {
            numbers.add(rand.nextInt(bound + 1));
        }
        return numbers;
    }
}
