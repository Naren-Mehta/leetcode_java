//https://leetcode.com/problems/valid-palindrome
package string;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int start=0;
        int end = str.length()-1;
        while(start < end){
            while(start<end && !Character.isLetterOrDigit(str.charAt(start))) start++;
            while(start<end && !Character.isLetterOrDigit(str.charAt(end))) end--;
            if(Character.toLowerCase(str.charAt(start))!= Character.toLowerCase(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
