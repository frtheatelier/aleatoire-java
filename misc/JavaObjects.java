package misc;

public class JavaObjects {
    static void myMethod(String e) {
        System.out.println("I just got executed! " + e);
    }
    
    String b = "1";

    public static void main(String[] args) {
        JavaObjects a = new JavaObjects();

        myMethod(a.b);
        myMethod(a.b);
        myMethod(a.b);
    }
}
