import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        int n = user.nextInt();
        int sum = tower(n, a, b, c);
        System.out.println(sum);
        tower1(n, a, b, c);
    }
    static int i = 0;
    public static int tower(int n, int a, int b, int c) {
        i++;
        if(n==1){
            return 1;
        }
        tower(n - 1, a, c, b);
        tower(n - 1, b, a, c);
        return i;
    }

    public static void tower1(int n, int a, int b, int c) {
        if (n == 1) {
            System.out.println(a + " " + c);
        } else {
            tower1(n - 1, a, c, b);
            System.out.println(a + " " + c);
            tower1(n - 1, b, a, c);
        }
    }
}