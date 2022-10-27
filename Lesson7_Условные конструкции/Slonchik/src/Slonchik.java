import java.util.Scanner;

public class Slonchik {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        String res = (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? "Бьет" : "Не бьет";
      //  if (Math.abs(x1 - x2)==Math.abs(y1-y2)){
      //       res="Бьет";
      //  }else {
      //      res="Не бьет";
        }
      //  System.out.println(res);
    }

}
