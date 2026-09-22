package LinearSearch;

public class MinimumNumber {

    public static void main(String[] args) {
        int arr [] = {24,45,100,34,1};
        int result = min(arr);
        System.out.println("minimum number in given arrary "+ result);
    }

    static int min(int arr[]){
        int min = arr[0];
        for(int no:arr){
            if(no < min){
                min = no;
            }
        }
        return min;
    }
    
}
