import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two integers: ");
        num1= in.nextInt();
        num2= in.nextInt();
        System.out.println((num1+num2));
        System.out.println((num1-num2));
        System.out.println(num1*num2);
        System.out.println((num1+num2)/2.0);
        System.out.println( Math.abs(num1-num2));
        System.out.println(Math.max(num1,num2));
        System.out.println(Math.min(num1,num2));
    }
}
