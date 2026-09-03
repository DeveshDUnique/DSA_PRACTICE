package LinearSearch;

public class BasicLinearSearch {

    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 67, 34, 89};
        int result = linearSearch(arr, 89);
        System.out.println("Element found at index: " + result);

        String ss = "Devesh";
        char a = 'D';
        int index = searchChar(ss, a);
        System.out.println("Character found at " + index); 

    }

    static int linearSearch(int arr[], int number) {

        if(arr.length == 0){
            return -1;
        }

        int index = 0;
        for(int element: arr) {
            if(element == number) {
                return index;
            }
            index++;
        }
        return -1;
    }

    static int searchChar(String s, char c) {

        if(s.length() == 0){
            return -1;
        }

        int index =0;
        for(char cc: s.toCharArray()){
            if(cc == c){
                return index;
            }
            index++;
        }
        return -1;
    }
    
}
