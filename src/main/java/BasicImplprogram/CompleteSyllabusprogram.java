package BasicImplprogram;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CompleteSyllabusprogram {


    public List getComplete()
    {

        Scanner scanner = new Scanner(System.in);
        List list = new LinkedList();
        int tot_sub = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <tot_sub; i++) {

            int totdays = Integer.valueOf(scanner.nextLine());
            String s = scanner.nextLine();
            String[] chars = s.split(" ");
            int countdays = 0;
            int countdays1 = 0;

            if(totdays <chars.length)
            {
                totdays = chars.length;

            }
            int k = 0;
            for (int j = 0; j <totdays ; j++) {

                if(Integer.valueOf(chars[k])!=0)
                {
                    countdays = countdays+Integer.valueOf(chars[k]);
                    countdays1 = k+1;
                    if(countdays>=totdays)
                    {
                        break;
                    }
                }

                if(k==6)
                {
                    k=0;
                }
                else {
                    k=k+1;
                }

            }

            list.add(countdays1);
        }

        return list;
    }
    public static void main(String[] args) {


        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"MONDAY");
        hashMap.put(2,"TUESDAY");
        hashMap.put(3,"WEDNESDAY");
        hashMap.put(4,"THURSDAY");
        hashMap.put(5,"FRIDAY");
        hashMap.put(6,"SATURDAY");
        hashMap.put(7,"SUNDAY");
        CompleteSyllabusprogram completeSyllabusprogram = new CompleteSyllabusprogram();
         List list = completeSyllabusprogram.getComplete();

        for (int i = 0; i <list.size() ; i++) {

            System.out.println(hashMap.get(list.get(i)));


        }



    }
}
