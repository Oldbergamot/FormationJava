package be.digitalcity.formation.exercices;

public class testRegEx {
    public static void main(String[] args) {
        String regEx = "[rgbypw]{4}";
        String test = "rgwyhg";
        System.out.println(test.matches(regEx));
    }
}
