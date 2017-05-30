package com.memtrip.algorithm.training.string_array;

import com.memtrip.algorithm.training.Result;

/*

    Rotate an array of n elements to the right by k steps.

    For example, with n = 7 and k = 3, the array [ 1, 2, 3, 4, 5, 6, 7 ] is rotated to [ 5, 6, 7, 1, 2, 3, 4 ].
    How many different ways do you know to solve this problem?

 */
class RotateArray implements Result<int[]> {

    private final int[] result;

    RotateArray(int k, int[] input) {

        int[] right = new int[k];

        int count = k - 1;
        int unaffected = (input.length - k);
        for (int i = input.length - 1; i >= unaffected; i--) {
            right[count] = input[i];
            count--;
        }

        int[] reversed = new int[input.length];
        for (int i = 0; i < reversed.length; i++) {
            if (i < right.length) {
                reversed[i] = right[i];
            } else {
                reversed[i] = input[i-k];
            }
        }

        result = reversed;
    }

    public int[] result() {
        return result;
    }
}