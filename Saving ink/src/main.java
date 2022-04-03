import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class Dot{
    Double x, y;
        }

public class main {
    static Scanner input = new Scanner(System.in);
    static int time = Integer.parseInt(input.nextLine());
    static Dot[] dot = new Dot[time];

    static void inputPhase(){
        for(int i=0; i<time; i++){
            dot[i] = new Dot();
            String in = input.nextLine();
            dot[i].x = Double.valueOf(in.split(" ")[0]);
            dot[i].y = Double.valueOf(in.split(" ")[1]);
        }
    }

    static void print(){
        for(int i=0; i<time; i++){
            System.out.println(dot[i].x + " " + dot[i].y);
        }
    }

    static void computePhase(){
        double sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        while(count != time-1) {
            int flag1=0;
            int flag2=0;
            double min = 100000;
            for (int i = 0; i < time; i++) {
                for (int j = 0; j < time; j++) {
                    if (j == i || (set.contains(i) && set.contains(j)))
                        continue;
                    double dis = Math.sqrt(Math.pow(dot[i].x - dot[j].x, 2) + Math.pow(dot[i].y - dot[j].y, 2));
                    if (dis < min) {
                        min = dis;
                        flag1 = i;
                        flag2 = j;
                    }
                }
            }
            set.add(flag1);
            set.add(flag2);
            count++;
            //System.out.println("I : " + flag1 + " j : " + flag2 + " Min : " + min);
            sum = sum + min;
        }
        System.out.println(Math.round(sum*100)/100.0);
    }

    public static void main(String[] args) {
        inputPhase();
        //print();
        computePhase();
    }
}