
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ex4 {

    public static void main(String[] args) {

        System.out.println("Введите целое число больше 3");
        int n, y = 0, x = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        do {
            n = in.nextInt();
        }
        while (n <= 3);
        int[] name = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = rand.nextInt(n);
            if (name[i] % 2 == 0)
                y++;
        }
        System.out.println(Arrays.toString(name));
        int[] output = new int[y];
        for (int i = 0; i < n; i++) {
            if (name[i] % 2 == 0) {
                output[x] = name[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
