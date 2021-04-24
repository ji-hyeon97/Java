import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = user.nextInt();
            array[i][1] = user.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int answer = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
                    answer++;
                }
            }
            System.out.print(answer + " ");
        }
    }
}