import java.util.Scanner;

public class MultipleHelloWorlds {
    // Ten hello worlds? I'll do you better and do it 'n' times for the hell of it
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        // scanner
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Hello, World!");
        }

        // prevent resource leaks
        sc.close();
    }
}
