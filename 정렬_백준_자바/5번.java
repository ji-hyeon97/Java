import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        int[] array = new int[10];
        while (n > 0) {
            array[n % 10]++;
            n = n / 10;
        }
        for (int i = 9; i>=0; i--) {
            while (array[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}