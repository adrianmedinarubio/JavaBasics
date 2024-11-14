package RegularExpresions;

import java.util.regex.Pattern;

public class TestRegularExpressions {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.matcher("java").matches()); 
        System.out.println(pattern.matcher("JAVA").matches());
        System.out.println(pattern.matcher("javascript").matches());
    }
}
