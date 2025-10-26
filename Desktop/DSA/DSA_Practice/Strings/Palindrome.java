import java.util.Scanner;

//given a string s, return the number of palindromic substrings in it.

//approach by two pointer method.
public class Palindrome 
{
    public static void main(String[] args) 
    {

        String str = "eye";

        int i = 0; 
        int j = str.length()-1;
       // System.out.println(str.charAt(j));
        boolean flag= true;  //pallindrome

        while (i<j)
        {
           if (str.charAt(i) == str.charAt(j)) 
           {
            flag = true;
            break;
           } 
           else
           {
            flag = false;
           }
           i++;
           j--;
           
        }

        if (flag == true)
        {
            System.out.println("It is a pallindrome");
        }
        else
        {
            System.out.println("Not a pallindrome");
        }
        
    }
    
}


