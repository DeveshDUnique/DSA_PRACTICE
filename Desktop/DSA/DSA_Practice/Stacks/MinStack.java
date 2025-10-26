import java.util.*;

class MinStack {

    Stack<Long> st = new Stack<>(); // creating stack of long
    long min = 0;
    MinStack() {

        // constructor
    }

    void push(int val) {
        long x = (long)val; // converting the int val to long
        if (st.isEmpty()) 
        {
            st.push(x);
            min = x;
        } 
        else if (min > x) 
        {
            st.push(2 * (x) - (min));
             min = x;
        } 
        else if (min <= x) 
        {
            st.push(x);
        }
    }

    void pop() {
        if (st.isEmpty())
        {
            return;
        }
         else if (st.peek() < min) 
        {
            long oldmin = 2 * (min) - (st.peek());
            min = oldmin; // restore th value of min
            st.pop();

        } 
        else if (st.peek() >= min)
        {
            st.pop();
        }
    }

    int top() {
        if (st.isEmpty()) 
        {
            return -1;
        }
        long q = st.peek();
        if (q >= min) 
        {
            return (int)q;
        }
        else 
        {
            return (int)min;
        }
        
    }

    int getMin() {
        if (st.isEmpty()) 
        {
            return -1;
        }
        return (int)min; // typecast from the long to int
    }


    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin(); // return -3
        System.out.println(min);
        minStack.pop();
        minStack.top();    // return 0
        int min2 = minStack.getMin(); // return -2
        System.out.println(min2);
        }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */