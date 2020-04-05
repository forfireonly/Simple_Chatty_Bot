import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int elem = 0;
        for (int i = 1; i <= n; i++) {
            int inter = scn.nextInt();
            if (inter % 4 == 0 && inter > elem) {
                elem = inter;
            }
        }
        System.out.println(elem);
    }
}
