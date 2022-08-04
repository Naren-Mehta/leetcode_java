package string;

//https://leetcode.com/problems/implement-strstr/
public class ImplementStrstr {

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int x = i;
                int j = 0;
                boolean found = true;
                while (x < haystack.length() && j < needle.length()) {
                    if (haystack.charAt(x) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                    x++;
                    j++;
                }
                if (found && j == needle.length()) {
                    return i;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int result = strStr("mississippi", "issip");
        System.out.println(result);
//        "mississippi"
//        "issip"
    }
}
