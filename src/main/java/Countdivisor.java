import java.util.Scanner;

public class Countdivisor {


    public  String getCountdivisor()
    {

        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int k = scanner.nextInt();
        int r =scanner.nextInt();

        int j = 0;

        for (int i = l; i <=k ; i++) {
            if(i%r==0)
                j+=1;
        }
        return String.valueOf(j);
    }
    public static void main(String[] args) {

        Countdivisor countdivisor = new Countdivisor();

        String value = countdivisor.getCountdivisor();

        System.out.println(value);

    }
}
