package BasicImplprogram;

import java.math.BigInteger;
import java.util.*;

public class GreatKianProgram {

    public List getGreatvalues()
    {
        int totValue= 0;
        String lenString= "";
        List list = new LinkedList();

        Scanner scanner = new Scanner(System.in);

        totValue = Integer.valueOf(scanner.nextLine());
        lenString  =scanner.nextLine();
        String[] strings = lenString.split(" ");

        System.out.println(Arrays.toString(strings));

        System.out.println(strings.length);

        for (int i = 0; i <3; i++) {

            BigInteger t = BigInteger.valueOf(0);

            if(strings.length > i) {
               for (int j = i; j < strings.length; j = j + 3) {
                   BigInteger k =BigInteger.valueOf(0);;
                   BigInteger r =BigInteger.valueOf(0);;
                   try {
                       k = BigInteger.valueOf(Long.parseLong(strings[j]));
                       r = BigInteger.valueOf(Long.parseLong(strings[j = j + 3]));
                   } catch (ArrayIndexOutOfBoundsException e) {
                       e.getMessage();
                   }
                   t = t.add(r).add(k);
               }

                list.add(t);

           }
           else {
               list.add(0);
           }

        }
        return list;
    }


    public static void main(String[] args) {

        GreatKianProgram greatKianProgram = new GreatKianProgram();
        List list =  greatKianProgram.getGreatvalues();
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
    }
}
