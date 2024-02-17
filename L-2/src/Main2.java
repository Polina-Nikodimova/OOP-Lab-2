import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число иттераций:");
        int y = input.nextInt();
        System.out.println("Введите число x от -1 до +1:");
        double x = input.nextDouble();
        double res = 0;

        if(x >= -1 & x <= 1) {
            for (int n = 0; n < y; n++) {
                res += Math.pow(x, 2 * n + 1) / (2 * n + 1);
            }
            System.out.println(res);
        } else {
            System.out.println("Число x содержит недопустимое значение!");
        }
    }
}
