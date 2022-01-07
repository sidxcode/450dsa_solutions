// Write a program to reverse an array or string

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string:  ");
            String a = in.nextLine();
            char[] arr = new char[a.length()];

            for(int i = 0; i < a.length(); ++i) {
                arr[i] = a.charAt(i);
            }

            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void reverse(char[] arr) {
            int start = 0;

            for(int end = arr.length - 1; start < end; --end) {
                swap(arr, start, end);
                ++start;
            }

        }

        static void swap (char[] arr, int num1, int num2) {
            char temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }
}
