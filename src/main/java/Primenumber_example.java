import java.util.*;

public class Primenumber_example {



    public List getprimeNo()
    {
        int num = 0;

        List list = new LinkedList();

        try
        {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            int j =0;

            for (int i = 2; i <=num ; i++) {

                for (int k = 2; k <=i ; k++) {

                    if(k==i)
                    {
                        list.add(i);
                    }
                    if(i%k==0)
                    {
                        break;
                    }
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        return list;
    }
    public static void main(String[] args) {

        Primenumber_example primenumber_example = new Primenumber_example();
        List printall = primenumber_example.getprimeNo();

        for (int i = 0; i <printall.size() ; i++) {

            System.out.print(printall.get(i)+",");

        }


    }
}
