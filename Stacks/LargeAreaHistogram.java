import java.util.Stack;

public class LargeAreaHistogram 
{
    public static int largeAreaHistogram(int heights[])
    {
        int n = heights.length;
        int nse[] = new int[n];
        int pse[] = new int[n];

        Stack<Integer> st = new Stack<>();  //creating stack

        //calculating the 
        st.push(n-1); //pushing the index into stack
        nse[n-1] = n ; //pushing the index of last element in arrayof heights to nse

        for(int i = n-2 ; i>=0; i--)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i] ) //
            {
                st.pop(); //popping the lements
            }
            if(st.isEmpty())
            {
                nse[i] = n;  // pushing the index into nse array
            }
            else
            {
                nse[i] = st.peek(); //putting the index of next small element to current index element
            }
            st.push(i);  //pushing the current index to stack
        }

        while (!st.isEmpty())   //emptying the stack to append the elements of pse[previous small element]
        {
            st.pop();
            
        }

        //calculating the pse  {left to right}

        st.push(0);  //pushing into the stack 
        pse[0] = -1; // pushing the -1 into the array

        for(int i=1 ; i<n-1;i++)
        {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
                
            }

            if (st.isEmpty()) 
            {
                pse[i] = -1;
                
            }
            else
            {
                pse[i] = st.peek();
            }

            st.push(i); //pushing the current index to stack

        }

        //Areaa of the histogram rectan gle

        int max = -1;
        for(int i=0;i<n;i++)
        {
           int area = heights[i] * (nse[i] - pse[i] -1);
           max = Math.max(max, area);

        }

        return max;

    }

    public static void main(String[] args) 
    {
        int arr[] = {5,2,4,6,3,5};
        int res =largeAreaHistogram(arr);
        System.out.println(res);
        
    }
    
}
