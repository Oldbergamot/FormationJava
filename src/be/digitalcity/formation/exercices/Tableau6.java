package be.digitalcity.formation.exercices;

//        En considérant deux tableaux d'entiers (non triés), réalisez un algorithme qui place tous les
//        éléments des deux tableaux dans un troisième. Ce dernier doit être trié une fois l'algorithme
//        terminé. Notez que le tri doit être fait en même temps que la fusion des deux tableaux et pas
//        après.

import java.util.Random;

public class Tableau6 {
    public static void main(String[] args) {
        int [] array1 = {1,3,5,7,9};
        int [] array2 = {15,2,4,6,8,129,0,36};
        int [] array3;

        //Check for biggest int

        int max = Integer.MAX_VALUE;

        if (isPresent(max, array1) || isPresent(max, array2)) {
            while (isPresent(max, array1) || isPresent(max, array2)) {
                max = new Random().nextInt(Integer.MAX_VALUE);
            }
        }
        array3 = pasteAndSort(array1, array2, max);
        displayArray(array3);
    }

    /**
     * @param n a random int chosen to replace the values in pasteAndSort()
     * @param array one of the two array to be sorted
     * @return true when n is present in array
     */
    public static boolean isPresent(int n, int [] array) {
        for (int i : array) {
            if(i==n) return true;
        }
        return false;
    }

    /**
     * Return a new array with the values of both arrays sorted
     * @param array1 first set of data
     * @param array2 second set of data
     * @param val reserved value witch is not present in the arrays, used to replace already copied data
     * @return a new int array with the values of both arrays sorted
     */
    public static int[] pasteAndSort(int [] array1, int [] array2, int val) {
        int [] result = new int[array1.length+ array2.length];
        int min = array1[0];
        int indice = 0;
        int nbArray = 0;

        for (int i = 0 ; i < result.length ; i++) { //indice pour remplir le nouveau tableau
            for (int j = 0 ; j < array1.length ; j++) {  //recherche du minimum dans array1
                if(min > array1[j] && array1[j]!=val) {
                    min = array1[j];
                    indice = j;
                    nbArray = 0;
                }
            }
            for (int k = 0; k < array2.length ; k++) {  //recherche du minimum dans array2
                if(min > array2[k] && array2[k]!=val) {
                    min = array2[k];
                    indice = k;
                    nbArray = 1;
                }
            }
            result[i] = min;
            min = Integer.MAX_VALUE;
            if(nbArray==0) array1[indice] = val;
            else array2[indice] = val;
        }
        return result;
    }

    /**
     * Display every int int the given array in console
     * @param array, the int array to be display
     */
    public static void displayArray(int[] array){
        for (int i : array){
            System.out.println(i);
        }
    }
}
