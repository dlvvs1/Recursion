import java.util.Scanner;

public class Fibonacchi {
    public static int Fibonnachi(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        else {
            return Fibonnachi(n-1) + Fibonnachi(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Fibonnachi series : ");
        int number = sc.nextInt();
        int result = Fibonnachi(number);
        System.out.println("The " + number + "th term of the Fibonnachi series is : " + result);
    }
}