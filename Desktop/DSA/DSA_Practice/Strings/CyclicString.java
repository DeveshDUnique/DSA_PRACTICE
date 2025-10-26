public class CyclicString {
    /*A string is cyclic if some rotation of it results in the original string.
     * If we take s + s = "abcdeabcde", then all rotations of s will appear as a substring of s + s
     * But s will always match the original string at index 0, so we ignore that.
     * So check if s is found somewhere else in s + s (excluding first and last characters).
     */
    private static boolean isCyclic(String s) {
        String twoTimes = s + s;
        return(twoTimes.substring(1,twoTimes.length()-1).contains(s));
    }
    public static void main(String[] args) {
        System.out.println(isCyclic("abab"));
        System.out.println(isCyclic("abcd"));
        
    }
    
}
