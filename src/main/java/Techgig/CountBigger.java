package Techgig;

import java.util.Arrays;
import java.util.Scanner;

public class CountBigger {


    public String getBiggervalues()
    {

        Scanner scanner = new Scanner(System.in);

        String Firstvalue = scanner.nextLine();
        String overallArray[] = scanner.nextLine().split(" ");
        String returnequalvalue = scanner.nextLine();

        int[] convertArray = Arrays.stream(overallArray).mapToInt(Integer::parseInt).toArray();

        int counter = 0;

        for (int i = 0; i <convertArray.length ; i++) {
            if(Integer.valueOf(returnequalvalue)<convertArray[i])
            {
                counter++;
            }
        }

        return ""+counter;
    }


    public static void main(String[] args) {

        CountBigger countBigger = new CountBigger();
        String returnvalue = countBigger.getBiggervalues();
        System.out.println(returnvalue);

    }
}
