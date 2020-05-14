import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public  static void printer(int[][] mas){
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.format("%6d", mas[i][j]);
            }
            System.out.println();
        }
    }
    public static void clearFile() throws IOException {
        FileWriter file = new FileWriter("file.txt", false);
        PrintWriter print_file = new PrintWriter(file, true);
        print_file.close();
        file.close();
    }

    public static void writer(int[][] mas) throws IOException {
        try (FileWriter file = new FileWriter("file.txt", false)) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[0].length - 1; j++) {
                    file.write(String.valueOf(mas[i][j]) + " ");
                }
                file.write(String.valueOf(mas[i][mas[0].length - 1]) + "\n");
            }
        }
    }
    public static int[][] reader() throws FileNotFoundException {
        try {
            try (FileReader file = new FileReader("file.txt")){
                char[] buffer =  new char[8096];
                int chars = file.read(buffer);
                List<String> mas = new ArrayList<>();
                while (chars != -1){
                    String num = String.valueOf(buffer, 0, chars);
                    chars = file.read(buffer);
                    System.out.println(num);
                    for (String r : num.split("\n")){
                        mas.add(r);
                    }
                }
                int m = 1;
                for (char elements : mas.get(0).toCharArray()){
                    if (elements == ' '){
                        m++;
                    }
                }
                int [][] get_mas = new int[mas.size()][m];
                for (int i = 0; i < mas.size(); i++) {
                    int n = 0;
                    for (String r : mas.get(i).split(" ")){
                        get_mas[i][n] = Integer.valueOf(r);
                        n++;
                    }
                }
                return get_mas;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new int[0][0];
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.printf("Кол-во строк: = ");
        int n = in.nextInt();
        System.out.printf("кол-во столбцов: = ");
        int m = in.nextInt();
        System.out.printf("Минимальное число: = ");
        int min = in.nextInt();
        System.out.printf("Максимальное число: = ");
        int max = in.nextInt();

        int middle = Math.abs(max) + Math.abs(min);
        int[][] mas = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                int random_num;
                if (min >= 0) {
                    random_num = middle - random.nextInt(max);
                } else {
                    random_num = max - random.nextInt(middle);
                }
                mas[i][j] = random_num;
            }
        }
        main.printer(mas);
        main.writer(mas);
        int[][] new_mas = main.reader();

        min = new_mas[0][0];
        max = new_mas[0][0];
        int imin = 0, imax = 0, jmin = 0, jmax = 0;

        for (int i = 0; i < new_mas.length; i++) {
            for (int j = 0; j < new_mas[0].length; j++) {
                if (min > new_mas[i][j]){
                    min = new_mas[i][j];
                    imin = i;
                    jmin = j;
                } else if(max < new_mas[i][j]){
                    max = new_mas[i][j];
                    imax = i;
                    jmax = j;
                }
            }
        }
        new_mas[imin][jmin] = max;
        new_mas[imax][jmax] = min;
        main.printer(new_mas);
        main.clearFile();
        main.writer(new_mas);
    }
}
