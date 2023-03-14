package homework15;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Задание 1//
        /*String string1 = "Я";
        String string2 = "тестирую";
        String string3 = "замечательно";
        String string4 = "Что ещё нужно?";*/

        String string = input.next();
        System.out.println(string);
        String string2 = input.next();
        System.out.println(string2);
        String string3 = input.next();
        System.out.println(string3);

        //Задание 2//
        /*int x = input.nextInt();
        System.out.println(x);
        int y = input.nextInt();
        System.out.println(y);
        int z = input.nextInt();
        System.out.println(z);*/

        //Задание 5//
        /*Date date = new Date();
        System.out.println(date);
        System.out.printf("%tT\n", date);
        System.out.printf("%1$tH:%1$tM:%1$tS:%1$tL:%1$tN %1$tp", date);
        System.out.printf("%1$td:%1$tm:%1$ty\n", date);*/

    }
}
