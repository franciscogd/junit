package com.vogella.junit.first;
/**
 * Created by fgonzalez on 1/27/17.
 */
public class MyClass {
    public int multiply(int x, int y) {
        // the following is just an example
        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }
}