package string;

//https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWordsII {

    public static String reverse(String s, int i, int j) {
        char[] arr = s.toCharArray();
        while (i < j) {
            char temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }

    public static String reverseWords(String s) {

        s = reverse(s, 0, s.length());

        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                
            }
        }
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String result = reverseWords("a good example");
        System.out.println(result);
    }
}
