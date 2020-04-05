import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int n1 = n % 10;
        int n2 = (n/10) % 10;
        int n3 = (n/100) %10;
        System.out.print(n1);
        System.out.print(n2);
        System.out.print(n3);
    }
}
