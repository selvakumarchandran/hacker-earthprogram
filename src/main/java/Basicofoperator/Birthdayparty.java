package Basicofoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthdayparty {


    public List<String> getStringvalue()
    {

        List<String> allvalues = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String totvalue = scanner.nextLine();
        String findvalues = "";


        for (int i = 0; i <Integer.valueOf(totvalue) ; i++) {

            findvalues = scanner.nextLine();

            String[] strings = findvalues.split(" ");


                if(Integer.valueOf(strings[1])%Integer.valueOf(strings[0])==0)
                {
                    allvalues.add("Yes");
                }
                else
                {
                    allvalues.add("No");
                }

        }
        
        return allvalues;
    }

    public static void main(String[] args) {

        Birthdayparty birthdayparty = new Birthdayparty();
        List<String>  stringList =  birthdayparty.getStringvalue();
        for (int i = 0; i <stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}
