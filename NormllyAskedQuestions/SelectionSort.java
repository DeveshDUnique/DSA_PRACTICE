package NormllyAskedQuestions;

public class SelectionSort 
{

    public static void main(String[] args) 
    {

        int arr [] = { 44,11,55,22,66,33};

        int n = arr.length;

        for(int i = 0; i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if (arr[i] > arr[j]) // if ith element is greater than the jth element
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
