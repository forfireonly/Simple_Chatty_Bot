import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner  scn  = new Scanner(System.in);
        int nLead = scn.nextInt();
        int nFollow = scn.nextInt();
        boolean answer = true;
        if (nLead >= nFollow && nLead != 0 && nFollow != 0) {
            while (scn.hasNext()) {
                int n = scn.nextInt();
                if (n == 0) {
                    break;
                }
                if (n <= nFollow) {
                    nFollow = n;
                } else {
                    answer = false;
                }
                if (answer) {
                    break;
                }
            }
        }
        else if (nLead <= nFollow && nLead != 0 && nFollow != 0) {
            while (scn.hasNext()) {
                int n = scn.nextInt();
                if (n == 0) {
                    break;
                }
                if (n >= nFollow) {
                    nFollow = n;
                } else {
                    answer = false;
                }
                if (!answer){
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
