//substrings are continous in nature 
//eg :- Substring str = "abcde"   the substrings are ab,abc,abcd,bc,bcd etc

public class SubString1 
{

    public static void main(String[] args) 
    {
        String str = "abcde";
        System.out.println(str.substring(0, 2));  // it will print till last second index
        System.out.println(str.substring(3));

        String s = "physics";
        for(int i=2;i<=6;i++) //i=ys
        {
            System.out.println(s.substring(i));  // ysics  sics
        }

        /*In the first iteration (i=2):

        s.substring(i) is called. This method returns a substring of the original string s starting from the index i.
        In this case, i=2, so s.substring(2) returns the substring starting from index 2, which is "ysics".
        This substring "ysics" is printed.
        In the second iteration (i=3):

        s.substring(i) is called again. This time, i=3, so s.substring(3) returns the substring starting from index 3, which is "sics".
        This substring "sics" is printed.*/
    }
    
}
