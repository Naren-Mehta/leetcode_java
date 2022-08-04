package string;

//https://leetcode.com/problems/implement-strstr/
public class ImplementStrstr_good_solution {

    public static int strStr(String haystack, String needle) {

        for(int i=0; ;i++){
            for(int j=0;;j++){
                if(j == needle.length()) return i;
                if(i+j == haystack.length()) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j)) break;
            }
        }
    }

    public static void main(String[] args) {
        int result = strStr("mississippi", "issip");
        System.out.println(result);
//        "mississippi"
//        "issip"
    }
}
