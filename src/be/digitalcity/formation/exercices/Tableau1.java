package be.digitalcity.formation.exercices;

import java.util.Scanner;

//        Écrire un algorithme qui saisit 6 entiers et les stocke dans un tableau, puis affiche le contenu
//        de ce tableau une fois qu’il est rempli.

public class Tableau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [6];

        for (int i = 0 ; i < 6 ; i++) {
            System.out.println("Veuillez entrer un nombre");
            array[i]= sc.nextInt();
        }

        for (int i : array){
            System.out.println(i);
        }
    }
}
