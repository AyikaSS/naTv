import java.util.Scanner;

public class ChetnoNechetnoe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
//        int res = 0;
//
//        if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) res++;
//        if (A % 2 != 0 || B % 2 != 0 || C % 2 != 0) res++;
//        if (res == 2) {
//            System.out.println("Yes");
//        } else {
//        System.out.println("No");}

        if(A % 2 == B % 2 && B%2 == C % 2) {
            System.out.println("No");
        } else {
        System.out.println("Yes");}
    }
}

//    Даны три целых числа A, B, C. Определить, есть ли среди них хотя бы одно четное и хотя бы одно нечетное.
//        A, B, C не превышают по модулю 10000. Вывести – «YES» или «NO»