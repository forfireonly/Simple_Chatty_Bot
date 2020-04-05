import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int max = 0;
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()){
            int number = scn.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}