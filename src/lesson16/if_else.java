package lesson16;

import java.util.Scanner;

 public class if_else {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = in.nextLine();
        int count = string.split(" ").length;
        if(count>12&&count<20&&count%3!=0) {
            System.out.println("блок1");
        } else if (count>3&&count<9&&count%2==0) {
            System.out.println("блок2");
        } else if(count==3) {
            System.out.println("блок3");
        } else {
            System.out.println("ничего");

        }

    }

    }

    /*   if(условие){
          (этот блок выполнится
          если условие = true);
    } else {
          (этот блок выполнится
          если условие = false);
          }*/

        /*int x = 15;
        if(x<10){
            System.out.println("Блок if");
        } else if (x>20) {
            System.out.println("Блок else if");
        } else
         {
            System.out.println("Блок else");*/



        /*Задана стоимость билета по маршруту Днепр - Киев.
        //В зависимости от возраста предоставляется скидка
        /*double cost = 500;
        Scanner in = new Scanner(System.in);
        System.out.println("Age");
        int age = in.nextInt();
        if(age<18){
            if(age==13){
                cost = cost*0.5;
                System.out.println("цена "+ cost);
            }
            cost = cost*0.75;
            System.out.println("Цена билета "+ cost);
        } else if (age>55) {
            cost = cost*0.85;
            System.out.println("Цена билета "+ cost);
        }
        else  {
            System.out.println("Цена билета "+ cost);
        }*/




