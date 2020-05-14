import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Double x, y, mod_x;
        Scanner in = new Scanner(System.in);

        System.out.print("Input x:= ");
        x = in.nextDouble();

        mod_x = x % 2;

        if (mod_x == 0.0){
            y = 1.0;
        } else if (mod_x == 1.0){
            y = 0.0;
        } else {
            x = Math.abs(1 - mod_x);
            y = 1 - Math.sqrt(1 - Math.pow(x, 2));
        }
        System.out.println("y := " + y);
    }
}
