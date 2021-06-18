package be.digitalcity.formation.exercices;

import java.util.Scanner;

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
