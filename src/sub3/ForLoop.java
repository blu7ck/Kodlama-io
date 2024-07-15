package sub3;
import java.util.Scanner;
public class ForLoop {
//Integer tanımlı olduğu için lütfen girilen değeri abartmayın sonuç gittikçe bozulacaktır
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nFibonacci serisinin kaç sayısını görmek istiyorsanız o kadar değer girin: ");
            int n = scanner.nextInt();

            int num1 = 0, num2 = 1;

            System.out.println("\nFibonacci Serisi: ");

            for (int i = 1; i <= n; ++i) {
                System.out.print(num1 + " ");

                int nextNum = num1 + num2;
                num1 = num2;
                num2 = nextNum;
            }
        }
}
