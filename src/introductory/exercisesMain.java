package introductory;

import java.util.Scanner;

public class exercisesMain {
    public static void main (String[] args){
        //Setting variables
        int n;
        String asterisk="*";
        exercisesClass exercise;

        //Exercises One
        exercise = new exercisesClass();
        exercise.exerciseOne();

        //Get value of n
        System.out.println("Give value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());

        //System.out.println(n);

        exercise.drawHorinzontalLine(n);


    }
}
