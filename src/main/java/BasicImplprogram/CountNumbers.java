package BasicImplprogram;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountNumbers {


    public List getCountNumbers()
    {
        String returnvalue = "";
        int sno =0;
        Scanner scanner = new Scanner(System.in);

        sno = Integer.valueOf(scanner.nextLine());
        int firstvalue = 0;
        String secondvalue = "";

        List list = new LinkedList();


        for (int i = 0; i <sno ; i++) {

            firstvalue = Integer.valueOf(scanner.nextLine());
            secondvalue = scanner.nextLine();
            int count = 0;
            char[] chars = secondvalue.toCharArray();

            for (int j = 0; j <chars.length ; j++) {

                if (chars[j] >= 'A' && chars[j] <= 'Z' || chars[j] >= 'a' && chars[j] <= 'z') {
                } else {
                    try {

                        if(firstvalue==j+1) {

                              count=count+1;
                        }else
                        {
                            if (chars[j + 1] >= 'A' && chars[j + 1] <= 'Z' || chars[j + 1] >= 'a' && chars[j + 1] <= 'z') {
                                count = count + 1;
                            }
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }


            }

            list.add(count);
        }

        return list;
    }



    public static void main(String[] args) {
        CountNumbers countNumbers =new CountNumbers();
        List value = countNumbers.getCountNumbers();
        for (int i = 0; i <value.size() ; i++) {
            System.out.println(value.get(i));

        }
    }
}
