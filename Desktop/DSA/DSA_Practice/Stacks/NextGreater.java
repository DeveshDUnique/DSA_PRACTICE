import java.util.*;

public class NextGreater 
{
    public static int[] isGreater(int arr[])
    {
        int n = arr.length;  //length of array
        int res[] = new int[n]; // array till the length of input array
        Stack <Integer> st = new Stack<>();  // new stack

        res[n-1] = -1;  //putting -1 in last of array

        st.push(arr[n-1]);  //pushing to stack the lat element of array
       

        for(int i = n-2; i>=0; i--)
        {
            while (!st.isEmpty() && st.peek() <= arr[i]) 
            {
                st.pop();
            }
    
            if (st.isEmpty()) 
            {
                res[i] = -1;
            } 
            else 
            {
                res[i] = st.peek();
            }
    
            st.push(arr[i]);  //pushing elements of stack into array
        }
    
        
        return res;  // returning the array
    }

    public static void main(String[] args) 
    {
        int arr[] = {1,3,2,1,8,6,3,4};

        int res[] = isGreater(arr);

        for(int i=0; i<res.length; i++)
        {
            System.out.println(res[i]);
        }
   
    }
    
}
