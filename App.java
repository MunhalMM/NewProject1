package com.telran.project;

public class App {
    public static void main(String[] args) {
        int[]arr ={1,12,23,34,45,56,67,78,89,99};
       int sum=0;
        for (int i =arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println();
        double j=(double) sum/ arr.length;
        System.out.println("sum = "+sum);
        System.out.println("result = "+j);

    }
}
