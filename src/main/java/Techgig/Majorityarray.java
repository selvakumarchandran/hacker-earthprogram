package Techgig;

import java.util.*;

public class Majorityarray {


    public String getmajorityvalues()
    {

        Scanner scanner = new Scanner(System.in);
        String totvalue  = scanner.nextLine();
        String[] returnva = scanner.nextLine().split(" ");
        int[] findvalue = Arrays.stream(returnva).mapToInt(Integer::parseInt).toArray();

        int noofoplaces = 0;
        int max = 1;

        for (int i = 0; i <findvalue.length ; i++) {

            int counter = 0;

            for (int j = 0; j <findvalue.length ; j++) {

                if(findvalue[i]==findvalue[j])
                {
                    counter++;
                }

                if(max < counter)
                {
                    noofoplaces = i;
                }

            }
        }
        String returnvalue = String.valueOf(findvalue[noofoplaces]);

        return returnvalue;
    }
    public static void main(String[] args) {

        Majorityarray majorityarray = new Majorityarray();
        String majorvalue = majorityarray.getmajorityvalues();
        System.out.println(majorvalue);
    }
}
