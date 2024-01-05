package edu.estu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {
    public void testInfiniteLoopBug() {
        // Write a failing test case to demonstrate the bug in the infiniteLoop method
        try {
            // Provide a specific input that triggers the infinite loop
            App.infiniteLoop(Double.POSITIVE_INFINITY);

            // If the infinite loop is not triggered, fail the test
            Assert.fail("Expected an infinite loop, but the method did not enter into one.");
        } catch (Exception e) {
            // The infinite loop is expected to throw an exception, which is okay in this case
        }
    }
}

