package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class SaisieMotDePasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password, attempt;
        password = "********";
        int nbTry = 1;

        System.out.println("Veuillez entrer votre mot de passe");
        attempt = sc.nextLine();

        while(!attempt.equals(password) && nbTry !=3){
            System.out.println("Mauvais mot de passe. Il vous reste "+ (3-nbTry)+ " essais");
            attempt = sc.nextLine();
            nbTry++;
            if(nbTry==3) System.out.println("compte bloqué");
        }
        if(password.equals(attempt)) System.out.println("Vous êtes connecté");
    }
}
