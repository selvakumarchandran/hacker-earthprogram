import java.math.BigInteger;
import java.util.Scanner;

public class Findproduct {

     public String getProductvalue()
        {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Integer returnvalue = Integer.valueOf(1);

            String str = "";

            for (int i = 1; i <=n ; i++) {
                returnvalue = returnvalue*i;

                System.out.println(i);
            }

            str = String.valueOf(returnvalue);
            return  str;
        }

    public static void main(String[] args) {
        Findproduct findproduct = new Findproduct();
        String returnvalue = findproduct.getProductvalue();
        System.out.println(returnvalue);
    }

}
