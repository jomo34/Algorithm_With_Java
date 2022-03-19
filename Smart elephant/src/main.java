import java.io.*;

class elephant {
    int w;
    int s;
    int num;
}

public class main {
    static int len = 0;
    static int maxtime = 0;
    static String result;

    public static void sort(elephant[] elephants) {
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (elephants[j].w < elephants[min].w) {
                    min = j;
                }
            }
            elephant temp;
            temp = elephants[i];
            elephants[i] = elephants[min];
            elephants[min] = temp;
        }
    }

    public static void compute(elephant[] elephants) {
        for (int i = 0; i < len - 1; i++) {
            StringBuilder seq_now = new StringBuilder(String.valueOf(elephants[i].num));
            int time = 1;
            int min = elephants[i].s;
            for (int j = i + 1; j < len; j++) {
                if (min > elephants[j].s) {
                    seq_now.append(elephants[j].num);
                    min = elephants[j].s;
                    time++;
                }
            }

            if (time > maxtime) {
                result = seq_now.toString();
                maxtime = time;
            }
        }
    }

    public static void main(String[] args) {
        elephant[] elephants = new elephant[1000];
        String line;
        try {
            File file = new File("C:\\Users\\jo\\IdeaProjects\\Smart elephant\\src\\input.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            while ((line = bufReader.readLine()) != null) {
                String[] str = line.split(" ");
                elephants[len] = new elephant();
                elephants[len].w = Integer.parseInt(str[0]);
                elephants[len].s = Integer.parseInt(str[1]);
                elephants[len].num = len + 1;
                len++;
            }
            bufReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (
                IOException e) {
            System.out.println("IO exception");
        }

        sort(elephants);
        compute(elephants);

        System.out.println(maxtime);
        System.out.println(result);
    }
}

