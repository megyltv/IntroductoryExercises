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
}