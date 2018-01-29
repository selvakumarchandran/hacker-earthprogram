package BasicImplprogram;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DiwalitestProgram {



    public List getTestProgram()
    {

        List list = new LinkedList();

        Scanner scanner = new Scanner(System.in);

        int tot_len = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <tot_len ; i++) {

            String firstvalue = scanner.nextLine();

            String[] chars = firstvalue.split(" ");
            int firstSerial = Integer.valueOf(chars[0]);
            int secondSerial = Integer.valueOf(chars[1]);
            int thirdSerial = Integer.valueOf(chars[2]);

            int finalvalue = firstSerial+secondSerial*(thirdSerial-1);

             list.add(finalvalue);

        }

        return list;
    }
    public static void main(String[] args) {


        DiwalitestProgram diwalitestProgram = new DiwalitestProgram();
        List totvalue =  diwalitestProgram.getTestProgram();

        for (int i = 0; i <totvalue.size() ; i++) {
            System.out.println(totvalue.get(i));
        }
    }
}
