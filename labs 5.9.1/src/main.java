import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String text = "a*bc&19-l sb3>4-5z%x";
        int n_min = 0;
        int n_max = 0;
        List<Integer> mas = new ArrayList<Integer>();

        for (int i = 0; i < text.length(); i++) {
            int m = Character.digit(text.charAt(i), 10);
            if (m != -1){
                int p = i - 1;
                int k = 0;
                while (m != -1){
                    k = k*10 + m;
                    i++;
                    m = Character.digit(text.charAt(i), 10);
                }
                if(p >= 0){
                    if(text.charAt(p) == '-'){
                        k = -k;
                    }
                }
                mas.add(k);
            }
        }
        for (int i = 0; i < mas.size(); i++) {
            int k = mas.get(i);
            if (n_min > k){
                n_min = k;
            } else if(n_max < k){
                n_max = k;
            }
        }
        System.out.println("min := " + n_min + "\nmax := " + n_max);
    }
}
