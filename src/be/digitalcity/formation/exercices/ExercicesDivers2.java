package be.digitalcity.formation.exercices;

//        Reprenez l'algorithme précédent, mais utilisez un tableau pour que l'utilisateur puisse rentrer
//        le mois sous la forme : "janvier", "juillet", etc.

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class ExercicesDivers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le jour");
        int day = sc.nextInt();

        System.out.println("Veuillez entrer le mois (chaine de caractère)");
        String month = sc.next();

        System.out.println("Veuillez entrer l'année");
        int year = sc.nextInt();

        System.out.println(getNextDay(day, month, year));
    }

    /**
     * @return the date of the next day of the given date
     */
    public static LocalDate getNextDay(int day, String month, int year){
        try {
            String[] months = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};
            int monthPosition = getPositionInArray(month, months);
            return LocalDate.of(year, monthPosition, day).plusDays(1);
        }
        catch (Exception badMonth){
            System.out.println(badMonth.getMessage());
        }
        return null;
    }

    /**
     * @return the position of the given String in the given array or -1 if the String is not present in the array
     */
    public static int getPositionInArray(String s, String [] array){
        for (int i = 0 ; i < array.length ; i++ ){
            if (array[i].equals(s.toLowerCase(Locale.ROOT))) return i;
        }
        return -1;
    }


}
