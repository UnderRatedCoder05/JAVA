import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("The Sum is:" +sum);
    }
}
