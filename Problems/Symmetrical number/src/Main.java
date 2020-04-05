import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int ones = number % 10;
        int tens = (number % 100) / 10;
        int hundreds = (number % 1000) /100;
        int thousands = (number % 10000) / 1000;
        if (ones == thousands && tens == hundreds) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}
