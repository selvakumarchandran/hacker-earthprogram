import java.util.Scanner;

public class CipherCrime {


    public String returnCiperencryptmsg()
    {


        Scanner scanner = new Scanner(System.in);

        String cipherWord = scanner.nextLine();
        int j =Integer.valueOf(scanner.nextLine());

        char[] chars = cipherWord.toCharArray();

        String concat = "";

        for (int i = 0; i <chars.length ; i++) {

            if(chars[i]>='a' && chars[i] <='z' ||  chars[i] >='A' && chars[i] <= 'Z')
            {
                int ascii = (int) chars[i]+4;
                if((char)ascii>='a' && (char)ascii <='z' ||  (char)ascii >='A' && (char)ascii <= 'Z') {
                    concat = concat + (String.valueOf((char) ascii));
                }
                else
                {

                    if(ascii>122)
                    {
                        int assign = ascii-122-1;

                        ascii = (int)'a'+assign;

                        concat = concat + (String.valueOf((char)ascii));
                    }
                    else
                    {

                        int assign = ascii-90-1;

                        ascii = (int)'A'+assign;

                        concat = concat + (String.valueOf((char) ascii));
                    }


                }
            }
            else
            {
                if(chars.length-2 == i) {

                    int wrapvalue = Integer.parseInt(String.valueOf(chars[i])) +j;
                    concat = concat + wrapvalue;
                }
                else {
                    if (chars[i] >= '0' && chars[i] <= '9') {
                        int divideno = Integer.parseInt(String.valueOf(chars[i])) / 3;
                        concat = concat + divideno;
                    }
                    else
                        concat = concat + chars[i];
                }
            }

        }

        return  concat;
    }



    public static void main(String[] args) {

        CipherCrime cipherCrime = new CipherCrime();

        String returnMsg =  cipherCrime.returnCiperencryptmsg();

        System.out.println(returnMsg);


    }
}
