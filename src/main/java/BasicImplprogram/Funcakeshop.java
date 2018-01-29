package BasicImplprogram;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Funcakeshop {


    public String getString()
    {

        Scanner scanner = new Scanner(System.in);
        String returbvalue = "";
        String totvalue = scanner.nextLine();
        int j=1 ,k=1;
        int findvalue = 1;
        List<Integer> all = new LinkedList<>();
        for (int i = 1; i <Integer.valueOf(totvalue); i++) {
            j = k*k;
            findvalue = j+i;

            all.add(findvalue);

            if(findvalue==Integer.valueOf(totvalue) || findvalue>Integer.valueOf(totvalue))
            {
                int sum = all.get(all.size()-1);

                System.out.println(sum);
                System.out.println(all);

                if(sum == Integer.valueOf(totvalue))
                {
                    returbvalue = "Chandan";
                }
                else
                {
                    if(sum<Integer.valueOf(totvalue))
                    {
                        returbvalue = "Darshak";
                    }else
                    {
                        returbvalue = "Chandan";
                    }


                }


                /*sum = sum+i;

                System.out.println("before->"+all.get(all.size()-1));
                System.out.println("before->"+all);
                System.out.println("before->"+sum);

                sum = Integer.valueOf(totvalue)-sum;

                System.out.println(sum);

                if(sum==0 || sum<0)
                {
                    returbvalue = "Darshak";
                }
                else
                {
                    returbvalue = "Chandan";
                }*/

                break;
            }

            k=k+1;
        }

        return returbvalue;
    }



    public static void main(String[] args) {
        Funcakeshop funcakeshop = new Funcakeshop();
        String ret = funcakeshop.getString();

        System.out.println(ret);

    }

    public static int sum(List<Integer> list){
        if(list==null || list.size()<1)
            return 0;
        int sum = 0;
        for(Integer i: list)
            sum = sum+i;

        return sum;
    }
}
