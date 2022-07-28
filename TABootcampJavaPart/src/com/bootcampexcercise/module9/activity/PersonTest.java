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
        assertEquals(null, person.getWeight());
        assertNull(person.getWeight());
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getWeight());

        // test case with a negative number
        int testWeight2 = -10;
        assertEquals(null, person.getWeight());
        assertNull(person.getWeight());
        person.setWeight(testWeight2);
        assertEquals(testWeight2, person.getWeight());

        //test case exceeded limit
        int testWeight3 = 200;
        assertEquals(null, person.getWeight());
        assertNull(person.getWeight());
        person.setWeight(testWeight3);
        assertEquals(testWeight3, person.getWeight());
    }

    public void testSetAndGetHeight(){
        //STANDARD TEST CASE
        float testHeight = 190;
        assertEquals(null, person.getHeight());
        assertNull(person.getHeight());
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());

        // test case with a negative number
        int testHeight2 = -10;
        assertEquals(null, person.getHeight());
        assertNull(person.getHeight());
        person.setWeight(testHeight2);
        assertEquals(testHeight2, person.getHeight());

        //test case exceeded limit
        int testHeight3 = 200;
        assertEquals(null, person.getHeight());
        assertNull(person.getHeight());
        person.setWeight(testHeight3);
        assertEquals(testHeight3, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testGetBodyMassIndex(){
        double testBMI;
    }

}