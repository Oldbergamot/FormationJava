package be.digitalcity.formation.exercices;

//        Inverser un tableau : soit un tableau T. Saisir ce tableau. Changer de place les éléments de ce
//        tableau de façon à ce que le nouveau tableau soit une sorte de miroir de l'ancien et afficher
//        le nouveau tableau.

public class Tableau4 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int [] mirror = new int [array.length];
        int indice = array.length-1;
        for(int i = 0 ; i < array.length ; i++){
            mirror[i]=array[indice];
            indice --;
        }
        for (int i : mirror) {
            System.out.println(i);
        }
    }
}
