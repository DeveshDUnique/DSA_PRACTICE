package NormllyAskedQuestions;

public class PrimeFibonacciRecursion {

    private static void printPrimeFibonacciRecursive(int first, int second, int count, int totalLength) {

        if (count>totalLength) {
            return;   
        }

        if (isPrime(first)){
            System.out.println(first + "");
        }

        int sum = first + second;
        first = second;
        second = sum;
        count = count + 1;

        printPrimeFibonacciRecursive(first, second, count, totalLength);
        
    }

    private static boolean isPrime(int num) {
        if (num<2) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printPrimeFibonacciRecursive(0,1,0,10);
    }
    
}
