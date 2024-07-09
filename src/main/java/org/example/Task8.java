package org.example;

public class Task8 {
    public static void main(String[] args) {
        int[] Arr={1,34,6,8,7};
        for(int i=0;i<Arr.length; i++){
            int temp = Arr[0];
            Arr[0] = Arr[4];
            Arr[4] = temp;
            System.out.println(Arr[i]);
        }
    }
}
