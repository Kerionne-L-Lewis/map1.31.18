package edu.xula.klewis;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Hello World!\n");

        final int MAX_VALUE= 10;

        ArrayList<Integer> list = randomNums(10, MAX_VALUE);
        System.out.println("Random list "+ list);

        //what are unique values are in a list
        Set<Integer>values=uniqueValues(list);
        System.out.println("unique values are "+ values);

        ArrayList<Integer>missingElements=whosMissing(list,MAX_VALUE);
    }

    private static ArrayList<Integer> whosMissing(ArrayList<Integer> list,int max) {
        ArrayList<Integer>missingNums=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {


        }
    }

    /**
 * which elements are missing?
   *
    */

    public static Set<Integer> uniqueValues(ArrayList<Integer>list){
        Set<Integer>storeUnique=new HashSet<>();
        for (int i = 0; i <list.size() ; i++) {
            storeUnique.add(list.get(i))
        }
        return storeUnique;
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
