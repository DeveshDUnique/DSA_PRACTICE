package LinearSearch_Leetcode.LinearSearch_Leetcode;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits 
{
    
   public static int findNumbers(int [] nums)
    {
        int count = 0;
        for(int num : nums)
        {
            if (even(num))
            {
                count++;
            }
        }

        return count;

    }

   public static boolean even(int num)
    {
       int total_even = count_digits2(num);
    /*  if (total_even % 2 ==0)
     {
        return true;
        
      }
      return false; */

      
        if (num < 0)
        {
            num = num * -1;
            
        }

       return total_even % 2 == 0;

    }

    public static int count_digits2(int num)
    {
        return (int)(Math.log10(num)) + 1;  //type conversion from double to int
    }

//    public static int count_digits(int num)
//     {
//         int count = 0;

//         if (num < 0)
//         {
//             num = num * -1;
            
//         }
//         if (num == 1)
//         {
//             return 1;
            
//         }

//         while (num > 0)
//         {
//             count++;
//             num = num / 10;
            
//         }
//         return count;

//     } 
    public static void main(String[] args) 
    {

        int arr[] = {12,345,2,6,7896,-55};
        System.out.println(findNumbers(arr));

        
    }

 
}
