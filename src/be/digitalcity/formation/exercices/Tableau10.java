package be.digitalcity.formation.exercices;

//        En considérant un tableau d'entiers trié dans l'ordre croissant, réaliser un algorithme étant
//        capable d'insérer une nouvelle valeur dans le tableau de façon à ce que la tableau reste trié.
//        Le but n'est évidemment pas d'insérer la valeur à la fin et de trier après mais bien de l'insérer
//        au bon endroit directement.

import java.util.Arrays;

public class Tableau10 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,7,8,9,10};
        int [] newArray = insertVal(0,array);

        //display 1,2,3,4,5,6,7,8,9,10
        //int [] newArray = insertVal(6,array);

        //display 0,1,2,3,4,5,6,7,8,9,10
        //int [] newArray = insertVal(0,array);

        //display 1,2,3,4,5,6,7,8,9,10,11
        //int [] newArray = insertVal(11,array);

        displayArray(newArray);

        //copy of the new array

        array = Arrays.copyOf(newArray, newArray.length);
        displayArray(array);
    }

    /**
     * return a new array with the new value placed so the array stay sorted
     * @param val an int to be inserted in array
     * @param array a sorted array of int
     * @return the new array with the inserted val
     */
    public static int [] insertVal(int val, int [] array) {
        int [] result = new int[array.length+1];
        int indice = 0;

        //if val is not smaller or bigger than any int in array
        if(!isBigger(val, array) && !isSmaller(val, array)) {
            while (array[indice] < val) {
                result[indice] = array[indice];
                indice++;
            }
            result[indice] = val;
            indice--;
            while (indice < array.length) {
                result[indice + 1] = array[indice];
                indice++;
            }
        }
        //if val is the smallest of the array
        else if(isSmaller(val, array)) {
            result[0] = val;
            for(int i = 0 ; i < array.length ; i++) {
                result[i+1] = array[i];
            }
        }
        //if val is the biggest
        else if(isBigger(val, array)) {
            for (int i = 0 ; i < array.length ; i++){
                result[i]= array[i];
            }
            result[result.length-1] = val;
         }

        return result;
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

    public static boolean isSmaller(int val, int [] array){
        for (int i : array){
            if(val > i) return false;
        }
        return true;
    }

    public static boolean isBigger(int val, int [] array) {
        for (int i : array) {
            if(val < i) return false;
        }
        return true;
    }
}
