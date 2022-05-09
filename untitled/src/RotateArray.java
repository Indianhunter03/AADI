import java.util.Arrays;

public class RotateArray {
    void rightRotate(int arr[],int d ,int n){
        for (int i=0;i<d;i++){
            ValueRotate(arr,n);
        }
    }

    void leftRotate(int arr[],int d ,int n){
        for (int i=0;i<d;i++){
            ValueRotate(arr,n);
        }
    }
//    void ValueRotateRight(int arr[],int n) {
//        int Temp=arr[n-1];
//        int i=0;
//        {
//            for (i = 1; i < n-1; i++)
//                arr[i] = arr[i - 1];
//            arr[i] = Temp;
//        }
//    }
//
 void ValueRotate(int arr[],int n) {
     int Temp=arr[0];
     int i=0;
        {
            for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
                arr[i] = Temp;
        }
    }
        public static void main(String[] args)

    {

        // Creating object of class inside main()
        RotateArray ob = new RotateArray();
       // Custom input array

        int arr[] = { 1, 2, 3, 4, 5 };


        // Calling method to rotate array leftwards

        // and later printing the array elements

      //  ob.leftRotate(arr, 0, arr.length);
        ob.rightRotate(arr, 2, arr.length);

     System.out.print(Arrays.toString(arr));
    }
}
