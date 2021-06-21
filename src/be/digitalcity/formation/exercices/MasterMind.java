package be.digitalcity.formation.exercices;

import java.util.ArrayList;
import java.util.Random;

public class MasterMind {
    static char [] c = generateCombination();
    public static void main(String[] args) {
        boolean isGameOver = false;
        displayCombination(c);

//        while(!isGameOver){
//            play();
//        }

    }

    private static char [] generateCombination() {
        ArrayList <Character> possibilities = new ArrayList<>();
        possibilities.add('r'); //red
        possibilities.add('g'); //green
        possibilities.add('y'); //yellow
        possibilities.add('b'); //blue

        Random r = new Random();
        int temp = 0;
        char [] combination = new char[4];
        for (int i = 0 ; i <combination.length ; i++) {
            temp = r.nextInt(( combination.length)- i);
            combination[i]= possibilities.get(temp);
            possibilities.remove(temp);
        }
        return combination;
    }

    private static void play() {
        char [] candidate = askCombination();
//        compareCombination(candidate);
    }

    /**
     * Return an array of char, if the value is 'v' the color is good and well placed,
     * the value is 'x' the color is good but not well placed
     * if the value is ' ' , it's a wrong color.
     * @param candidate the array of char that's going to be compare to the solution
     */
    private static char[] compareCombination(char[] candidate) {
        //1 display 'v'
        //2 display 'x'
        int v = 0;
        int x = 0;
        char [] result = new char[candidate.length];
        for (int i = 0 ; i < candidate.length ; i++) {
            if (candidate[i] == c[i]) v++;
        }

        //generate the array with v and x
        for (int  i = 0 ; i < result.length ; i++) {
        }
        return null;
    }

    private static char[] askCombination() {
        return null;
    }

    private static void displayCombination(char [] comb) {
        for(char c : comb) {
            System.out.println(c);
        }
    }
}
