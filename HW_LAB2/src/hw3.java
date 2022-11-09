import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        float l,w,a,p;
        System.out.println("Enter the length of the rectangular: ");
        l= key.nextFloat();
        System.out.println("Enter the width: ");
        w= key.nextFloat();
        a=l*w;
        p=2*(l+w);
        System.out.println("Area= "+a);
        System.out.println("Perimeter= "+p);
    }
}
