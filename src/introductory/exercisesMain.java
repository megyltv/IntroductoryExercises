package introductory;

import java.util.Scanner;

public class exercisesMain {
    public static void main (String[] args){
        //Setting variables
        int n;
        String asterisk="*";
        exercisesClass exercise;

        exercise = new exercisesClass();

        //TRIANGLE EXERCISES

        //Exercises One
        //exercise.exerciseOne();

        //Get value of n -- Draw horizontal line
        /*System.out.println("Give value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());


        exercise.drawHorinzontalLine(n);*/

        //Get value of n -- Draw vertical line
        /*System.out.println("\nGive value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());
        exercise.drawVerticalLine(n);*/

        //Get value of n -- Draw right triangle
        /*System.out.println("\nGive value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());
        exercise.drawRightTriangle(n);*/


        //DIAMOND EXERCISES

        //Get value of n -- Draw isosceles triangle
        /*System.out.println("\nGive value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());
        exercise.isoscelesTriangle(n);*/

        //Get value of n -- Draw diamond exercise
        System.out.println("\nGive value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());
        exercise.drawDiamond(n);

    }
}
