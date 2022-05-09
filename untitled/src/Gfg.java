import java.util.Arrays;
// sorting array with repeatetive 0s 1s 2s
class GFG {
    public static void sort (int arr[],int n){
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
       for(int i=0;i<n;i++){
           switch (arr[i]){
               case 0:
                   cnt0++;
                   break;
               case 1:
                   cnt1++;
                   break;

               case 2:
                  cnt2++;
                   break;

           }
       }
   int i=0;
       while(cnt0>0){
           arr[i++]=0;
           cnt0--;
       }
        while(cnt1>0){
            arr[i++]=1;
            cnt1--;
        }
        while(cnt2>0){
            arr[i++]=2;
            cnt2--;
        }
    }

    // Method 1

    // To rotate left by D elements

//    void leftRotate(int arr[], int d, int n)
//
//    {
//
//        for (int i = 0; i < d; i++)
//
//            leftRotatebyOne(arr, n);
//
//    }
//
//
//    // Method 2
//
//    // To rotate left one by one
//
//    void leftRotatebyOne(int arr[], int n)
//
//    {
//
//        int i, temp;
//
//        temp = arr[0];
//
//        for (i = 0; i < n - 1; i++)
//
//            arr[i] = arr[i + 1];
//
//        arr[i] = temp;
//
//    }
//
//
//    // Method 3
//
//    // To print an array
//
//    void printArray(int arr[], int n)
//
//    {
//
//        for (int i = 0; i < n; i++)
//
//            System.out.print(arr[i] + " ");
//
//    }
//
//
//    // Method 4
//
//    // Main driver method
//
  public static void main(String[] args)
//
  {
//
//        // Creating object of class inside main()
//
//        GFG rotate = new GFG();
//
//
//        // Custom input array
//
    int arr[] = { 0,0,0,1,1,2,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2 };
    int m = arr.length;
//

        // Calling method to rotate array leftwards

        // and later printing the array elements

//        rotate.leftRotate(arr, 2, arr.length);
//
//        rotate.printArray(arr, arr.length);
//        System.out.println(); sort
       sort(arr,m);
        System.out.print(Arrays.toString(arr));

    }
}
