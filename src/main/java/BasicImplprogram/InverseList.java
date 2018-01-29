package BasicImplprogram;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InverseList {


    public List<String> getListvalue()
    {


        List<String> mylist = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);

        String totlength = scanner.nextLine();

        for (int i = 0; i <Integer.valueOf(totlength); i++) {

            String first = scanner.nextLine();
            String first_findvalue = scanner.nextLine();

            String[] fvalue = first_findvalue.split(" ");
            String[] equalvalue = new String[Integer.valueOf(first)];

            int k = 1 ;
            for (int j = 0; j <Integer.valueOf(first); j++) {
                equalvalue[j] =""+k;
                k=k+1;
            }

            if(Arrays.equals(fvalue, equalvalue))
            {
                mylist.add("inverse");
            }else
            {
                mylist.add("not inverse");
            }

        }

        return mylist;
    }


    public static void main(String[] args) {

        InverseList inverseList = new InverseList();
        List<String> stringList =    inverseList.getListvalue();

        for (int i = 0; i < stringList.size(); i++) {

            System.out.println(stringList.get(i));

        }


    }
}
