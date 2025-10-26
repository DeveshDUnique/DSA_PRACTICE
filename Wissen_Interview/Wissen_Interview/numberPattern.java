package Wissen_Interview;

public class numberPattern 
{
    public static void main(String[] args) 
{
            
    // int n = 5;
    // for(int i=n; i>=1; i--)
    // {
    //     for(int j=n; j>=i; j--)
    //     {
    //         System.out.print(j + " ");  //instead of j we can put * for * printing
    //     }
    //     System.out.println();
    // }


    int rows = 5;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

    
}

