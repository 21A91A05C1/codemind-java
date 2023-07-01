import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0.0;
        
        for (int i = 1; i <= n; i++) {
            res += 1.0 / i;
        }
        
        System.out.printf("%.2f", res);
    }
}