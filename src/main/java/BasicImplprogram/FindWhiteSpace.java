package BasicImplprogram;

import java.util.Scanner;

public class FindWhiteSpace {

    public String getWhiteSpace()
    {
        int nolength = 0 ;
        try
        {
            Scanner scanner = new Scanner(System.in);

            String WhiteSpace = scanner.nextLine();

            String[] whitespaces =  WhiteSpace.split(" ");

             nolength = whitespaces.length-1;

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    return String.valueOf(nolength);
    }
    public static void main(String[] args) {
        FindWhiteSpace findWhiteSpace =new FindWhiteSpace();
        String returnvalue = findWhiteSpace.getWhiteSpace();
        System.out.println(returnvalue);
    }
}
