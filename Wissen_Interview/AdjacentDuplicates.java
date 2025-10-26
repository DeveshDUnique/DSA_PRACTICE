//[11:16 AM] Ayush Sharma
//Remove the adjacent duplicate characters from the input string
//{"abbccdd" -> "a", "bccb" -> "", xwxx -> xw , xwxw -> xwxw}

public class AdjacentDuplicates 
{
    public  static String  demo(String str)
    {
        if (str == null || str.isEmpty())
        {
            return str;
            
        }
        int i =0;
        
        char[] ans = str.toCharArray();

        for(int j=0; j<str.length();++j,++i)
        {
            ans[i] = ans[j]; 
            if (i >0 && ans[i -1] == ans[i])
            {
                i -=2;
                
            }
        }
        return new String(ans,0,i);
      
    }

    public static void main(String[] args) 
    {
        String input = "bccb";
        String result = demo(input);
        
        System.out.println(result);
        
    
        
    }

    
}
