package com.apps;

import org.junit.jupiter.api.Test;

import com.apps.QuantityMeasurement.QuantityMeasurmentApp.Feet;
import com.apps.QuantityMeasurement.QuantityMeasurmentApp.Inches;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurmentAppTest {

    @Test
    void testInchesEquality_SameValue() {
        assertEquals(new Inches(2.5), new Inches(2.5));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        assertNotEquals(new Inches(5.0), new Inches(7.0));
    }

    @Test
    void testInchesEquality_NullComparison() {
        assertNotEquals(new Inches(5.2), null);
    }

    @Test
    void testInchesEquality_NonNumericInput() {
        assertNotEquals(new Inches(4.1), "Other String");
    }

    @Test
    void testInchesEquality_SameReference() {
        Inches f1=new Inches(8.3);
        assertEquals(f1,f1);
    }

    // FEET TESTS

    @Test
    void testFeetEquality_SameValue() {
        assertEquals(new Feet(2.5), new Feet(2.5));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertNotEquals(new Feet(5.0), new Feet(7.0));
    }

    @Test
    void testFeetEquality_NullComparison() {
        assertNotEquals(new Feet(5.2), null);
    }

    @Test
    void testFeetEquality_NonNumericInput() {
        assertNotEquals(new Feet(4.1), "Other String");
    }

    @Test
    void testFeetEquality_SameReference() {
        Feet f1=new Feet(8.3);
        assertEquals(f1,f1);
    }
}
