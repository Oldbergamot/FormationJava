package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class ConversionSecondes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbSec;
        int jours, heures, minutes, secondes;

        System.out.println("Convertisseur de secondes");
        System.out.println("========================= \n");

        System.out.println("Veuillez entrer un nombre de secondes");
        nbSec = sc.nextInt();

        jours = nbSec/3600/24;
        heures = nbSec/3600%24;
        minutes = nbSec/60%60;
        secondes = nbSec%60;

        System.out.println(nbSec+ " secondes représentent : "
                +jours +" jours "
                +heures + " heures "
                +minutes +" minutes "
                +secondes +" secondes ");

        sc.close(); //ferme le flux du scanner
    }
}
