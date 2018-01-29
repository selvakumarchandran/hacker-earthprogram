package BasicImplprogram;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StarProgram {


    public List<Integer> getoutputDetails()
    {

        Scanner scanner = new Scanner(System.in);

        int sno = Integer.valueOf(scanner.nextLine());

        List<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i <sno ; i++) {
            int sbno = Integer.valueOf(scanner.nextLine());
            list.add(sbno);
        }

        return list;
    }
    public static void main(String[] args) {

        StarProgram starProgram = new StarProgram();
        List<Integer> stringList = starProgram.getoutputDetails();

        for (int i = 0; i <stringList.size() ; i++) {
            int k =stringList.get(i);
            int len = 1;
            for (int j = 0; j <k; j++) {
                if(j==0) {
                      if(len == k) {
                          System.out.print("*");
                      }
                      else
                      {
                          System.out.print("  "+"*");
                      }

                }
                else {
                    if(k==j+1)
                    {
                        System.out.print("");
                    }
                    else
                    {
                        System.out.print(" ");
                    }

                    for (int l = 0; l <len; l++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
                len = len+2;
            }
        }
    }

}
