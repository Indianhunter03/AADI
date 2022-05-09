package com.company;
import java. util. Scanner;

public class Main {
    static int smallestSubWithSum(int arr[], int n, int x)
    {
        int min_len = n+1;

        // Pick every element as starting point
        for (int start = 0; start < n+1; start++)
        {
            // Initialize sum starting with current start
            int curr_sum = arr[start];

            // If first element itself is greater
            if (curr_sum > x )
                return 1;

            // Try different ending points for curremt start
            for (int end = start+1; end < n; end++)
            {
                // add last element to current sum
                curr_sum += arr[end];

                // If sum becomes more than x and length of
                // this subarray is smaller than current smallest
                // length, update the smallest length (or result)
                if (curr_sum > x && (end - start+1 ) < min_len)
                    min_len = (end - start+1 );
            }
        }
        return min_len;

    }

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        int n1 = keyboard.nextInt();
        int x= keyboard.nextInt();
        int[] arr = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr[i] = keyboard.nextInt();
        }
        int res1 = smallestSubWithSum(arr, n1, x);
        {
        if (res1 == n1+1)
            System.out.println("Not Possible");
        else
            System.out.println(res1);
        }
    }
}



