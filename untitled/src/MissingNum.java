import java.io.*;
import java.util.*;

public class MissingNum {
    public static void printLeaders(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        int j;
        for (j = i + 1; j < size; j++)
        {
            if (arr[i] <=arr[j])
                break;
        }
        if (j == size)
            System.out.print(arr[i] + " ");
    }
}

    public static void main(String[] args)
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
    }
    // First Solution without Hashing ...................................................................
//    public static int solution(int[] arr,int n)
//    {
//        int N=1000010;
//        boolean[] present = new boolean[N];
//        int maxelement=Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > 0 && arr[i] <= n)
//                present[arr[i]] = true;
//
//            maxelement=Math.max(maxelement,arr[i]);
//        }
//
//        for (int i = 1; i < N; i++)
//            if (!present[i])
//                return i;
//
//        return maxelement+1;
//    }
//
//
//
//    // Second Solution with Hashing..........................................................................
//
//    static int missingNumber(int arr[], int n){
//        HashSet<Integer>set=new HashSet<>();
//        for(int i=0; i<arr.length; i++){
//            set.add(arr[i]);
//        }
//        for(int i=1; i<n+2; i++){
//            if(!set.contains(i)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main (String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++)
//            arr[i]=sc.nextInt();
//
//        // int missing =missingNumber(arr,n);
//        // System.out.println(missing);
//        System.out.println(solution(arr,n));
//    }

}
