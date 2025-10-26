package NormllyAskedQuestions;

public class InsertionSort1 {

    public static void main(String[] args) 
    {

        int arr [] = {55,44,22,66,11,33};
        int n = arr.length;

        for(int i=1; i<n; i++)
        {
            int temp = arr[i];  // taking temp as first element in beginning and storing the value in it.
            int j = i-1;  // j starting from 0th element

            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];  // so copying the element in j to next element
                j--;
            }
            arr[j+1]= temp;
  
        }
          // Print the sorted array
          for (int i = 0; i < n; i++) 
          {
            System.out.print(arr[i] + " ");
  
          }
    
}
}
