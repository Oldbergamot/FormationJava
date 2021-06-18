package be.digitalcity.formation.exercices;

//        Refaites l'algorithme qui demande à l’utilisateur de taper 10 entiers et qui affiche le plus petit
//        de ces entiers mais cette fois-ci à l'aide d'un tableau et sans retenir le minimum lors de la
//        saisie.

import java.util.Scanner;

public class Tableau9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];

        //fill the array

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Veuillez entrer la valeur de la cellule "+i);
            array[i] = sc.nextInt();
        }

        System.out.println("Le plus petit est "+getMin(array));
    }

    /**
     * return the smallest int in the given array
     */
    public static int getMin(int [] array) {
        int min = array [0];
        for (int i = 1 ; i < array.length ; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }
}
