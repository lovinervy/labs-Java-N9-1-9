import java.util.Scanner;

public class main {
    public static int recur(int num, int m){
        if (num != 0){
            return main.recur(num/10, num%10 + m*10);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Укажите натуральное число: = ");
        int n = in.nextInt();
        n = main.recur(n, 0);
        System.out.println(n);
    }
}
