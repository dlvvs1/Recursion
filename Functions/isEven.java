import java.util.Scanner;

public class isEven {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean result = isEven(number);
        System.out.println("Is the number " + number + " even? " + result);
    }
}