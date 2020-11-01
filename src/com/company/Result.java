package com.company;

class Result {
    // assumes that n is a positive integer
    static boolean isMultipleof(int n, int multiple_number) {
        while (n > 0)
            n = n - multiple_number;

        if (n == 0)
            return true;

        return false;
    }

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (isMultipleof(i, 5) == true && isMultipleof(1, 3)) {
                System.out.println("FizzBuzz");
            }
            if (isMultipleof(i, 3) && !isMultipleof(i, 5)) {
                System.out.println("Fizz");
            }
            if (isMultipleof(i, 5) && !isMultipleof(i, 3)) {
                System.out.println("Buzz");
            }
            if (!isMultipleof(i, 5) && !isMultipleof(i, 5)) {
                System.out.println(i);
            }
        }
    }

}
