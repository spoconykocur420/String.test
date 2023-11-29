
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String str = scanner.nextLine();

        if (str.length() <= 4) {
            System.out.println("Nieprawidłowe słowo");
        } else {
            int length = str.length() / 2;
            String str1 = str.substring(length, length+2);
            String str2 = str.substring(0,length);
            String str3 = str.substring(length+2, str.length());

            System.out.println(str1+str2+str3);
        }

    }
}