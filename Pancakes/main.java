import java.io.*;

public class main {
    static int size = 0, max, flag;
    private static String[] pancakes;

    public static void findmax() {
        max = 0;
        flag = 0;
        for (int i = 0; i <= size; i++) {
            if (max < Integer.parseInt(pancakes[i])) {
                max = Integer.parseInt(pancakes[i]);
                flag = i;
            }
        }
    }

    public static void flip(int point) {

        for (int i = 0; i <= point; i++) {
            String tmp = pancakes[i];
            pancakes[i] = pancakes[point];
            pancakes[point] = tmp;
            point--;
        }
    }

    public static void main(String[] args) throws IOException {
        String line = null;
        String seq = "";
        try {
            File file = new File("input.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            line = bufReader.readLine();
            bufReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println(e);
        }

        pancakes = line.split(" ");
        int length = pancakes.length;
        size = pancakes.length - 1;

        while (size >= 1) {
            findmax();
            if (flag == 0) {
                flip(size);
                seq = seq + " " + Integer.toString(length - size);
            } else if (flag == size) {
            } else {
                flip(flag);
                flip(size);
                seq = seq + " " + Integer.toString(length - flag) + " " + Integer.toString(length - size);
            }
            size--;
        }
        for (int i = 0; i < length; i++) {
            System.out.printf(" " + pancakes[i]);
        }
        seq = seq + " 0";
        System.out.println("\n" + seq);

    }
}