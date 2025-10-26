package NormllyAskedQuestions;

public class BubbleSort 
{
    public static void main(String[] args) 
    {

        int arr[] = {22,33,66,55,44,11};
        int n = arr.length;
        boolean flag; //to track f swapping orrcures

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)  //j<n-i-1 because the last element is already sorted after first iteration
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; //

                }
            }
            if (flag = false) 
            {
               break; 
            }
        }
        // Print the sorted array
        for (int k = 0; k < n; k++) 
        {
          System.out.print(arr[k] + " ");

        }
    }    
}


