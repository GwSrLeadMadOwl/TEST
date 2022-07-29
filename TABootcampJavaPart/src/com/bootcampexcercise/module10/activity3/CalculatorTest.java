package com.bootcampexcercise.module10.activity3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testGetSum() {

        double a = 5;
        double b = 10;
        assertEquals(15.0, (calculator.add(a,b)));
        assertEquals(15.0, (calculator.add(b,a)));

        a = -5;
        b = 10;
        assertEquals(5.0, (calculator.add(a,b)));
        assertEquals(5.0, (calculator.add(b,a)));

        a = -5;
        b = -10;
        assertEquals(-15.0, (calculator.add(a,b)));
        assertEquals(-15.0, (calculator.add(b,a)));
    }

    public void testGetDifference() {

        double a = 3;
        double b = 2;
        assertEquals(1.0, (calculator.subtract(a,b)));
        assertEquals(-1.0, (calculator.subtract(b,a)));

        a = 5;
        b = -4;
        assertEquals(9.0, (calculator.subtract(a,b)));
        assertEquals(-9.0, (calculator.subtract(b,a)));

        a = -10;
        b = -5;
        assertEquals(-5.0, (calculator.subtract(a,b)));
        assertEquals(5.0, (calculator.subtract(b,a)));
    }

    public void testGetProduct() {

        double a = 5;
        double b = 10;
        assertEquals(50.0, (calculator.multiply(a,b)));
        assertEquals(50.0, (calculator.multiply(b,a)));

        a = -5;
        b = 10;
        assertEquals(-50.0, (calculator.multiply(a,b)));
        assertEquals(-50.0, (calculator.multiply(b,a)));

        a = -3;
        b = -10;
        assertEquals(30.0, (calculator.multiply(a,b)));
        assertEquals(30.0, (calculator.multiply(b,a)));
    }

    public void testGetQuotient() {

        double a = 10;
        double b = 5;
        assertEquals(2.0, (calculator.divide(a,b)));
        assertEquals(0.5, (calculator.divide(b,a)));

        a = 9;	b = -3;
        assertEquals(-3.0, (calculator.divide(a,b)));
        assertEquals(-0.3333333333333333, (calculator.divide(b,a)));

        a = -10;	b = -5;
        assertEquals(2.0, (calculator.divide(a,b)));
        assertEquals(0.5, (calculator.divide(b,a)));
    }
}
