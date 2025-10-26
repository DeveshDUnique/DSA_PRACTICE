/// reverse of string without the stringbuilder 

public class ReverseWithoutStringBuilder 
{
    public static String reverse(String str)
    {
        char[] ch = str.toCharArray();  //string elements in array

        int left = 0;  //starting index
        int right = ch.length -1;  // rightmost index

        while (left < right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
            
        }

        return new String(ch);

    }
    public static void main(String[] args) 
    {

        String str = "Hello World!";

        String reverseStr = reverse(str);
        System.out.println(reverseStr);
        
    }
    
}
