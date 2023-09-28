import java.util.Scanner;

public class F_to_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in celsius is: " + Celsius);
    }
}