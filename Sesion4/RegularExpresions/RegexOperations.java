package RegularExpresions;

import java.util.Arrays;

public class RegexOperations {
    public static void main(String[] args) {
        String str1 = "J A V A";
        System.out.println(str1.replaceAll("\\s", ""));
        String str2 = "J,AVA";
        System.out.println(str2.replaceFirst(",", ""));
        String str3 = "Angular,Java,C#,C++";
        System.out.println(Arrays.stream(str3.split(","))
            .filter(s -> s.equals("Java")).findFirst().get());
        String str4 = "adrian#medina@axity.com";
        System.out.println(str4.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"));
    }
}
