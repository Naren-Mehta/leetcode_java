//https://leetcode.com/problems/word-break/

package string;

import java.util.ArrayList;
import java.util.List;

public class WordBreak_BestSolution {
    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] t= new boolean[s.length()+1];
        t[0] = true;
        for(int i=0;i<s.length();i++){
            if(!t[i]) continue;

            for(String a: wordDict){
                int len = a.length();
                int end = i+len;
                System.out.println(" a: "+a +" end: "+end);
                if(end>s.length()) continue;

                if(t[end]) continue;
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
                for(boolean b: t){
                    System.out.print(b+" ");
                }
            }
        }
        return t[s.length()];
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");

        System.out.println("===");
        boolean result = wordBreak("catsandog", list);
        System.out.println(result);
    }
}
