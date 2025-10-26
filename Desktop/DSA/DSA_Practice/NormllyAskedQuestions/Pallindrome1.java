package NormllyAskedQuestions;

public class Pallindrome1 {
    public static void main(String[] args) 
    {
        String str = "ababa";
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;  // Assume it's a palindrome by default
        
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j)) 
            {
                flag = false;  // If characters don't match, it's not a palindrome
                break;
            }
            i++;
            j--;
        }

        if (flag) 
        {
            System.out.println("It is a palindrome");
        } 
        else 
        {
            System.out.println("Not a palindrome");
        }
    }
}








