package BasicImplprogram;

import java.util.*;

public class Printhackersearth {


    public List gethackersvalue()
    {
        String string = "";
        String fstring = "hackerearth";
        char[] findchars = fstring.toCharArray();
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        Map map = new LinkedHashMap();

        List outputList= new ArrayList();

        length =Integer.valueOf(scanner.nextLine());
        string = scanner.nextLine();
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        List<Character> cList = new ArrayList<Character>();
        for(char c : chars) {
            cList.add(c);
        }

        String concat = "";
        int j =0;
        int k =0;
        try {
        for (int i = 0; i <cList.size();) {
            if (findchars[j] == cList.get(k)) {
                    concat = concat + String.valueOf(cList.get(k));
                    cList.remove((Character) cList.get(k));

                    if (concat.equalsIgnoreCase("hackerearth")) {
                        outputList.add(concat);
                        concat = "";
                        j = 0;
                        k = 0;
                    } else {
                        j = j + 1;
                        k = 0;
                    }
                } else {
                    k = k + 1;
                }
                if (j > 9) {
                    j = 0;
                }
            }
        }catch (Exception e)
        {

        }
        return outputList;
    }

    public static void main(String[] args) {
        Printhackersearth printhackersearth =new Printhackersearth();
         List map =  printhackersearth.gethackersvalue();
        /*List list = new LinkedList();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext())
         {
             Map.Entry entry = (Map.Entry) iterator.next();
             if(entry.getKey().toString().equals("h"))
             {
                 list.add(entry.getValue());
             }
             else if(entry.getKey().toString().equals("a"))
             {
                 list.add(entry.getValue());
             }
             else if(entry.getKey().toString().equals("c"))
             {
                 list.add(entry.getValue());
             }
             else if(entry.getKey().toString().equals("k"))
             {
                 list.add(entry.getValue());
             }
             else if(entry.getKey().toString().equals("e"))
             {
                 list.add(entry.getValue());
             }
             else if(entry.getKey().toString().equals("r"))
             {
                 list.add(entry.getValue());
             }
             else if(entry.getKey().toString().equals("t"))
             {
                 list.add(entry.getValue());
             }
         }*/

        System.out.println(map.size());

       // System.out.println(list.get(0));

    }

}
