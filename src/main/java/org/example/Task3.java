package org.example;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] array ={"green","red","blue","yellow"};
        System.out.println(array.length);
        String[] newArray= array.clone();
        System.out.println(Arrays.deepToString(newArray));
    }
}
