import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = user.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        /*
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
         */
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
