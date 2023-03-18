
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, sum = 0;
        n = scn.nextInt();
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Сумма всех чисел введенного числа равна " + sum);
    }
}
