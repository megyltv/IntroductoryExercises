package introductory;

import java.util.Scanner;

public class exercisesMain {
    public static void main (String[] args){
        //Setting variables
        int n;
        int optionMenu;
        int auxMenu=0;
        exercisesClass exercise;
        exercise = new exercisesClass();






        do {
            //Define menu options
            System.out.println("\nSelect exercise");
            System.out.println("TRIANGLE EXERCISES");
            System.out.println("1. Print one asterisk to console");
            System.out.println("2. Draw a horizontal line");
            System.out.println("3. Draw a vertical line");
            System.out.println("4. Draw a right triangle");

            System.out.println("DIAMOND EXERCISES");
            System.out.println("5. Draw an isosceles triangle");
            System.out.println("6. Draw a diamond");
            System.out.println("7. Draw a diamond with name");

            System.out.println("8. FizzBuzz Exercise");
            System.out.println("9. Prime Factors");
            System.out.println("10. Salir");
            System.out.print("Option: ");

            //Read value for menu
            Scanner inValueN = new Scanner(System.in);
            optionMenu=Integer.parseInt(inValueN.nextLine());

            switch (optionMenu) {
                case 1:
                    //Exercises One
                    exercise.exerciseOne();
                    break;
                case 2:
                    //Get value of n -- Draw horizontal line
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.drawHorinzontalLine(n);
                    break;
                case 3:
                    //Get value of n -- Draw vertical line
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.drawVerticalLine(n);
                    break;
                case 4:
                    //Get value of n -- Draw right triangle
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.drawRightTriangle(n);
                    break;

                case 5:
                    //Get value of n -- Draw isosceles triangle
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.isoscelesTriangle(n);
                    break;
                case 6:
                    //Get value of n -- Draw diamond exercise
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.drawDiamond(n);
                    break;
                case 7:
                    //Get value of n -- Draw diamond with name exercise
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.drawDiamondWithName(n);
                    break;
                case 8:
                    //FizzBuzz Exercise
                    exercise.fizzBuzzExercise();
                    break;
                case 9:
                    //Get value of n -- Draw diamond with name exercise
                    System.out.println("\nGive value of n: ");
                    inValueN = new Scanner(System.in);
                    n = Integer.parseInt(inValueN.nextLine());
                    exercise.primeFactorsExercise(n);
                    break;
                case 10:
                    auxMenu = 1;
                    break;
            }
        }while(auxMenu==0);

    }
}
