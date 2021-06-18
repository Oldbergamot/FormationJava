package be.digitalcity.formation.exercices;

import java.util.Scanner;

public class LePlusPetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb;
        int min;

        System.out.println("Veuillez entrer un nombre");
        nb = sc.nextInt();
        min = nb;
        for(int i = 0; i < 9 ; i++) {
            System.out.println("Veuillez entrer un nombre");
            nb = sc.nextInt();
            if(nb<min) min = nb;
        }
        System.out.println("Le plus petit nombre est "+min);


    }
}
