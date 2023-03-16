package homework15;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Задание 1//
        /*System.out.println("Введите строку из задания");

        String string1 = input.next();
        System.out.println(string1);
        String string2 = input.next();
        System.out.println(string2);
        String string3 = input.next();
        System.out.println(string3);
        String string4 = input.next()+" "+input.next()+" "+input.next();
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);*/


        //Задание 2//
        /*System.out.println("Введите сторону a");
        int a = input.nextInt();
        System.out.println(a);
        System.out.println("Введите сторону b");
        int b = input.nextInt();
        System.out.println(b);
        System.out.println("Введите сторону c");
        int c = input.nextInt();
        System.out.println(c);
        boolean isTriangle = (a+b)>c||(a+c)>b||(b+c)>a;
        System.out.println("Из введённых значений сторон \n +" +
                "можно построить треугольник" +
                "и это - \"" + isTriangle+"\""+".");*/

        //Задание 3//
        /*System.out.println("Введите свой год рождения");
        //int year = input.nextInt();
        //System.out.println(year);
        //String year = input.nextLine();
        int age = 2023-Integer.parseInt(input.nextLine());
        System.out.println(age);*/


        //Задание 5//
        /*System.out.println("Введите спецификатор формата для нынешнего времени."+
                "В качестве разделителя использовать пробел");
        String specFormat = input.next();
        Date date = new Date();
        String date2 = String.format(specFormat, date);
        System.out.println(date2);*/


        //Задание 6//
        System.out.println("Уважаемый X, Вы выполняете задание номер Y," +
                " и делаете это в Z часов W минут в V.");
        System.out.println("Введите своё имя и через пробел номер задания");
        String name = input.next();
        int taskNumber = input.nextInt();
        System.out.println("Введите спицификаторы формата вместо X, Y, Z, W, V.\n" +
                "где X - это имя пользователя,\n" +
                "Y - порядковый номер ДЗ,\n" +
                "Z - время в часах в момент выполнения программы,\n" +
                "W - время в минутах в момент выполнения программы,\n" +
                "V - день недели. Все спецификаторы форматов вводить через пробел.");
        Scanner input1 = new Scanner(System.in);
        String string = input1.nextLine();
        System.out.println(string);
        String string1 = "Уважаемый X, Вы выполняете задание номер Y," +
                " и делаете это в Z часов W минут в V.";
        String string2 = string.replace("X", string.split(" ")[0]).
                replace("Y", string.split(" ")[1]).
                replace("Z", string.split(" ")[2]).
                replace("W", string.split(" ")[3]).
                replace("V", string.split(" ")[4]);
        System.out.println(string2);
        Date date = new Date();
        System.out.println(date);
        String string3 = String.format(string2, name, taskNumber, date, date, date);
        System.out.println(string3);








    }
}
