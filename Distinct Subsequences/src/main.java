import java.util.Scanner;

public class main {
    static int len, count;
    static String[] z = new String[100];
    static String[] x = new String[100];

    public static void loop(int flag, int num){
        int k=0;
        if(flag ==0) k = 0;
        else k = flag + 1;
        for (int i = k; i<len; i++){
            if(z[i].equals(x[num])){
                num++;
                if(num==x.length){
                    count++;
                }
                else{
                    loop(i, num);
                }
                num--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = Integer.parseInt(input.nextLine());
        while (time != 0) {
            String line = input.nextLine();
            z = line.split("");
            line = input.nextLine();
            x = line.split("");

            len = z.length;
            count = 0;

            loop(0,0);

            System.out.println(count);
            time--;
        }
    }
}