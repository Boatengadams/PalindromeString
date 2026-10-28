// Question: Is the string entered by the user a palindrome?
package Loop;

import java.util.Scanner;

// A program which finds if a string is palindrome string or not
// ADA ,12321
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("ENTER WORD TO CHECK IF IS PALINDROME");
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        boolean isPalindrome = true;
        for(int i =0 , j = str.length()-1; i<j ; i++, j-- ){
            if (str.charAt(i) == str.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome?"Palindrome" : "Not Palindrome");
    }
}
