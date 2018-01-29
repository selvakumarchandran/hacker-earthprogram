package Techgig;

import java.util.Scanner;

public class CountCouples {

    public String getStatisvalue()
    {

        Scanner scanner = new Scanner(System.in);

        String firstvalue = scanner.nextLine();
        String secondvalue= scanner.nextLine();
        String findvalue = scanner.nextLine();
        int couner = 0;
        String[] strings = secondvalue.split(" ");
        for (int i = 0; i <strings.length; i++) {
            int j = i+1;
            int findnextvalue = Integer.valueOf(strings[i]) + Integer.valueOf(strings[j]);
            i = i+1;
            if (Integer.valueOf(findvalue) == findnextvalue) {
                couner = couner+1;
            }

        }
        return  ""+couner;
    }
    public static void main(String[] args) {
        CountCouples countCouples = new CountCouples();
        String s = countCouples.getStatisvalue();
        System.out.println(s);

    }

}
