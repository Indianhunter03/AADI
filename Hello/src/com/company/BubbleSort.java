package com.company;

import java.util.Scanner;

public class BubbleSort {
    public static int avrage (int a,int b){
      if (a<b){
          return b;
    }
      else{
          return  a;
      }

    }
    public static void sumOdd (int n){
        int sum=0;
        for(int i=2;i<=n;i++) {
            if (i % 2 != 0) {
                sum=sum+i;

            }
        }
        System.out.println(sum);
    }


    public static void main (String[] args) {
        Scanner ave = new Scanner(System.in);
       int a = ave.nextInt();
        int b = ave.nextInt();
       // int c = ave.nextInt();
       System.out.println(avrage(a,b));
       // int n=ave.nextInt();
       // sumOdd(n);
    }
}
