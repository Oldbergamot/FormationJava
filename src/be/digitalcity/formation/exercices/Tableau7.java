package be.digitalcity.formation.exercices;

//        Réalisez un algorithme nous permettant de déplacer un pion dans un tableau de 10 éléments.
//        Au début, le pion se trouve dans la première case du tableau. Nous pouvons ensuite le
//        déplacer par la gauche (g), par la droite (d) ou de stopper l'algorithme (q).

import java.util.Arrays;
import java.util.Scanner;

public class Tableau7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] board = new char[10];
        int position;
        String direction ="";
        position = 0;

        //array init

        for (int i = 1 ; i < board.length ; i++) {
            board[i] = 'x';
        }
        board[0] = 'O';

        //pourait être changé en switch

        while (!direction.equals("q")){
            System.out.println("Le pion est en position "+position+ ", voulez vous le déplacer? (gauche :g, droite d, quitter : q)");
            displayArray(board);
            direction = sc.nextLine();

            if(direction.equals("d") && position != board.length-1) { //prevents out of bound exception
                board[position] = 'x';
                position++;
                board[position] = 'O';
            }
            else if(direction.equals("d")) {
                System.out.println("Le pion ne peut plus se déplacer à droite!");
            }
            else if(direction.equals("g") && position != 0) { //prevents out of bound exception
                board[position] = 'x';
                position--;
                board[position] = 'O';
            }
            else if(direction.equals("g")) {
                System.out.println("Le pion ne peut plus se déplacer à gauche!");
            }
            else if( !direction.equals("q")) System.out.println("Direction non recconue");
        }
    }

    public static void displayArray(char [] array){
//        //logique
//
//        System.out.print('[');
//        for (char c : array) {
//            System.out.print(c);
//            System.out.print(',');
//        }
//        System.out.println(']');

        //toString
        System.out.println(Arrays.toString(array));
    }
}
