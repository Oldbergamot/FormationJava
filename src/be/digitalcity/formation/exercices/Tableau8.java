package be.digitalcity.formation.exercices;

//        Réalisez un algorithme permettant de rechercher une valeur dans un tableau. Si la valeur se
//        trouve bien dans la tableau, nous affichons sa position.

public class Tableau8 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Expected 2 : " +getPositionInArray(3, array));
        System.out.println("Expected -1 : " +getPositionInArray(15, array));
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
}
