import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int a = 1;
        int b = 1;
        while (a < numero) {
            System.out.print(a + ", ");
            int tempB = b;
            b += a; // b = b + a
            a = tempB;
        }
        sc.close();
    }
}
