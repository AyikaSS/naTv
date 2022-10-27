public class Triangle {
    public static void main(String[] args) {
        long a = 0;
        for (int  i = 1 ; i <= 10 ; i++) {


            if (i == 10) {
                a = a * 100 + i;
            } else {
                a = a * 10 + i;
            }
            System.out.println(a);
        }

    }
}

