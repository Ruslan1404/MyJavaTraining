package homework17;

import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) {

        //Задание 5//
        /*Scanner in = new Scanner(System.in);
        System.out.println("Insert number of *");
        int count = in.nextInt();
        for(int i = count; i>0; i--){
            for(int a =0; a<i; a++){
                if(a==0||a==i-1||i==count) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }*/


    //Задание 3//
    public static void main(String[] args) {
        int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 45) - 50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }
}



