import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Double S = 0.0;
        Double tmp;
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Укажите N := ");
        n = in.nextInt();

        for(int i = 1; n >= i; i++){
            tmp = Math.pow(-1, i - 1) * 1/Math.pow(2*i - 1, 3);
            S = S + tmp;
        }
        System.out.println("S := " + S);
    }
}
