package tests;

import introductory.exercisesClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class exercisesClassTest {
    exercisesClass exercise=new exercisesClass();

    @Test
    public void exerciseOneTest(){
        Assertions.assertEquals("*",exercise.exerciseOne());
    }

    @Test
    public void drawHorizontalLineTest(){
        Assertions.assertEquals("*****",exercise.drawHorinzontalLine(5));
    }

    @Test
    public void primeFactorsExercisesTest(){
        Assertions.assertEquals("Factors: 2 3 5",exercise.primeFactorsExercise(30));
    }
}