import java.util.Random;
import java.util.Scanner;

public class Main4 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            Random rm = new Random();


//        System.out.println((double) 50/12;
            int min = 3;
            int max = 10;
            int range = max - min;
            int x = rm.nextInt(7)+2; // int) (Math.random() * range) + 2;
            int y = rm .nextInt(7)+2; // int) (Math.random() * range) + 2;
//        System.out.println(x);
//        System.out.println(y);
            boolean multRes = false;
            int mult = x * y;

            while (!multRes){
                int res = scn.nextInt();
                multRes = res == mult;
                System.out.println(multRes);}


        }

    }

