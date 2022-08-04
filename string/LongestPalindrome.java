//https://leetcode.com/problems/longest-palindromic-substring/
package string;

public class LongestPalindrome {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        String maxPalindromeStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (maxPalindromeStr.length() < str.length() && isPalindrome(str)) {
                    maxPalindromeStr = str;
                }
            }
        }
        return maxPalindromeStr;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
