import java.util.Scanner;

public class Factorial {


    public int fact()
    {

        Scanner scanner = new Scanner(System.in);

        int factNum = scanner.nextInt();
        int returnValue = 0;
        if(factNum > 2) {
            returnValue =1;
            for (int i = 1; i <= factNum; i++) {
                returnValue = returnValue * i;
            }
        }
        else
        {
            returnValue = factNum;
        }
        return  returnValue;
    }


    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        int returnvalue= factorial.fact();
        System.out.println(returnvalue);
    }


}
