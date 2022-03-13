import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int flag = input.nextInt();
            if (flag == 0)
                break;
            else if (flag >= 100) {
                System.out.println("The number of students cannot be more than 100");
                break;
            }
            int[] p = new int[flag];
            double sum = 0, avg = 0;

            for (int i = 0; i < flag; i++) {
                p[i] = input.nextInt();
                if (p[i] >= 100000) {
                    System.out.println("Student can't spent more than 100,000 won");
                    System.out.println("Please type again");
                    i--;
                } else
                    sum += p[i];
            }

            avg = Math.floor((sum / flag) / 10) * 10;
            sum = 0;

            for (int i = 0; i < flag; i++) {
                if (avg - p[i] > 0) {
                    sum = sum + (avg - p[i]);
                }
            }

            System.out.println((int) sum);
        }
    }
}