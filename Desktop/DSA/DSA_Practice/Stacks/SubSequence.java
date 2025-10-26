
//Remove the consecutive sub-sequence of length greater than or equal to 2
// 1 2 2 3 4 5 10 10 10 4 4 4 5 7 7 2

import java.util.Stack;

public class SubSequence 
{
    private static int[] remove(int[] arr) 
    {
        int n = arr.length;
        Stack<Integer>st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(st.size()==0 || st.peek() != arr[i])  //if stack empty add elements different
            {
                st.push(arr[i]);
            }

           else if(st.peek() == arr[i])
           {
                if (arr[i]!=arr[i+1] || i==n-1)  // if elements
           {
                st.pop();
           }
            }
        }

        int res[] = new int[st.size()];  //result array of size of stack
        int m = res.length;
        for(int i= m-1; i>=0;i--)
        {
            res[i] = st.pop();  //filling the array with elements in the stack
        }

        return res;
        
    }


    public static void main(String[] args) 
    {
        int arr [] = {1,2,2,3,4,5,10,10,10,4,4,4,5,7,7,2};

        int res[] = remove(arr);

        for(int i=0; i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    
    }
   
}












