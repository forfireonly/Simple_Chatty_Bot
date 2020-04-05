import java.util.Scanner;

class Main {
    public static int number(int num) {
        int desks;
        if (num % 2 == 0) desks = num / 2;
        else {
            desks= (num / 2) + 1;
        }

        return desks;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(number(n1) + number(n2) +number(n3));

    }
}