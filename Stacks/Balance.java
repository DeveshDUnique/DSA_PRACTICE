import java.util.Scanner;
import java.util.Stack;

public class Balance {

    public static boolean isbalanced(String str)
    {
        Stack<Character> stk = new Stack<>();  //creating a new stack
        int n = str.length(); //length of string

        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);

            if (ch == '(')
            {
                stk.push(ch);
                
            }
            else
            {
                if (stk.size()==0)
                {
                    return false;
                }
                if (stk.peek() == '(')
                {
                    stk.pop();
                    
                }
   
            }
        }
        if (stk.size()>0) {
            return false;
            
        }
        else
        {
            return true;
        }
    
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brackets ");
        String str = sc.nextLine();
        Boolean result = isbalanced(str);
        System.out.println("The String brackets balanced state = " + result);

    }
    
}
