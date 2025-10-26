public class PrintAllSubstring 
{   
    public static void main(String[] args) 
    {
        String  ss= "vwxyz";
        int n = ss.length();
        System.out.println(n);
        for(int i=0;i<=n-1;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(ss.substring(i, j) + " ");
            }
        }
       
    }
}
















