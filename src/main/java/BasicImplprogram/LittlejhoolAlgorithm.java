package BasicImplprogram;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LittlejhoolAlgorithm {


    public List<Integer> getdisplaymessage()
    {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char[] chars= inputString.toCharArray();
        List<Integer> stringList= new LinkedList<Integer>();
        BigInteger bigInteger = BigInteger.ZERO;

        int k = 0;

        for (int i = 0; i <chars.length ; i++) {

            if(String.valueOf(chars[i]).equalsIgnoreCase("0"))
            {
                k = k+1;

                try {
                    if (String.valueOf(chars[i + 1]).equalsIgnoreCase("1")) {
                        stringList.add(k);
                        k = 0;
                    }
                }catch (Exception e)
                {
                    stringList.add(k);
                }

            }
            else if(String.valueOf(chars[i]).equalsIgnoreCase("1"))
            {
                k = k+1;
                try {
                    if (String.valueOf(chars[i + 1]).equalsIgnoreCase("0")) {
                        stringList.add(k);
                        k = 0;
                    }
                }
                catch (Exception e)
                    {
                        stringList.add(k);
                    }

            }


        }


        return stringList;

    }



    public static void main(String[] args) {

        LittlejhoolAlgorithm littlejhoolAlgorithm = new LittlejhoolAlgorithm();
        List<Integer>  strings =  littlejhoolAlgorithm.getdisplaymessage();

        Collections.sort(strings);

        if(strings.get(strings.size()-1)>=6){

            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i) >= 6) {
                    System.out.println("Sorry, sorry!");

                }
            }
        }
        else
        {
            System.out.println("Good luck!");
        }
    }
}
