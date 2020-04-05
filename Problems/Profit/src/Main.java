import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        double originalMoney = scn.nextDouble();
        double  yearlyP = scn.nextDouble();
        double desireK = scn.nextDouble();
        int years = 0;
        while (originalMoney < desireK) {
            originalMoney += originalMoney * yearlyP / 100;
            years++;
        }
       System.out.println(years);
    }
}
