package StringAndSubsets;

import java.util.Locale;

public class SkipCharacter {
    public static void main(String[] args) {
        String s = "Man in black";
        char ch = 'a';
        System.out.println(skip(s, ch));
    }

    static String skip(String s, char character) {
        if(s.isEmpty()) return "";
        char ch = s.charAt(0);
        if(ch == character) {
            return skip(s.substring(1), character);
        } else {
            return ch + skip(s.substring(1), character);
        }
    }
}
