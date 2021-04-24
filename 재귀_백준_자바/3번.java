import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int num = user.nextInt();
        for (int x = 0; x < num; x++) {
            for (int y = 0; y < num; y++) {
                star(x, y, num);
            }
            System.out.println(" ");
        }
    }
    public static void star(int x, int y, int num) {
        if ((x / num) % 3 == 1 && (y / num) % 3 == 1) {
            System.out.print(" ");
        } else {
            if (num / 3 == 0) {
                System.out.print("*");
            } else {
                star(x, y, num / 3);
            }
        }
    }
}
//시간초과문제 
