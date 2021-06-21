package be.digitalcity.formation.exercices;

//        Réalisez un algorithme qui détermine la date du lendemain. La date du jour étant rentrée par
//        l'utilisateur sous la forme de nombre évidemment.

import java.time.LocalDate;

public class ExerciceDivers1 {
    public static void main(String[] args) {

        //Partie logique

        System.out.println("Expected 01/01/02 : "+getNextDate(31,12,1));
        System.out.println("Expected 02/01/12 : "+getNextDate(1,1,12));
        System.out.println("Expected 29/02/04 : "+getNextDate(28,2,4));
        System.out.println("Expected 01/03/02 : "+getNextDate(28,2,2));
        System.out.println("Expected 01/07/1192 : "+getNextDate(30,6,1192));

        //LocalDate

        System.out.println("Expected 01/01/02 : "+getNextDay(31,12,1));
        System.out.println("Expected 02/01/12 : "+getNextDay(1,1,12));
        System.out.println("Expected 29/02/04 : "+getNextDay(28,2,4));
        System.out.println("Expected 01/03/02 : "+getNextDay(28,2,2));
        System.out.println("Expected 01/07/1192 : "+getNextDay(30,6,1192));
    }

    /**
     *
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static String getNextDate(int day, int month, int year){
        if(month == 2 && day == 28 && isBissextile(year)) return "Demain nous serons le 29/02/"+year;
        else if(month == 2) return "Demain nous serons le 01/03/"+year;
        if((month == 6 || month == 4 || month == 9 || month == 11 ) || day == 30 ) {
            int temp = month+1;
            String nextMonth;
            if (temp < 10) {
                nextMonth = "0" + temp;
                return "Demain nous serons le 01/" + nextMonth + "/" + year;
            } else return "Demain nous serons le 01/" + (++month) + "/" + year;
        }
        else if (day == 31) {
            int temp = month+1;
            String nextMonth;
            if (temp < 10) {
                nextMonth = "0" + temp;
                return "Demain nous serons le 01/" + nextMonth + "/" + year;
            } else if(temp == 13) return "Demain nous serons le 01/01/"+ ++year;
            return "Demain nous serons le 01/" + (++month) + "/" + year;
        }
        if(day<10 && month<10) return "Demain nous serons le 0"+(++day)+"/0"+month+"/"+year;
        else if (day<10) return "Demain nous serons le 0"+(++day)+"/"+month+"/"+year;
        if(month<10) return "Demain nous serons le "+ ++day + "/0"+month+"/"+year;
        return "Demain nous serons le "+ ++day + "/"+month+"/"+year;
    }

    public static  boolean isBissextile(int year){
        return (year%4==0 && year%100 != 0) || year%400 ==0;
    }

    public static LocalDate getNextDay(int day, int month, int year){
        return LocalDate.of(year, month, day).plusDays(1);
    }
}
