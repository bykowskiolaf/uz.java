package Zad3;// Z podanego zdania należy wyodrębnić zawarte w nim słowa stosując wyrażenie
// regularne

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String email = "contact@bykowskiolaf.dev";
        String wzorRegEx = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(wzorRegEx);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + " jest prawidłowym adresem e-mail.");
        } else {
            System.out.println(email + " nie jest prawidłowym adresem e-mail.");
        }
    }
}