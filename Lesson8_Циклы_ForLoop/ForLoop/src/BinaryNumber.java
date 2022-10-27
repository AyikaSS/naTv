public class BinaryNumber {
    public static void main(String[] args) {
        int x = (int) (Math.random() * (10000 - 1) + 1);
        for (; x > 1; ) {
            System.out.println(x);
            x = x / 2 + x % 2;
            if (x == 1) {
                System.out.println("YES");
                break;
            } else {
                if (x % 2 == 1) {
                    System.out.println("NO");
                    break;
                }
            }

        }
    }
}
