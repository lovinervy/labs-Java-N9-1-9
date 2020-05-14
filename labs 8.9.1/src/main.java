import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void  writer(ArrayList<String> mas){
        try (FileWriter file1 = new FileWriter("file.txt", true)) {
            for (int i = 0; i < mas.size(); i++){
                String value = mas.get(i);
                file1.write(value + "\n");
                System.out.println(value + "; ");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void clearFile() throws IOException {
        FileWriter file = new FileWriter("file.txt", false);
        PrintWriter print_file= new PrintWriter(file, true);
        print_file.close();
        file.close();
    }
    public static void write_new_text(int min, int max, List<Integer> new_mas) throws IOException {
        ArrayList<String> mas = new ArrayList<>();
        for (int j = 0; j < max; j++) {
            mas.add(String.valueOf(new_mas.get(j)));
        }
        for (int j = min; j < new_mas.size(); j++) {
            mas.add(String.valueOf(new_mas.get(j)));
        }
        main.clearFile();
        main.writer(mas);
    }
    public static void main(String[] args) throws IOException {
        ArrayList<String> mas = new ArrayList<>();
        String text;
        int i = 0;
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print(i++ + "): ");
            text = in.nextLine();
            if (text.equals("0")){
                break;
            }
            mas.add(text);
        }
        main.writer(mas);
        mas.clear();

        try (FileReader file_text = new FileReader("file.txt")){
            char[] buffer = new char[8096];

            int chars = file_text.read(buffer);

            List<Integer> new_mas = new ArrayList<>();
            i = 0;
            while (chars != -1){
                String num =  String.valueOf(buffer, 0, chars);
                chars = file_text.read(buffer);

                for( String r : num.split("\n")){
                    new_mas.add(Integer.valueOf(r));
                }
            }
            file_text.close();

            int min = - 1, max = - 1;
            for (int j = 0; j < new_mas.size(); j++) {
                if (new_mas.get(j) < 0){
                    min = j ;
                }
                if (new_mas.get(new_mas.size() - j - 1) > 0) {
                    max = new_mas.size() - j;
                }
            }
            if(min != -1 || max != -1){
                main.write_new_text(min, max, new_mas);
            } else {
                System.out.println("Error");
            }
        }
    }
}