import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in NPR: ");
        double npr_amount = sc.nextDouble();
        double usd_exchange_rate = 0.0075;
        double usd_amount = npr_amount * usd_exchange_rate;
        System.out.println("The amount in USD is: " + usd_amount);
    }
}