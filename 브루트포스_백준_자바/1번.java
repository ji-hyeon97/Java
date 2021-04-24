import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        int m = user.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = user.nextInt();
        }
        int result = answer(n, m, array);
        System.out.println(result);
    }

    public static int answer(int n, int m, int[] array) {
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (sum == m) {
                        return sum;
                    }
                    if (result < sum && sum < m) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}