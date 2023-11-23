import javax.xml.namespace.QName;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ciąg:");

        String ciag = scanner.nextLine();
        String ciag1 ="";
        String ciag2 ="";
        if(ciag.length() >=2) {
            ciag1 = ciag.substring((ciag.length() / 2) - 1,(ciag.length() / 2) +1);
            ciag2 = ciag1.concat(ciag.substring(0,(ciag.length() / 2) -1) +ciag.substring(ciag.length() / 2) +1);

            System.out.println(ciag1);
        }else{
            System.out.println("za krótki ciąg");
        }










    }
}

