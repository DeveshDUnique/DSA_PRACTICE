package NormllyAskedQuestions;
// This is with loops to find only the prime-fibonacci

public class PrimeFibonacci {

    private static void printPrimeFibonacci(int n) {
        int first = 0,second =1;
        for(int i=0;i<n;i++){
            if (isPrime(first)) {
                System.out.println(first + " ");
            }

            int sum = first + second;
            first = second;
            second = sum;
        }
        }

    private static boolean isPrime(int num){

        if (num<2) {
            return false;
        }
        for(int i=2; i<Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
        
    public static void main(String[] args) {
        printPrimeFibonacci(10);
    }

}
