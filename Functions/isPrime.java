import java.util.Scanner;

public class isPrime {
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean result = isPrime(number);
        System.out.println("Is the number " + number + " prime? " + result);
    }
}