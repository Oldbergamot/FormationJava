package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class PlusOuMoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt, price = 158;

        System.out.println("Veuillez entrer un nombre");
        attempt = sc.nextInt();

        while(price != attempt) {
            if(attempt>price) System.out.println("C'est moins");
            else System.out.println("c'est plus!");
            attempt = sc.nextInt();
        }
        System.out.println(price + " est le bon prix");
    }
}
