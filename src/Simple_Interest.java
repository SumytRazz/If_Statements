import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        double si;
        double r;
        int p;
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        p = sc.nextInt();
        System.out.println("Enter time: ");
        t = sc.nextInt();
        System.out.println("Enter rate of interest: ");
        r = sc.nextDouble();
        si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
        sc.close();
    }
}