package com.memtrip.algorithm.training.string_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/*

    Rotate an array of n elements to the right by k steps.

    For example, with n = 7 and k = 3, the array [ 1, 2, 3, 4, 5, 6, 7 ] is rotated to [ 5, 6, 7, 1, 2, 3, 4 ].
    How many different ways do you know to solve this problem?

 */
public class RotateArrayTests {

    @Test
    public void pass1() {

        // given
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        // when
        RotateArray rotateArray = new RotateArray(3, input);

        // then
        assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, rotateArray.result());
    }

    @Test
    public void pass2() {

        // given
        int[] input = new int[] { 1, 2, 3 };

        // when
        RotateArray rotateArray = new RotateArray(2, input);

        // then
        assertArrayEquals(new int[] { 2, 3, 1 }, rotateArray.result());
    }
}