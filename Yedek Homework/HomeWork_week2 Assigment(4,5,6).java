//Segbe Abdoul Aziz Diomande
//Assigment4
import java.util.Scanner;
public class Assigment4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number : ");
            int number = scanner.nextInt();
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial is " + number + " is : " + factorial);
        }
}
//Assigment5
import java.util.Scanner;
public class Assigment5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of terms of the Fibonacci sequence to generate : ");
            int numberTerms = scanner.nextInt();
            int firstTerms = 0;
            int secondTerms = 1;
            System.out.print("Fibonacci sequence up " + numberTerms + " terms : ");
            for (int i = 1; i <= numberTerms; ++i) {
                System.out.print(firstTerms + ", ");
                int sumOfTerms = firstTerms + secondTerms;
                firstTerms = secondTerms;
            secondTerms = sumOfTerms;
            }
        }
}
//Assigment6
import java.util.Scanner;                                                       
public class Assigment6 {                                                       
        public static void main(String[] args) {                                
            Scanner scanner = new Scanner(System.in);                           
            System.out.print("Enter a string: ");                               
            String inputString = scanner.nextLine();                            
            if (isPalindrome(inputString)) {                                    
                System.out.println("The string is a palindrome.");              
            } else {                                                            
                System.out.println("The string is not a palindrome.");          
            }                                                                   
        }                                                                       
        public static boolean isPalindrome(String str) {                        
            str = str.replace("\\s+", "").toLowerCase();                        
            for (int i = 0; i < str.length() / 2; i++) {                        
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {        
                    return false;                                               
                }                                                               
            }                                                                   
            return true;                                                        
        }                                                                       
                                                                              
}                                                                               
                                                                                
