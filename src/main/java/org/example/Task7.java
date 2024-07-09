package org.example;

public class Task7 {
    public static void main(String[] args) {
        int[] Arr={1,34,6,8,7};
        for(int i=0;i<Arr.length; i++){
            int Noprint =Arr[2];
           if(Arr[i]!=Noprint){
               System.out.println(Arr[i]);
           }
         }
    }
}
