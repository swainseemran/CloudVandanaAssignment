import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int n1 = (int) (Math.random() * a.length);
            while (true) {
                if (b[n1] == 0) {
                    b[n1] = a[i];
                    break;
                } else {
                    n1 = (int) (Math.random() * a.length);
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}