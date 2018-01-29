import java.util.Scanner;

public class Polindrome {
    public String Checkpalindrome()
    {
        String Msg = "NO";
        Scanner scanner = new Scanner(System.in);
        String normalString = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(normalString);
        String reverseString = stringBuffer.reverse().toString();
        if(normalString.equalsIgnoreCase(reverseString))
                Msg = "YES";
        return Msg;
    }

    public static void main(String[] args) {
        Polindrome polindrome = new Polindrome();
        String Msg = polindrome.Checkpalindrome();
        System.out.println(Msg);
    }
}
