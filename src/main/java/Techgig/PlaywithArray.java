package Techgig;

import org.w3c.dom.css.CSSStyleRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlaywithArray {


        public String SortwithArray()
        {
            Scanner scanner = new Scanner(System.in);
            String initialvalue = scanner.nextLine();
            String[] parray = scanner.nextLine().split(" ");
            String[] findarray = new String[parray.length];
            int[] array = Arrays.stream(parray).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array);
            int j=0;
            int k =0;
            for (int i = array.length-1; i >=0; i--) {
                if((i==array.length-1) || (i==array.length-2))
                {
                    findarray[j] = String.valueOf(array[i]);
                }
                else
                {
                    if(Arrays.asList(findarray).contains(parray[k]))
                    {
                        findarray[j] = String.valueOf(parray[k+1]);
                         k=k+1;
                    }
                    else
                    {
                        findarray[j] = String.valueOf(parray[k]);
                    }

                    k=k+1;
                }

                j++;
            }
            return Arrays.toString(findarray);
        }

    public static void main(String[] args) {
        PlaywithArray playwithArray = new PlaywithArray();
        String finalValue = playwithArray.SortwithArray().replace("[","").replace("]","").replace(",","");
        System.out.println(finalValue);
    }



}
