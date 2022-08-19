import java.util.Scanner;

class addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long e = sc.nextInt();
        // long power = 1;
        for (int i = 1; i < e; i++) {
            n = n * 10;
        }
        System.out.println(n);
    }

}
