import java.util.Scanner;

public class main {
    public static Double recur(int num){
        if (num > 1){
            return Math.sqrt(3.0 + recur(num - 1));
        } else{
            return Math.sqrt(3.0);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Укажите кол-во n: = ");
        int num = in.nextInt();
        Double n = recur(num);
        System.out.println(n);

    }
}
