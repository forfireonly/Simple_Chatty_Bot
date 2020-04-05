import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int track = 0;
        for (int i = 1; track < n;  i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                track++;
                if (track == n) {break;}
            }
        }
    }
}
