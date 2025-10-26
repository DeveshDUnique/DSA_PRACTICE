public class CountSameStrings {


    public static int countSameDigits(String str1, String str2) {
        // Check if both strings have the same length
        if (str1.length() != str2.length()) 
        {
            System.out.println("Strings must have the same length");
        }

        int count = 0;
        // Iterate through each character of both strings simultaneously
        for (int i = 0; i < str1.length(); i++) 
        {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            // Increment the count if characters are equal (both 1s or both 0s)
            if (char1 == char2) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        String str1 = "101100";
        String str2 = "011000";
        int totalCount = countSameDigits(str1, str2);
        System.out.println("Total count: " + totalCount);
    }
}
