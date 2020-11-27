import sun.text.normalizer.UCharacter;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*String s1 = "aabb";
        String s2 = "bbaa";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));*/
//        StringBuffer st1 = new StringBuffer("abab");
//        StringBuffer st2 = new StringBuffer("abab");
//        System.out.println(st1.toString().equals(st2.toString()));

        Set<Character> set  =  new HashSet<>();
        StringBuffer sb = new StringBuffer("sdsds");
        sb.append('c');
        System.out.println(sb.toString());
    }
}
