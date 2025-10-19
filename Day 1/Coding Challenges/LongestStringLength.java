import java.util.Scanner;

public class LongestStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter no. strings: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        
        
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter string " +(i + 1)+":");
            arr[i] =scanner.nextLine();
        }
        
        
        int maxLength = findLength(arr);
        
      
        System.out.println("Length of longest string: " + maxLength);
        
        scanner.close();
    }
    
  
    public static int findLength(String[] arr) {
        int max =0; 
        for (int i = 0; i < arr.length; i++)
        {
            int len =arr[i].length(); 
            if (len>max) 
            {
                max = len; 
            }
        }
        return max;
    }
}