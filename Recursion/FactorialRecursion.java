import java.util.Scanner;


public class FactorialRecursion {
    public static int Fact(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n * Fact(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find factorial: ");
    int number = sc.nextInt();
    int result = Fact(number);
    System.out.println("the factorial of " + number + " is : " + result);
    }
}
