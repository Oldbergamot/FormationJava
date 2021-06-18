package be.digitalcity.formation.exercices;

public class ExerciceInversionVariables {
    public static void main(String[] args) {
        System.out.println("Inversion de variables");
        int n1 = 5;
        int n2 = 7;
        int temp;

        System.out.println("La valeur 1 vaut "+n1+", la valeur deux vaut "+n2);

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("La valeur 1 vaut "+n1+", la valeur deux vaut "+n2);
    }
}
