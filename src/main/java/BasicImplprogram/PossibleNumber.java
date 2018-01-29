package BasicImplprogram;

import sun.nio.cs.ext.IBM037;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PossibleNumber {

        public List getValue()
        {

            List list = new LinkedList();

            Scanner scanner = new Scanner(System.in);

            Integer value = Integer.valueOf(scanner.nextLine());

            for (int i = 0; i<value; i++) {

                BigInteger findNo = BigInteger.valueOf(Long.parseLong(scanner.nextLine()));

                if(!findNo.mod(new BigInteger("2")).equals(BigInteger.ZERO))
                {
                    list.add("NO");
                }
                else
                {
                    list.add("YES");
                }

            }
            return list;
        }
    public static void main(String[] args) {

        PossibleNumber possibleNumber = new PossibleNumber();
        List list =  possibleNumber.getValue();

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
