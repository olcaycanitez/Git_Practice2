package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,73,35,47,60,87,77,67,57,47,93,83,73,63,53,43));

        System.out.println( list);


        ArrayList<Integer> gradeA = new ArrayList<>(); // 90 ~ 100
        gradeA.addAll( list );
        gradeA.removeIf( a -> a < 90 );
        System.out.println("Grade A: "+ gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(); //80 ~ 89
        gradeB.addAll(list);
        gradeB.removeIf(b -> b <80 || b >89 ); // if the grade is either less than 80 or greater than 89 should be removed
        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(); // 70 ~ 79
        gradeC.addAll(list);
        gradeC.removeIf(c -> c < 70 || c >79 ); // if the grade is either less than 70 or greater than 79 should be removed
        System.out.println("Grade C: "+ gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf( d -> d < 60 || d > 69); // if the grade is either less than 60 or greater than 69 should be removed
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(); //  0 ~ 59
        gradeF.addAll(list);
        gradeF.removeIf( f -> f > 59);
/*
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeD.removeAll(gradeD);


 */
        System.out.println("Grade F: "+ gradeF);




    }

}
