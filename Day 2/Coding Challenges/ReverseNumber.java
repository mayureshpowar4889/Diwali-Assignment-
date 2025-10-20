import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int rev = reverseNumber(num);
        System.out.println("Reversed number: " + rev);
        
        scanner.close();
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10; 
            rev = rev * 10 + digit; 
            num /= 10;
        }
        return rev;
    }
}