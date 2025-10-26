import java.util.Scanner;

// capital characters to small or small characters to capital.

public class ToggleQuestion {

    public static  StringBuilder toggle(StringBuilder st)
    {
        for(int i=0;i<st.length();i++)
        {
            //System.out.println(st);
            boolean flag = true; //for captital boolean is true.
            char ch = st.charAt(i);  //string to char
            if(ch == ' ')
            {
                continue;
            }
            int ascii = (int)ch; //converting to ascii

            if (ascii >= 97 ) //small letter
            {
                flag = false;
            }
            if ( flag == true ) //capital to small
            {
                ascii = ascii + 32; // add 32 to make its small ascii value
                char dh = (char)ascii;  //converting to character
                st.setCharAt(i, dh); // setting the letter at position
            }
            else
            {
                ascii -= 32; // converting from capital to small
                char sh = (char)ascii; //tochar from ascii
                st.setCharAt(i, sh);
            }
        }
        
        return st;

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Check if the input contains only letters
        if (input.matches("[a-zA-Z\\s]+")) 
        {
            StringBuilder sb = new StringBuilder(input);
            StringBuilder result = ToggleQuestion.toggle(sb);
            System.out.println("Toggled string: " + result);
        }
        else 
        {
            System.out.println("Invalid input! Please enter a string containing only letters.");
        }

        sc.close();
    }
}
