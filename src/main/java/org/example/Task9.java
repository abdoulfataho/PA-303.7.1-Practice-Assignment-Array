package org.example;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] Arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(Arr);
        System.out.println("Assending order:"+ Arrays.toString(Arr));
        System.out.println("Smallest number is:" + Arr[0]);
        System.out.println("biggest number is :"+ Arr[5]);

    }
}
