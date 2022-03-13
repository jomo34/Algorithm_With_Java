import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        flag = input.nextInt();

        while(flag != 0){
            int [] p = new int[flag];
            int sum=0, avg=0;
            for(int i=0; i<flag; i++){
                p[i] = input.nextInt();
                sum += p[i];
            }
            avg = sum / flag;
            sum=0;
            for(int i=0; i<flag; i++){
            if(avg - p[0] > 0){
                
            }
            }
        }

    }
}
