import java.util.Scanner;

public class Welcome {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();

        if (age==17){
            System.out.println("welcome");
            }
        else {
            System.out.println("sorry");
        }
    }
}
