//https://leetcode.com/problems/longest-palindromic-substring/
package string;

public class LongestPalindromeBestSolution {

    public static String helper(String str, int start, int end) {
        System.out.println(str+ " "+start + " "+end);
        while (start >=0 && end <= str.length()-1 && str.charAt(start)== str.charAt(end)) {
            start--;
            end++;
        }
        System.out.println(str+ " "+(start+1) + " "+end);
        System.out.println();
        return str.substring(start+1, end);
    }

    public static String longestPalindrome(String s) {

        if(s.isEmpty()) return null;
        if(s.length()==1) return s;

        String maxPalindromeStr = "";

        for (int i = 0; i < s.length(); i++) {
            String subStr = helper(s, i, i);
            if(maxPalindromeStr.length() < subStr.length()){
                maxPalindromeStr = subStr;
            }

            subStr = helper(s, i, i+1);
            if(maxPalindromeStr.length() < subStr.length()){
                maxPalindromeStr = subStr;
            }
        }
        return maxPalindromeStr;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
