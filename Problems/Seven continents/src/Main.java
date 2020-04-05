//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // put your code here
        String[] continents = new String[7];
        Scanner scn = new Scanner(System.in);

        while (scn.hasNext()) {
            String continentsString = scn.nextLine();
            String[] stringIntoArray = continentsString.split(" ");
            for (int i = 0; i < stringIntoArray.length; i++) {
                if (stringIntoArray[i].equals("Asia")) {
                    continents[0] = stringIntoArray[i];
                } else if (stringIntoArray[i].equals("Africa")) {
                    continents[1] = stringIntoArray[i];
                } else if (stringIntoArray[i].equals("North")) {
                    continents[2] = stringIntoArray[i] + " " + stringIntoArray[i + 1];
                } else if (stringIntoArray[i].equals("South")) {
                    continents[3] = stringIntoArray[i] + " " + stringIntoArray[i + 1];
                } else if (stringIntoArray[i].equals("Antarctica")) {
                    continents[4] = stringIntoArray[i];
                } else if (stringIntoArray[i].equals("Europe")) {
                    continents[5] = stringIntoArray[i];
                } else if (stringIntoArray[i].equals("Australia")) {
                    continents[6] = stringIntoArray[i];
                }
            }
        }
        for (String continent: continents) {
            System.out.println(continent);
        }
    }
}


