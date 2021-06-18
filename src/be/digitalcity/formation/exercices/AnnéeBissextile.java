package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class AnnéeBissextile {
    public static void main(String[] args) {
        int annee;
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer une année");
        annee = sc.nextInt();

        if( (annee % 4==0 && annee % 100 != 0) || annee % 400 == 0) {
            System.out.println("L'année "+annee+" est bissextile");
        } else {
            System.out.println("L'année "+annee+" n'est pas bissextile");
        }
    }
}
