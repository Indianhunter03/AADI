public class Prefix {
 public static void print2largest(int arr[], int arr_size)
{
    int i, first, second;
//12, 35, 1, 10
    /* There should be atleast two elements */
    if (arr_size < 2) {
        System.out.print(" Invalid Input ");
        return;
    }

    first = second =0;
    for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first then update both first and second */
        if (arr[i] > first) { //true
            second = first;     //2 f =35 ,s=12
            first = arr[i]; //1st =12
        }
      // 3  unchchnged
        // 4 unchanged
            /* If arr[i] is in between first and
               second then update second  */
        else if (arr[i] > second && arr[i] != first)
            second = arr[i];
    }

    if (second ==0)
        System.out.print("There is no second largest"
                + " element\n");
    else
        System.out.print("The second largest element"
                + " is " + second);
}

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10 };
        int n = arr.length;
        print2largest(arr, n);
    }
}