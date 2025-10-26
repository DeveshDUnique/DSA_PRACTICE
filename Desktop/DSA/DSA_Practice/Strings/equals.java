public class equals 
{

    public static void main(String[] args) 
    {

        String s1 = "Hello";
        String s2 = "hello";
        String s3 = new String("Hello");

        System.out.println(s1==s2);  //compares based on address
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));  //compares address as well as characters through ascii values[case sensitive].
    
    }
}
