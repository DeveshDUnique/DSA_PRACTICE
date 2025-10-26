import java.util.*;

public class StockSpan 
{

    public static class Pair<K,V>   ///declaring the public class to store the key,value in the stack 
    {
        private K key;
        private V value;

        public Pair(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
    
        public V getValue() {
            return value;
        }
  
    }

    public static int[] stockSpan(int arr[])
    {
        int n = arr.length;
        int span[] = new int[n];
        Stack<Pair<Integer,Integer>> st = new Stack<>();

        for(int i=0; i<n; i++)
        {
            if (i==0)
            {
                st.push(new Pair<>(0, arr[i]));  // pushing the first element of array into the 
                span[i] = 1;  ///span of 1st stock will always be 1 day as no day before it to compare
            }
            else
            {
                while (!st.isEmpty() && st.peek().getValue()<=arr[i])
                {
                    st.pop();
                    
                }
            }
            span[i] = st.isEmpty() ? i+1 :  i - st.peek().getKey() ;  //all elements to left are smaller than current if stack empty
                    // or else not empty then difference beth i and top element of stack index.
            st.push(new Pair<>(i, arr[i]));  // pushing for above conditions
        }

        return span;

    }

    public static void main(String[] args) 
    {
        int arr[] = {100,80,60,70,60,75,85};
         int res[]= stockSpan(arr);

         for(int i=0;i<res.length;i++)
         {
            System.out.println(res[i]);
         }
        
    }
    
}
