import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Double tmp, a1, a2;
        int k;
        Scanner in = new Scanner(System.in);

        System.out.printf("Укажите a1 := ");
        a1 = in.nextDouble();
        System.out.printf("Укажите a2 := ");
        a2 = in.nextDouble();
        System.out.printf("Укажите K := ");
        k = in.nextInt();

        for(int i = 3; k >= i; i++){
            System.out.println(i);
            if(i % 2 == 0){
                tmp = Math.sin(Math.PI*a2/2);
            } else{
                tmp = Math.cos(Math.PI*a1/2);
            }
            a1 = a2;
            a2 = tmp;
            System.out.println(a2);
        }
    }
}
