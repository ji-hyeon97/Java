import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        int count = 1;
        int ans = 666;
        while (count != n) {
            ans++;
            if (String.valueOf(ans).contains("666") == true) {
                count++;
            }
        }
        System.out.println(ans);
    }
}