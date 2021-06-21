package be.digitalcity.formation;

import java.util.*;

public class mainFunctions {
    public static void main(String[] args) {
        CollectionsListes();


    }




    private static void tableauAssociatif() {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(15,"Hello");
        map.put(17,"Bonjour");
        map.put(24,"Bonsoir");

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        //for (Integer key = map.keySet()) System.out.println(key);

    }

    private static void CollectionsListes() {
        ArrayList <Integer> list = new ArrayList<Integer>();
        //Généricité :

        /*
        En généricité on ne pet jamais utiliser de type primitif, toujours des objets/wrappers
        go check : https://app.pluralsight.com/library/courses/java-generics/table-of-contents
         */

        list.add(5); // .add retourne une booléen : true de base car .add est ici utilisé avec une arrayList qui
                        // accèpte les doublons, false si .add est utilisé avec un set qui lui n'accèpte pas
                        //les doublons
        if(list.add(5)) System.out.println("plop"); //va afficher plop

        //sort croissant

        list.sort(Comparator.comparingInt(x -> x));
        // list.sort((x,y) -> (x -y)); //Même chose

        //sort décroissant

        list.sort((x,y) -> (y - x));

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(55);
        set.add(44);
        set.add(44); //ça va compiler malgré le doublon, mais 44 n'apparaitra qu'une fois

        System.out.println("size" + set.size());
        set.forEach(System.out::println);
    }
}
