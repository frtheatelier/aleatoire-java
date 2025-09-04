package misc;

import java.util.Objects;

public class DemoLoop {
    public static void main(String[] args) {
        loopOne();
        loopTwo();
        loopThree();
        loopFour();
        loopFive();
    }

    private static void loopFive() {
        int i = 0;
        for (++i; i <= 5 ; i++) {
            System.out.println(i + ", " + (6-i));
        }
    }

    private static void loopFour() {
        int i;
        for (i = 1; i <= 5 ;) {
            System.out.println(i + ", " + (6-i));
            i++;
        }
    }

    private static void loopThree() {
        int i = 1;
        for (; i <= 5 ; i++) {
            System.out.println(i + ", " + (6-i));
        }
    }

    private static void loopTwo() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + ", " + (6-i));
        }
    }

    private static void loopOne() {
        for (int i = 1, j = 5; i <= 5 && true; i++, j--) {
            System.out.println(i + ", " + j);
        }
    }
}
