public class reverse 
{

    public static void main(String[] args) 
    {
        String str = "Hello World";
        String ans = " ";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        ans = sb.toString();
        System.out.println(ans);
    }
    
}












