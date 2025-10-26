//consecutive duplicates of characters are placed with the character and followed by the number of consecutive
// duplicates

// aaabbbbccddde
// a3b4c2d3e1



public class StringCompress 
{

    public static void main(String[] args) 
    {
        String ss = "aaabbbbccdddee";

        int count = 1;

        String ans = String.valueOf(ss.charAt(0)); // placing first character at 0 in the string
        //System.out.println(ans);

        for(int i=1;i<ss.length();i++)
        {
            char curr = ss.charAt(i);  //
            char prev = ss.charAt(i-1);

            if(curr==prev)  //checking if the current character is equal to previous character
            {
                count += 1;
            }
            else
            {
                ans += count;  //adding the count of characters to string
                count = 1;  //resetting the count when the alphabet changes.
                ans += curr;  //adding the character into the string
            }
        }
       ans+=count; //adding the last count
        System.out.println(ans);
  
    }
    
}



