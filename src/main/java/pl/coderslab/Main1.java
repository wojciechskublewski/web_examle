package pl.coderslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    private static final String mail= "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
    public static void main(String[] args) {
        System.out.println(verifyEmail("wojeciech@wwp.pl"));
        System.out.println(verifyEmail2("wojeciech@wwp"));
    }

    static boolean verifyEmail(String email) {
        return (boolean) email.matches(mail);

    }

    static boolean verifyEmail2(String email) {
        Pattern pattern = Pattern.compile(mail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }
}
