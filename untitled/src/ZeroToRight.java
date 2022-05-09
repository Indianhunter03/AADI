public class ZeroToRight {

    static void pushZerosToEnd(int arr[], int n) {
        int count = 0;
        //   int arr[] = {1,0, 0, 2, 0, 9};

        {
            for (int i = 0; i < n; i++)
                if (arr[i] != 0)
                    arr[count++] = arr[i]; //

        }
        {
            while (count < n)
                arr[count++] = 0;
        }
    }

    public static void main (String[] args)
    {
        int arr[] = {1,0, 0, 2, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

}