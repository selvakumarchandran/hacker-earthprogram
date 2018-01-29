

import java.io.*;
import java.util.Scanner;

public class ToggleString {



    public static String ChangeToggleString()
    {
        Scanner scanner = new Scanner(System.in);
        String exStr = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        char n[]  = exStr.toCharArray();
        for (int i = 0; i <n.length ; i++) {
            if(Character.isUpperCase(n[i])==true)
                stringBuilder.append(String.valueOf(n[i]).toLowerCase());
            else if(Character.isLowerCase(n[i])==true)
                stringBuilder.append(String.valueOf(n[i]).toUpperCase());
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

      String toggleString =  ChangeToggleString();

        System.out.println("toggle String"+toggleString);
    }


}
