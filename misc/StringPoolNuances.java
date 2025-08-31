package misc;

import java.util.Objects;
import java.util.logging.*;

public class StringPoolNuances {
    static Logger logger = Logger.getLogger(StringPoolNuances.class.getName());
    private static final String DEFSTRING = "hello!";  //

    public static void main(String[] args) {
        // based on what I've read, apparently Java has a 'string pool'
        // strings get reused by a different variable if the string content is the same

        String s1 = DEFSTRING;
        String s2 = DEFSTRING;
        logger.info(() -> "Consider s1 and s2 to contain the string" + s1);
        logger.info("there is no 'new' added. s1 and s2 are the same");
        logger.info(() -> String.valueOf(Objects.equals(s1, s2)));
        logger.info(() -> String.valueOf(s1 == s2));


        String s11 = new String(DEFSTRING);
        String s21 = new String(DEFSTRING);
        logger.info("This time around, we add 'new' when establishing the variables");
        logger.info("same string, but look at what happens.");
        logger.info(() -> String.valueOf(Objects.equals(s11, s21)));
        logger.info(() -> String.valueOf(s11 == s21));

        logger.info("Other misc stuff:");
        logger.info(() -> "s1 == s11 -> " + (s1 == s11));
        logger.info(() -> "s2 == s11 -> " + (s2 == s11));
        logger.info(() -> "s1 == s21 -> " + (s1 == s21));
        logger.info(() -> "s2 == s21 -> " + (s2 == s21));
        logger.info(() -> "s1 == " + DEFSTRING + " -> " + (s1 == DEFSTRING));
        logger.info(() -> "s2 == " + DEFSTRING + " -> " + (s2 == DEFSTRING));
        logger.info(() -> "s11 == " + DEFSTRING + " -> " + (s11 == DEFSTRING));
        logger.info(() -> "s21 == " + DEFSTRING + " -> " + (s21 == DEFSTRING));
    }
}
