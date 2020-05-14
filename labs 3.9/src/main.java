import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Double x_nach, x_kon, delta_x, eps, S, little_s;
        int a, n;
        Double b = 0.0;
        Double c = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.print("x_nach (|x_nach| < 1) := ");
        x_nach = in.nextDouble();
        System.out.print("x_kon (x_kon < x_nach) := ");
        x_kon = in.nextDouble();
        System.out.print("delta_x := ");
        delta_x = in.nextDouble();
        System.out.print("eps := ");
        eps = in.nextDouble();

        while (x_kon >= x_nach){
            n = 1;
            S = 0.0;
            while (true){
                a = 2*n + 1;
                int i = 1;
                while(i != n + 1){
                    Double sum_b = 1.0;
                    Double sum_c = 1.0;
                    b =(double) 2*i - 1;
                    c =(double) 2*i;
                    sum_b = sum_b * b;
                    sum_c = sum_c * c;
                    b = sum_b;
                    c = sum_c;
                    i++;
                }
                little_s = (b * Math.pow(x_nach, a)) / (c * (2 * n + 1));

                if (little_s <= eps){
                    break;
                }
                S = S + little_s;
                n++;
            }
            S = Math.PI/2 - x_nach - S;
            System.out.println("X := " + x_nach + "\n" + "S := " + S + "\n");
            x_nach = x_nach + delta_x;
        }


    }
}
