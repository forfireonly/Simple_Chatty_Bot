import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn =  new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int n = scn.nextInt();
        int count = 0;
        for (int low = a; low <= b; low ++){
            if (low % n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
