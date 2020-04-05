//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String firstName =  scn.next();
        int age = scn.nextInt();
        String edu = scn.next();
        int exp = scn.nextInt();
        String cuis = scn.next();
        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef that cooks " + cuis + " dishes.");

    }
}