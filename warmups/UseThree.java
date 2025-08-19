public class UseThree {
    // ok this one is directly stolen from https://introcs.cs.princeton.edu/java/11hello/UseThree.java.html
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");

        // my addition: in one line
        // System.out.println("Hi, " + args[2] + ", " + args[1] + ", and " + args[0] + ".");
    }
}
