import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        double a = scn.nextInt();
        double b = scn.nextInt();
        double sum = 0;
        double count = 0;
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double result = sum / count;
        System.out.println(result);
    }
}