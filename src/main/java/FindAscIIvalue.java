import java.util.Scanner;

public class FindAscIIvalue {


    public  int getAsciivalue()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c[] = s.toCharArray();
        int asciivalue = (int) c[0];
        return  asciivalue;
    }



    public static void main(String[] args) {

        FindAscIIvalue findAscIIvalue = new FindAscIIvalue();
        int asciivalue = findAscIIvalue.getAsciivalue();
        System.out.println(asciivalue);
    }

}
