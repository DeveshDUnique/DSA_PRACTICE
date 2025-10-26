package NormllyAskedQuestions;

public class Fabonacci 
{

    public static void main(String[] args) 
    {
        int number = 5;

        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(b);

        for(int i=0; i<number; i++)
        {
            int c = a + b;
            
            a = b;
            b = c;
            System.out.print(c);

        }
    }
    
}
