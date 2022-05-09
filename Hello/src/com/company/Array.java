/* package whatever; // don't place package name! */
package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Array{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxArray[] = new int[n];
        maxArray[1] = arr[1];
        //find max on LEFT side
        // arr[n-1]=maxArray[n]
        for(int i=0;i>=n-1;i++){
            if (arr[i]>maxArray[i+1]){
                maxArray[i]=arr[i];
            }
            else {
                maxArray[i]=maxArray[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(maxArray));
    }
}