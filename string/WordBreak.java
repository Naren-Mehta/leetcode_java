//https://leetcode.com/problems/word-break/

package string;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static boolean wordBreakHelper(String s, List<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }

        for (String a : wordDict) {
            int len = a.length();
            int end = start + len;
            if (end > s.length()) {
                continue;
            }
            if (s.substring(start, end).equals(a)) {
                if (wordBreakHelper(s, wordDict, end)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s, wordDict, 0);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
//        list.add("sand");
        list.add("an");
//        list.add("cat");

        boolean result = wordBreak("catsandog", list);
        System.out.println(result);
    }
}
