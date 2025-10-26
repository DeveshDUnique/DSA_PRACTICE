public class builder {

    public static void main(String[] args) 
    {
        StringBuilder ss = new StringBuilder("hello");
        //appending to string
        ss.append("world");  //adding to string

        System.out.println(ss);
        // setting char at position
        ss.setCharAt(0,'D'); //replacing the characters in string builder

        System.out.println(ss);

        //inserting at index

        ss.insert(0, 'z'); //adding character at position
        System.out.println(ss);

        ss.deleteCharAt(10); //deleting at position
        System.out.println(ss);

        ss.delete(0, 4); //deleting throughout indexes
        System.out.println(ss);

        ss.reverse();  //reversing the string
        System.out.println(ss);

        System.out.println(ss.indexOf("w"));

        System.out.println(ss.substring(0, 4));

        System.out.println(ss.substring(3));


    }
    
}
