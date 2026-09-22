package LinearSearch;

public class TwoDArray {

    public static void main(String[] args) {
        int [][] arr = {{2,4,8},
                        {10,77,14},
                        {16,18,20}};
        
        int[] search = searching(arr, 18);
        System.out.println("Number present at index row,col ["+ search[0] + "," +search[1] + "]");

        int max = maxNumber(arr);
        System.out.println("The max number in the array = "+ max);
    }
    

    static int[] searching(int [][] arr, int target){

        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int maxNumber(int [][] arr){
        
        int maxValue = Integer.MIN_VALUE;
        for(int[] element:arr){
            for(int number:element){
                if(number > maxValue){
                    maxValue = number;
                }
            }
        }
        return maxValue;
    }
}
