package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
//    public static List<Integer> commonPrefix(List<String> inputs) {
//
//    }

    void fizzBuzz(int num) {
        long startTime = System.nanoTime();
        System.out.println("-----------------Execution Started---------------");
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0)) {
                System.out.println("FizzBuzz");
            }
            if ((i % 5) == 0) {
                System.out.println("Fizz");
            }
            if ((i % 5) == 0) {
                System.out.println("Buzz");
            }
            if (((i % 5) != 0) && ((i % 3) != 0)) {
                System.out.println(i);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("-----------------End Of Execution [ Time Taken " + TimeUnit.NANOSECONDS.convert(endTime - startTime, TimeUnit.MINUTES) + " min ]---------------");
    }



    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Enter a number \n");
        int number = Integer.parseInt(bufferedReader.readLine());
        new Main().fizzBuzz(number);
        System.exit(0);

        String[] arr = {"ababaa","babaa","baa","aa","a"};
        int size = arr.length;
        // The longest common prefix of an empty array is "".
        if (size == 0){
            System.out.println("Longest common prefix: ");
        }
        // The longest common prefix of an array containing
        // only one element is that element itself.
        else if (size == 1){
            System.out.println("Longest common prefix: " + arr[0]);
        }
        else{
            // Sort the array
            Arrays.sort(arr);
            int length = arr[0].length();
            StringBuilder res = new StringBuilder();
            // Compare the first and the last strings character
            // by character.
            for(int i = 0; i < length; i++){
                // If the characters match, append the character to the result.
                if(arr[0].charAt(i) == arr[size - 1].charAt(i)){
                    res.append(arr[0].charAt(i));
                }
                // Else, stop the comparison.
                else{
                    break;
                }
            }
            String result = res.toString();
            System.out.println("Longest common prefix: " + result);
        }
    }
}
