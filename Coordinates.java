import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("xa = ");
        int xa = scan.nextInt();
        
        System.out.println("ya = ");
        int ya = scan.nextInt();
        
        System.out.println("xb = ");
        int xb = scan.nextInt();
        
        System.out.println("yb = ");
        int yb = scan.nextInt();

        int a = xa + ya;
        int b = xb + yb;

        int length = Math.abs(a - b);
        System.out.println(length);
    }
}
