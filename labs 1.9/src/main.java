import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Double a, b, c, z, x;

        Scanner in = new Scanner(System.in);
        System.out.print("Input x:= ");
        x = in.nextDouble();

        z = 1 + Math.pow(x, 2) + Math.pow(x, 3);
        a = Math.sqrt(x + Math.sqrt(x + Math.sqrt(x)));
        a = z / a;

        z = Math.pow(a, 1/3) + Math.pow(a, 0.25);
        b = Math.sqrt(a + Math.pow(Math.PI, x));
        b = z / b;

        c = Math.log(Math.pow(a, Math.sqrt(2)) + Math.pow(b, Math.pow(x, 1/3)));
        System.out.println("a := " + a);
        System.out.println("b := " + b);
        System.out.println("c := " + c);
    }
}
