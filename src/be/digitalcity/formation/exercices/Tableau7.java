package be.digitalcity.formation.exercices;

//        Réalisez un algorithme nous permettant de déplacer un pion dans un tableau de 10 éléments.
//        Au début, le pion se trouve dans la première case du tableau. Nous pouvons ensuite le
//        déplacer par la gauche (g), par la droite (d) ou de stopper l'algorithme (q).

import java.util.Scanner;

public class Tableau7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [] board = new boolean[10];
        int position;
        String direction ="";
        board[0] = true;
        position = 0;

        while (!direction.equals("q")){
            System.out.println("Le pion est en position "+position+ ", voulez vous le déplacer? (gauche :g, droite d, quitter : q");
            direction = sc.nextLine();
            if(direction.equals("d") && position != 9) { //prevents out of bound excpetion
                board[position] = false;
                position++;
                board[position] = true;
            }
            else if(direction.equals("g") && position != 0) { //prevents out of bound excpetion
                board[position] = false;
                position--;
                board[position] = true;
            }
        }
    }
}
