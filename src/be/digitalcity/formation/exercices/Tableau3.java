package be.digitalcity.formation.exercices;

import java.util.Scanner;

//        Écrire un algorithme demandant à l’utilisateur le nombre de joueurs (max 10 joueurs).
//        Ensuite, l’algorithme doit demander à l’utilisateur le score de chaque joueur. Une fois ceci
//        fini, il faut afficher la moyenne des scores.

public class Tableau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de joueurs ");
        int nbPlayer = sc.nextInt();
        int [] scores = new int [nbPlayer];
        int mean = 0;
        for (int i = 0 ; i < nbPlayer ; i++) {
            System.out.println("Entrez score : ");
            scores[i] = sc.nextInt();
            mean += scores[i];
        }
        System.out.println("La moyenne des scores est "+(mean/nbPlayer));

    }
}
