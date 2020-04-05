import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if (number != 1) {
            do {
                System.out.print(number + " ");
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = number * 3 + 1;
                }
            }
            while (number != 1);
        }
        System.out.print(number + " ");
    }
}
