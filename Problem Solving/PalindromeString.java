import java.util.*;

class PalindromeString
{
    boolean isPalindrome(String inputWord)
    {
        char[] charArray = inputWord.toCharArray();
        int start = 0;
        int end = inputWord.length()-1;
        while(start<end)
        {
            if(charArray[start]!=charArray[end])
            {
                return false;    
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String args[])
    {
        PalindromeString x = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char string to check if it's palindrome : ");
        String word = sc.next();
        if(x.isPalindrome(word))
        {
            System.out.println("String is Palindrome !");
        }
        else
        {
            System.out.println("String is NOT Palindrome !");
        }
    }
}
