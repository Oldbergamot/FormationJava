package be.digitalcity.formation.exercices;

//        BONUS : initialiser un tableau de 10 entiers avec les valeurs 2, 4, 8, 16, 32, 64, 128, 256, 512,
//        1024 à l’aide d’une boucle. Ensuite, à l’aide d’une boucle afficher la valeur de chaque cellule
//        du tableau avec l’opération Ecrire().

public class Tableau2 {
    public static void main(String[] args) {
        int [] array = new int [10];

        for (int i = 1 ; i < 11 ; i++) {
            array[i-1] = (int) Math.pow(2,i);
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
