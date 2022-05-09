
import java.util.*;
public class ZerosOneSort {
    public static void sort012(int a[], int n){
        int count[]=new int[3];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }
        int i=0,j=0;
        while(i<n){
            if(count[j]!=0){
                a[i++]=j;
                count[j]--;
            }else{
                j++;
            }
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        sort012(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
