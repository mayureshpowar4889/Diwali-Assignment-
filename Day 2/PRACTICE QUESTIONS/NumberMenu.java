import java.util.Scanner;

public class NumberMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\n=== Number Operations Menu ===");
            System.out.println("1. Sum of first n even numbers");
            System.out.println("2. Sum of first n odd numbers");
            System.out.println("3. Check if  number is  palindrome");
            System.out.println("4. Check if  number is Armstrong number");
            System.out.println("5. Reverse  number");
            System.out.println("6. Exit");
            System.out.print("Enter choice ");

            int choice = scanner.nextInt();

            if (choice != 6) {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        int sum = sumOfEvenNumbers(num);
                        System.out.println("Sum of first " + num + " even numbers: " + sum);
                    }
                    case 2 -> {
                        int sum = sumOfOddNumbers(num);
                        System.out.println("Sum of first " + num + " odd numbers: " + sum);
                    }
                    case 3 -> {
                        if (isPalindrome(num)) {
                            System.out.println("Yes number is  palindrome");
                        } else {
                            System.out.println("number is Not palindrome!!");
                        }
                    }
                    case 4 -> {
                        if (isArmstrong(num)) {
                            System.out.println("Yes number is Armstrong number");
                        } else {
                            System.out.println("number is Not Armstrong number!!");
                        }
                    }
                    case 5 -> {
                        int rev = reverseNumber(num);
                        System.out.println("Reverse of " + num + ": " + rev);
                    }
                    default -> {
                        System.out.println("Invalid choice!!");
                    }
                }
            } else {
                run= false;
                System.out.println("Exiting !!");
            }
        }
        scanner.close();
    }

    
    public static int sumOfEvenNumbers(int num)
    {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += 2 * i; 
        }
        return sum;
    }

  
    public static int sumOfOddNumbers(int num)
    {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += 2 * i - 1;
        }
        return sum;
    }


    public static boolean isPalindrome(int num)
    {
        int original = num;
        int rev = 0;
        while (num > 0) 
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return original == rev;
    }


    public static boolean isArmstrong(int num)
    {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return original == sum;
    }


    public static int reverseNumber(int num)
    {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
}