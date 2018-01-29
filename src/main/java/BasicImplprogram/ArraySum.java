package BasicImplprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class ArraySum {


    public  String getArraysumvalue()
    {

        Integer integer = 0;
        Scanner scanner = new Scanner(System.in);
        integer =Integer.valueOf(scanner.nextLine());
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        BigInteger returnvalue = BigInteger.ZERO;
        for (int i = 0; i <strings.length; i++) {
            returnvalue = returnvalue.add(BigInteger.valueOf(Long.parseLong(strings[i])));
        }
        return String.valueOf(returnvalue);
    }


    public static void main(String[] args) {

        ArraySum arraySum = new ArraySum();
        String val = arraySum.getArraysumvalue();

        System.out.println(val);


    }
}
