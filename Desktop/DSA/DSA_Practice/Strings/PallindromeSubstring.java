public class PallindromeSubstring 
{
    public static boolean isPallindrome(String str)
    {
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;//its pallindrome

        while(i<j)
        {
            if (str.charAt(i) == str.charAt(j))

            {
                flag =true;
                
            }
            else
            {
                flag = false;
                
            }
            i++;
            j--;
            
        }
        return flag;

    }



    public static void main(String[] args)
    {
        String str = "abccba";
        int count = 0;
        boolean flag = true;

        for(int i=0; i<str.length()- 1;i++)
        {
            for(int j=i+1; j<str.length();j++)
            {
                if(isPallindrome(str.substring(i, j)) == flag)
                {
                    System.out.print(str.substring(i,j) + " " );
                    flag = true;
                    count++;
                    
                }
                else
                {
                    flag = false;
                }

            }
        }
        if (flag == true){
            System.out.println(" => Its a Paliindrome");
        }
        System.out.println("The no of substrings are = "+count);
    }
    
}
