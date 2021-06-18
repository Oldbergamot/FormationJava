package be.digitalcity.formation.exercices;

//            Réalisez un algorithme dans lequel nous devons rechercher une valeur (entrée par
//            l'utilisateur) dans un tableau d'entiers. Si on trouve cette valeur, nous devons la supprimer du
//            tableau.

import java.rmi.server.ExportException;

public class Tableau11 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

//        Expect 2,3,4,5
//        int [] result = deleteVal(1, array);
//        displayArray(result);
//
//        Expect 1,2,3,4
//        int [] result = deleteVal(5, array);
//        displayArray(result);
//
//        Expect 1,2,4,5
//        int [] result = deleteVal(3, array);
//        displayArray(result);

//        Expect 1,2,3,4,5 , val is not in the array
        int [] result = deleteVal(15, array);
        displayArray(result);


    }

    /**
     * Return a copy of the given array without the given value,
     * if the value is not in the array , return the first array
     * @param value, the int that must me removed from the array
     * @param array
     * @return a new
     */

    public static int [] deleteVal(int value, int [] array){
        int position = getPositionInArray(value, array);
        int[] result = new int [array.length-1];
        if (position == 0) {  //value is the first int of the array
            for (int i = 1 ; i < array.length ; i++) {
                result [i-1] = array[i];
            }
            return result;
        } else if (position == array.length-1) { //value is the last int of the array
            for(int i = 0 ; i < result.length ; i++) {
                result[i] = array[i];
            }
            return result;
        } else if( position !=-1){
            int indice = 0;
            while(indice<position) {
                result[indice] = array[indice];
                indice++;
            }
            indice++;
            while(indice<array.length){
                result[indice-1] = array[indice];
                indice++;
            }
            return result;
        }
        return array;
    }

    /**
     * @param n an int
     * @param array
     * @return the index of the first occurence of n in array, -1 if not present
     */
    public static int getPositionInArray(int n, int [] array){
        for (int i = 0 ; i < array.length ; i++ ){
            if (array[i] == n ) return i;
        }
        return -1;
    }

    /**
     * Display in console the array
     * @param array, an array of int
     */
    public static void displayArray(int [] array) {
        for(int i : array) {
            System.out.println(i);
        }
    }
}
