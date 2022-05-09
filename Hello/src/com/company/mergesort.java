package com.company;
import java. util. Scanner;
import java.io.*;
import java.util.*;
class Mergesort
{/*Write a program that, given an array A[]
of n numbers and another number x, determines whether or not there exist two elements in A[] whose sum is exactly x.*/

    public static void  divide(int arr[],int si,int ei)
    {
        if (si>=ei){
            return;
        }

        int mid= si + (ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void  conquer(int arr[],int si,int mid ,int ei) {
        int merged[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int x= 0;
        while (i<=mid && j <=ei)
        {
            if (arr[i] <= arr[j])
            {
                merged[x++] = arr[i++];
            }
            else {
                merged[x++] = arr[j++];
            }
        }
        while (i <= mid)
        {
            merged[x++] = arr[i++];
        }
        while (j <= ei)
        {
            merged[x++] = arr[j++];
        }

        for (int m = 0,k = si;m < merged.length; m++, k++)
        {
            arr[k] = merged[m];

        }
    }

    public static void main (String[] args) {
        int arr[] ={ 2,6,5,4,7,9,8,10}  ;
        int  n=arr.length ;// Your code here
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}