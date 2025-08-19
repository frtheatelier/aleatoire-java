package currency_exchange;

import java.util.Scanner;
import java.util.HashMap;

public class SimpleCurrencyExchange {

    static void exchange(String curr1, String curr2, HashMap<String, Double> rates) {
        System.out.println("Enter amount in "+ curr1 +": ");

        // scanner
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        double rate1 = rates.get(curr1);
        double rate2 = rates.get(curr2);

        double fin = d / rate1 * rate2;

        System.out.println("Value in "+ curr2 +": " + fin);

        // prevent resource leaks
        sc.close();
    }

    public static void main(String[] args) {
        // requirement: args must contain exactly TWO strings indicating currency1 and currency2
        // currency1 and currency2 must be any of the indicated rates in `rates`

        if (args.length < 2) {
            System.err.println("Not enough arguments");
            System.exit(1);
        }

        HashMap<String, Double> rates = new HashMap<String, Double>();
        rates.put("USD", 1.0);
        rates.put("CAD", 1.3168);
        rates.put("CNY", 6.9454);
        rates.put("EUR", 0.9013);
        rates.put("GBP", 0.7679);

        if (!rates.containsKey(args[0]) || !rates.containsKey(args[1])) {
            System.err.println("Invalid currencies");
            System.err.println("Must be within: " + rates.keySet());
            System.exit(1);
        }

        exchange(args[0], args[1], rates);
        
    }
}
