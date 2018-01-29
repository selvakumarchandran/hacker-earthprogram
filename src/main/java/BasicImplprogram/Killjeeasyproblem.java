package BasicImplprogram;

import java.util.*;

public class Killjeeasyproblem {


    public  List geteasyvalue()
    {

        Scanner scanner = new Scanner(System.in);


        Set set = new HashSet();
        String s = scanner.nextLine();
        String[] chars = s.split(" ");
        String s1 = "";
        String[] chars1 ={};


        for (int i = 0; i <Integer.valueOf(chars[0]); i++) {

            s1 = scanner.nextLine();
            chars1 =s1.split(" ");
            set.add(chars1[0]);
            set.add(chars1[1]);

        }

        System.out.println(set);

        List list = new LinkedList();
        list.addAll(set);

        Collections.sort(list);


        return list;
    }


    public static void main(String[] args) {

        Killjeeasyproblem killjeeasyproblem = new Killjeeasyproblem();
          List list = killjeeasyproblem.geteasyvalue();

        System.out.println(list.get(list.size()-1));

        for (int i = 0; i <list.size() ; i++) {

            System.out.print(list.get(i)+" ");

        }
    }
}
