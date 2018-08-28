package introductory;

import java.util.Scanner;

public class exercisesMain {
    public static void main (String[] args){
        //Setting variables
        int n;
        int optionMenu;
        int optionSubMenu;
        exercisesClass exercise;
        exercise = new exercisesClass();

        //Define menu options
        System.out.println("Select type of exercise");
        System.out.println("1. Triangle exercises");
        System.out.println("2. Diamond exercises");
        System.out.println("3. FizzBuzz Exercise");
        System.out.println("4. Prime Factors");
        System.out.print("Option: ");


        //Read value for menu
        Scanner inValueN = new Scanner(System.in);
        optionMenu=Integer.parseInt(inValueN.nextLine());

        switch (optionMenu){
            case 1:
                //Options menu
                System.out.println("\nSelect number of exercise: ");
                System.out.println("1. Print one asterisk to console");
                System.out.println("2. Draw a horizontal line");
                System.out.println("3. Draw a vertical line");
                System.out.println("4. Draw a right triangle");
                System.out.print("Option: ");

                //Get value
                inValueN=new Scanner(System.in);
                optionSubMenu=Integer.parseInt(inValueN.nextLine());

                switch (optionSubMenu){
                    case 1:
                        //Exercises One
                        exercise.exerciseOne();
                        break;
                }
                break;
            case 2:
                System.out.println("1. Draw an isosceles triangle");
                System.out.println("2. Draw a diamond");
                System.out.println("3. Draw a diamond with name");

                //Get value
                inValueN=new Scanner(System.in);
                optionSubMenu=Integer.parseInt(inValueN.nextLine());

                switch (optionSubMenu){
                    case 1:
                        //Exercises One
                        exercise.exerciseOne();
                        break;
                }

                break;

            case 3:
                break;

            case 4:
                break;

        }

        //TRIANGLE EXERCISES



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
        /*System.out.println("\nGive value of n: ");
        Scanner inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());
        exercise.drawDiamond(n);*/

        //Get value of n -- Draw diamond with name exercise
        System.out.println("\nGive value of n: ");
        inValueN = new Scanner(System.in);
        n=Integer.parseInt(inValueN.nextLine());
        exercise.drawDiamondWithName(n);

    }
}
