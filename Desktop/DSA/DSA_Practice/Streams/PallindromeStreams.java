package Streams;

import java.util.stream.IntStream;

public class PallindromeStreams {

    static Boolean streamPallindrome(String ss){
        String s = ss.toLowerCase();
        return IntStream.range(0, s.length()/2)
               .allMatch(i -> s.charAt(i) == s.charAt(s.length()-1-i));
    }


    public static void main(String[] args) {
        String s1 = "eye";
        System.out.println(streamPallindrome(s1));

    }
    
}
