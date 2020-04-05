import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = 4;
        while (n > 0) {
            System.out.print(scanner.nextInt() - 1 + " ");
            n--;
        }
    }
}