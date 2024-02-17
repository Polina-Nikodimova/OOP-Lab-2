import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x = ");
        int x = input.nextInt();
        double res;
        if(x > 0){
            System.out.println("Введите a = ");
            int a = input.nextInt();
            res = a + Math.pow(0.5*Math.E, -1*x);
        } else {
            System.out.println("Введите b = ");
            int b = input.nextInt();
            res = Math.cos(b*x+1);
        }
        System.out.println(res);
    }
}

