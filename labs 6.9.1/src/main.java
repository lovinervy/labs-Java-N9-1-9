import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int[] vector = {7, 0, 1, -5, -2, 5, 2, 0, -1, 9};
        List<Integer> mas = new ArrayList<Integer>();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0){
                mas.add(vector[i]);
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0){
                mas.add(vector[i]);
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0){
                mas.add(vector[i]);
            }
        }
        for (int i = 0; i < mas.size(); i++) {
            System.out.println(mas.get(i));
        }
    }
}
