import java.util.Scanner;

/*
 * Author: Hojjat Shabab
 *
 * Created on April 14, 2021, 3:00 PM
 */
public class PlaindromNumber {
    public static void main(String[] args) {
        System.out.println("welcome to the plaindrom program");
        System.out.println("please enter number...");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        if (plain(num))
            System.out.println(num + " is a plaindromNumber");
        else
            System.out.println(num + " is not a plaindromNumber");
    }

    private static boolean plain(int num) {
        int a = num, b = 0, c, counter = 0;
        while (num > 0) {
            c = num % 10;
            b = b * 10 + c;
            num = num / 10;
            counter++;
        }

        if (b == a)
            return true;
        else {
            counter = (int) Math.pow(10, counter);
            counter = counter * a + b;
            System.out.println("plaindrom Number(" + a + ") is  " + counter);
            return false;
        }
    }
}
