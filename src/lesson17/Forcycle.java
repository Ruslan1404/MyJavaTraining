package lesson17;

import java.util.Scanner;

public class Forcycle {
    public static void main(String[] args) {
        //Цикл for также называют циклом со счётчиком.
        // В случае, когда вам известно какое количество
        // раз необходимо выполнить одно и тоже действие
        // необходимо использовать цикл for.
        /*for (int a = 1; a <= 5; a++) {
            System.out.println("Итерация под номером " + a);
        }*/

        //вывести на консоль отдельными строками все слова из текста,
        //который введет пользователь
        /*Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.split("\\s");
        for (int i = 0; i<words.length; i++){
            System.out.println(words[i].toLowerCase()
                    .replace(",","")
                    .replace(".",""));
        }*/



        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите");
        String message = in.nextLine();
        for (int i = 0; i < message.split(" ").length; i++) {
            System.out.println(message.split(" ")[i]
                    .replace(",", "")
                    .replace(".", "")
                    .toLowerCase());
        }*/


        //Ввести с клавиатуры несколько предложений.
        //Вывести на экран среднее количество слов в данных предложениях.
        //Вывести в консоль среднюю длину слова в каждом предложении.


        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        double countOfSent = text.split("\\.").length;
        double countOfWords = text.replace(".","")
                .replace(",","").split("\\s")
                .length;

        System.out.println("Среднне кол-во слов в предложениях "+countOfWords/countOfSent);

        for(int i = 0;i<text.split("\\.").length;i++){
            double coutofwords = text.split("\\.")[i].split("\\s").length;
            double countOfChar = text.split("\\.")[i].replace(" ","")
                    .replace(",","").length();
            System.out.println("Средняя длина слова в предложении "+(i+1)+" "+ countOfChar/coutofwords);

        }
    }

}




