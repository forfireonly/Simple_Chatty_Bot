import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String myString = scn.next();
        int beginning = scn.nextInt();
        int end = scn.nextInt();
        System.out.println(myString.substring(beginning, end + 1));

    }
}
