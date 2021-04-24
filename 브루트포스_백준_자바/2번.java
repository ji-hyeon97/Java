import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = i;
            int divide = i;
            while (divide > 0) {
                sum = sum + divide % 10;
                divide = divide / 10;
            }
            if (sum == n) {
                System.out.println(i);
                n=-1;
                break;
            }
        }
        if(n!=-1){
            System.out.println(0);
        }
    }
}