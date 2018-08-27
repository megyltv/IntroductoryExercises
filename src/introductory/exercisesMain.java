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

        //Get value of n -- Draw horizontal line
        System.out.println("Give value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());


        exercise.drawHorinzontalLine(n);

        //Get value of n -- Draw vertical line
        System.out.println("\nGive value of n: ");
        Scanner inValueN2 = new Scanner(System.in);
        n=Integer.parseInt(inValueN2.nextLine());
        exercise.drawVerticalLine(n);



    }
}
