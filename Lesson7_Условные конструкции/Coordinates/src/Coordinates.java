import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        String res ="";
        if (x>0 & y>0){
            res = "I";
        }
        if (x<0 & y>0){
            res = "II";
        }
        if (x<0 & y<0){
            res = "III";
        }
        if (x>0 & y<0){
            res = "IV";
        }
        System.out.println("Четверть координатной плоскости: "+res);
    }
}
   // Ввести координаты. Определить четверть координатной плоскости, которой принадлежит точка.