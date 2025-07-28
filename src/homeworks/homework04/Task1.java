package homeworks.homework04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (str.indexOf(input) == 0) {
            System.out.println(str.charAt(str.length() - 1));
        } else {
            System.out.println(str.charAt(str.indexOf(input) - 1));
        }
    }
}
