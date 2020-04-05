import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String myString = scn.next();
        System.out.println(myString.toUpperCase().startsWith("J"));
    }
}
