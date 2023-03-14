package lesson15;

import javax.xml.namespace.QName;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);*/
        /*System.out.println("Введите втроку");
        String string = input.nextLine();
        System.out.println(string);*/

        /*String string = input.next();
        System.out.println(string);
        String string2 = input.next();
        System.out.println(string2);
        String string3 = input.next();
        System.out.println(string3);*/


        //Formatter форматирование в виде след метода//
        //sys.out.printf(format,arguments)//
        //%n вставка символа новой строки//
        //%% вставка символа //

        /*System.out.printf("После знака %%n%nвсе должно начинаться%nс новой строки%n");*/

        /* %b булевое значение аргумента
        В Java работает след образом
        Если в аргументе передано null - то форматтер выведет false
        Если в аргументе boolean - то форматтер выведет boolean
        Если в аргументе передан один из примитивных типов данных - то true*/
        /*System.out.printf("просто текст %b просто текст", 6);*/

        /* %s строковое представление аргумента
        Можно устанавливать маркеры подстановки типа 1$ для упорядочивания вывода необх. аргументов*/
        /*System.out.printf("В кавычках \"%2$s\" должен быть текст. Тут тоже: %1$s", "String", "String2");*/
        /*System.out.printf("\"В кавычках \"%15s\" должен быть текст.%n", "String");*/

        //Со строковым значением можно указывать длину контейнера в которoм разместить наше строковое значение
         /*System.out.printf("В кавычках \"%15s\" должен быть текст.%n", "String");
         System.out.printf("В кавычках \"%-15s\" должен быть текст.%n", "String");*/
        //Можно также ограничивать кол-во символов
         /*System.out.printf("В кавычках \"%4.4s\" должен быть текст.%n" , "String");
         System.out.printf("В кавычках \"%-4.2s\" должен быть текст.%n" , "String");
         System.out.printf("В кавычках \"%2.4s\" должен быть текст.%n" , "String");*/

        //%c символьное представление аргумента
        /*System.out.printf("В кавычка%c должен быть текст.%n" , 'х');*/

        //%d Для работы с целочисленными типами данных byte, int, short, long
        /*System.out.printf("Отобразим число: %d" , 200);*/

        //%f Для работы с вещественными типами данных float, double
        /*System.out.printf("Отобразим число с плавающей точкой: %f" , 200.0546);*/

        /*Date date = new Date();
        System.out.println(date);*/
        //При форматировании даты и времени чаще всего используют два символа T и t
        //и различные суффиксы

        //форматирование вывода времени
        //H - часы, M - минуты, S - секунды, L - миллисекунды , N - наносекунды.
        //p - добавляет информацию о pm и am

        /*System.out.printf("Сейчас время равно %tT\n", date);
        System.out.printf("Сейчас время равно %1$tH:%1$tM:%1$tS:%1$tL:%1$tN %1$tp", date);*/

        //A - день недели, d - две цифры дата в цифрах.
        //B -  название месяц, ,m - месяц в виде цифры.
        //Y - полный год, y - две финальные цифры года.
        /*System.out.printf("Выведем дату в одном формате %1$tA %1$tB %1$tY\n", date);
        System.out.printf("%1$td:%1$tm:%1$ty\n", date);
        System.out.printf("Выведем дату в третьем формате %1$tA %1$td %1$tB\n", date);*/
        /*String date2 = String.format("%1$tA %1$td %1$tB", date);
        System.out.println(date2);

        String string1 = "В кавычках %s должен быть текст.";
        String string2 = String.format(string1, "строка");
        System.out.println(string2);*/



        /*String string1 = "Моё имя %1$s. Мой возраст %2$s. Но чувствую я себя на все %3$s.";
        String string2 = String.format(string1, "Iryna", 35, 100);
        System.out.println(string2);*/

        /*String string = "Моё имя {name}. Мой возраст {age}. Но чувствую я себя на все {new age}.";
        String string2 = string.replace("{name}", "%1$s")
                .replace("{age}", "%2$d").
                replace("{new age}", "%3$d");
        System.out.println(string2);
        System.out.printf(string2, "Iryna", 35, 100);*/


        /*Scanner input = new Scanner(System.in);
        System.out.println("Введите предложение");
        String string = input.nextLine();
        String[] words = string.split(" ");
        String word2 = words[1];
        String word3 = words[2];
        String string2 = string.replace(word2, "\nконечно\n").replace(word3, "\b"+word3);
        System.out.println(string2);*/

        /*Date date = new Date();
        System.out.printf("Напечатано сегодня в %1$tA, в %1$tH:%1$tM", date);*/







    }
}
