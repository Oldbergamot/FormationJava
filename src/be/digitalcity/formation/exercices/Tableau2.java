package be.digitalcity.formation.exercices;

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
