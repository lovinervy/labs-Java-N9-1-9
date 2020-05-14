import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String text = "a*bc -&19 -l sb3> 4-5 z%x";
        Scanner in = new Scanner(System.in);

        System.out.printf("Номер начального пробела := ");
        int p_nach = in.nextInt();

        System.out.printf("Номер конечного пробела := ");
        int p_kon = in.nextInt();
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                j++;
            }
        }
        if(j == 0 || p_kon > j){
            System.out.printf("Error");
        } else if(p_nach > p_kon){
            System.out.printf("Error p_kon < p_nach");
        } else{
            int i = 0;
            String word = "";
            for (int k = 0; k < text.length(); k++) {
               if(text.charAt(k) == ' '){
                   i++;
               }
               if(p_nach <= i & p_kon > i){
                   word = word + text.charAt(k);
               }
            }
            System.out.println(word);
        }
    }
}
