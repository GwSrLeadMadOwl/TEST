package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception{
        super.setUp();
        person = new Person();
    }
    //TODO: create teardown
    protected void tearDown() throws Exception{
        person = null;
        super.tearDown();
    }
    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight(){
        //standard test case
        int testWeight1 = 105;
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getWeight());

        // test case with a negative number
        int testWeight2 = -10;
        person.setWeight(testWeight2);
        assertEquals(testWeight2, person.getWeight());

        //test case exceeded limit
        int testWeight3 = 200;
        person.setWeight(testWeight3);
        assertEquals(testWeight3, person.getWeight());
    }

    public void testSetAndGetHeight(){
        //STANDARD TEST CASE
        float testHeight = 190;
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());

        // test case with a negative number
        float testHeight2 = -10;
        person.setHeight(testHeight2);
        assertEquals(testHeight2, person.getHeight());

        //test case exceeded limit
        float testHeight3 = 200;
        person.setHeight(testHeight3);
        assertEquals(testHeight3, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyMassIndex(){
        //Standard testing
        int a = 105;
        float b = 190;
        double bmi = a/Math.sqrt(b);
        assertEquals(bmi, person.getBodyMassIndex(a,b));

        //test case with a negative number
        int a2 = -105;
        float b2 = -190;
        double bmi2 = a/Math.sqrt(b);
        assertEquals(bmi2, person.getBodyMassIndex(a,b));

        //test case exceeded limit
        int a3 = 200;
        float b3 = 200;
        double bmi3 = a/Math.sqrt(b);
        assertEquals(bmi3, person.getBodyMassIndex(a,b));
    }

}