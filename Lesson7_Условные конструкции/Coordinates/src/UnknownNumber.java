import java.util.Scanner;

public class UnknownNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int p = scn.nextInt();
        double d=s*s-4*p;
        String res="";
        if(d>=0){
            double x1=(s-Math.sqrt(d))/2;
            double x2=(s+Math.sqrt(d))/2;
            res="X="+x1+"\n"+"y="+x2;
        }else{
            res="Нет таких чисел";
        }
        System.out.println(res);


    }

}
  //  Рандомно инициализировать два натуральных числа X и Y (X,Y≤1000), которые пользователь должен отгадать.
   //     Для этого программа делает две подсказки. Программа сумму этих чисел S и их произведение P.