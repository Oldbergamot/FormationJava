package be.digitalcity.formation.exercices;

public class Sapin {
    public static void main(String[] args) {
        int k = 0;
        int decallage = 5;

        for (int i = 1 ; i <10 ; i+=2) {
            for (int j = 0 ; j < decallage ; j++) {
                System.out.print(" ");
            }
            decallage--;
            while(k<i) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            k = 0;
        }
    }
}
