import java.util.Scanner;

public class Lingxin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        printLingxin(x);
    }

    private static void printLingxin(int x) {
        //上
        for(int i = 0; i < x; i++){
            for (int j = 0; j < x-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < x + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        //下
        for(int i = 0; i < x ; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < x-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
