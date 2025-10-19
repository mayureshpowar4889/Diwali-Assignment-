import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean on = true;

        while(on)
        {
            System.out.println("\n=============Menu=============");
            System.out.println("1. Check number is prime");
            System.out.println("2. Generate all prime numbers up to n");
            System.out.println("3. Calculate factorial of number");
            System.out.println("4. Generate Fibonacci series up to n terms");
            System.out.println("5. Check number even or odd");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice=scanner.nextInt();

            if(choice!= 6 ) 
            {
                System.out.print("Enter number: ");
                int num=scanner.nextInt();
                
                switch(choice)
                {
                case 1 ->{
                    System.out.println(num +" is prime: " + isPrime(num));
                }
                case 2 -> {
                    System.out.println("Primes up to " + num + ": " + getPrimesUpToN(num));
                }
                case 3 -> {
                    int fact = factorial(num);
                    if (fact == -1) {
                        System.out.println("Factorial not defined for negative numbers!!!");
                    } else {
                        System.out.println("Factorial of " + num + ": " + fact);
                    }
                }
                case 4 -> {
                    System.out.println("Fibonacci series (" + num + " terms): " + fibonacciSeries(num));
                }
                case 5 -> {
                    System.out.println(num + " is: " + isEvenOrOdd(num));
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
            } else 
            {
                on = false;
                System.out.println("Exiting!!");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
        	{
        	return false;
        	
        	}
        for (int i =2;i* i <= num;i++)
        {
            if(num%i==0)
            {
            	return false;
            	
            }	
        }
        return true;
    }

    
    public static List<Integer> getPrimesUpToN(int num) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= num; i++)
        {
            if(isPrime(i))
            {
                primes.add(i);
            }
        }
        return primes;
    }

    
    public static int factorial(int num) {
        if (num < 0) 
        {
        	return -1; 
        }
        int fact = 1;
        for (int i=1;i<= num;i++)
        {
            fact*=i;
        }
        return fact;
    }

   
    public static List<Integer> fibonacciSeries(int num)
    {
        List<Integer> fib = new ArrayList<>();
        if (num <= 0)
        {
        	return fib;
        	
        }	
        int a = 0, b = 1;
        
        fib.add(a);
        
        if (num == 1)
        {
        	return fib;
        	
        }	
        fib.add(b);
        
        for (int i = 3; i <= num; i++) {
            int next = a + b;
            fib.add(next);
            a = b;
            b = next;
        }
        return fib;
    }

 
    public static String isEvenOrOdd(int num)
    {
        return num % 2==0?"Even":"Odd";
    }
}