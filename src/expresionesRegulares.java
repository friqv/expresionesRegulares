import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class expresionesRegulares {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Escribe una cadena.");
            return;
        }

        String arg = args[0];
        String exp = "[hH][oO][lL][aA][mM][uU][nN][dD][oO]";

        Pattern pattern = Pattern.compile(exp);


        Matcher matcher = pattern.matcher(arg);
        boolean isMatch = matcher.matches();

        if (isMatch) {
            System.out.println("La cadena es válida");
        } else {
            System.out.println("La cadena no es válida");
        }
    }
}
