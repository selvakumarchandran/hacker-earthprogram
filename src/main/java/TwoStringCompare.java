import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoStringCompare  {

    public List<String> comparetwoString()
    {

       List<String> list = new ArrayList<String>();

        try {
            Scanner scanner = new Scanner(System.in);
            int n =  Integer.parseInt(scanner.nextLine());
            String[] overallString = new String[n];
            for (int i = 0; i < n; i++) {
                overallString[i] = scanner.nextLine();
            }

            for (int i = 0; i < overallString.length; i++) {
                String[] splittedString = overallString[i].split(" ");

                String firstString = splittedString[0];
                String secondString = splittedString[1];

                if (firstString.length() == secondString.length()) {

                    char[] chars = firstString.toCharArray();
                    char[] chars1 = secondString.toCharArray();

                    Arrays.sort(chars);
                    Arrays.sort(chars1);

                    String s = new String(chars);
                    String s1 = new String(chars1);

                    if(s.equalsIgnoreCase(s1))
                    {
                        list.add("YES");
                    }
                    else
                    {
                        list.add("NO");
                    }

                } else {
                    list.add("NO");

                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args){

        TwoStringCompare twoStringCompare = new TwoStringCompare();
        try {

            List<String> stringBuilder = new ArrayList<String>();
            stringBuilder =  twoStringCompare.comparetwoString();

            for (int i = 0; i <stringBuilder.size() ; i++) {
                System.out.println(stringBuilder.get(i));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
