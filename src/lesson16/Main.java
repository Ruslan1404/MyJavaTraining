package lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("Введите строку");
        String string = in.nextLine();
        int count = string.split(" ").length;
        if(count>12&&count<20&&count%3!=0) {
            System.out.println("блок 1");
        }else if (count>3&&count<9&&count%2==0) {
            System.out.println("блок2");
        }else if (count==3){
            System.out.println("блок3");
        }else{
            System.out.println("ничего");*/

        System.out.println("введите возраст");
        int age = in.nextInt();
        String message = age<18?"Вы несовершеннолетний гражданин":"Вы совершеннолетний гражданин";
        System.out.println(message);


    }
}
