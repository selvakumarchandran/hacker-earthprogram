package BasicImplprogram;

import java.util.*;

public class MinMaxExpgen {


    public  String getdisplayvalues()
    {

        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        int totSize = Integer.valueOf(scanner.nextLine());
        String findValue = scanner.nextLine();
        String[] chars =findValue.split(" ");




        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i <chars.length; i++) {

            list.add(Integer.parseInt(chars[i]));
        }
        Set<Integer> hs = new HashSet<Integer>();
        hs.addAll(list);
        list.clear();
        list.addAll(hs);
        Collections.sort(list);

        int j = 1;

        for (int i = 0; i <list.size() ; i++) {

            if(j == list.get(i))
                returnValue = "YES";
            else {
                returnValue = "NO";
                break;
            }

            j=j+1;

        }

        return returnValue;
    }

    public static void main(String[] args) {
        MinMaxExpgen minMaxExpgen = new MinMaxExpgen();
        String value = minMaxExpgen.getdisplayvalues();
        System.out.println(value);

    }


}
