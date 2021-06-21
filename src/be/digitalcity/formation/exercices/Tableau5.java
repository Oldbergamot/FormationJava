package be.digitalcity.formation.exercices;

//         À l’aide des boucles, réalisez un algorithme permettant de trier un tableau d’entier dans
//        l’ordre croissant. Mettez-le ensuite en pratique avec le C#.

public class Tableau5 {
    public static void main(String[] args) {
        int [] array = {4,6,1,5,3,2,9,8,7};
        int i,j, temp;

        i = 0 ;
        while (i < array.length-1) {
            j=i+1;
            while(j < array.length) {
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;
        }

        for (int k : array ){
            System.out.println(k);
        }
    }
}
