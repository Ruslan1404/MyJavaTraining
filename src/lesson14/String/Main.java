package lesson14.String;

public class Main {
    public static void main(String[] args) {
        /*String string1 = "I am testing like a god";
        String string2 = "the best of the best";
        char ch = string1.charAt(6);
        boolean result = string2.contains("e");
        int index = string1.indexOf('e');
        System.out.println(ch);
        System.out.println(result);
        System.out.println(index);*/

        /*String string1 = "I am testing like a god";
        String string2 = "the best of the best";
        char ch = string1.charAt(6);
        String ch2 = String.valueOf(ch);
        boolean result = string2.contains(ch2);
        int index = string1.indexOf('e');
        System.out.println("Строка \"the best of the best\" содержит в себе символ"
                        +ch+ "и это "+ result +
                        ". \nСимвол 'e' находится в строке номер один под номером" + index + ".");*/




        //valueOf -возвращает строковое представление
//        значений примитивных типов.
        /*int w = 3;
        System.out.println(String.valueOf(w));
        System.out.println(w);
        System.out.print(w);
        System.out.print(w);*/

        // символы экранирования \n, \", \', \b
        /*int a = 12;
        int b = 32;
        int c = 33;
        System.out.println(a+", "+b+", "+c+".");*/

        /*System.out.println("Я тестирую как\n боженька");
        System.out.println("Я тестирую как\n \bбоженька");
        System.out.println("Я тестирую \"как\" боженька");*/

        //Все методы класса String не изменяют строку, а возвращают ссылку на новый объект
        //concat производит слияние строк*/

        /*String string = "I love testing very much";
        //String string2 = string.concat(" today");
        String string2 = string+ " today";
        System.out.println(string);
        System.out.println(string2);*/

        //charAt – возвращает символ из строки по указанному индексу;
        /*String string = "I love testing very much";
        char ch =string.charAt(0);
        System.out.println(ch);*/

        //length – возвращает количество символов в строке.
        /*String string = "I love testing very much";
        int lenth = string.length();
        System.out.println(lenth);*/

        //isEmpty – есди строка пустая возвращает истину,
        //если нет - ложь.
        /*String string = "I love testing very much";
        boolean result = string.isEmpty();
        System.out.println(result);*/

        //contains – возвращает истину, если в строке
        //хотя бы раз встречается указанная строка.
        /*String string = "I love testing very much";
        boolean result = string.contains("love");
        System.out.println(result);*/

        //startsWith – возвращает истину, если указанный символ или строка
        // совпадают с началом строки.
        //endsWith – аналогично со startsWith только наоборот .
        /*String string = "I love testing very much";
        boolean result = string.startsWith("I love");
        boolean result2 = string.endsWith("much");
        System.out.println(result2);*/

        //toLowerCase – возвращае строку в нижнем регистре.
        //toUpperCase – возвращает строку, в верхнем регистре.//
        /*String string = "I lOve testiMg very much";
        System.out.println(string.toLowerCase());
        System.out.println(string);*/


        //indexOf – ищет указанный символ начиная с начала строки.
        //Возвращает индекс первого найденого по порядку совпадающего символа.
        //если совпадений нет, возвращает -1
        //lastIndexOf ищет с конца
        /*String string = "I love testing very much";
        int index = string.lastIndexOf("r");
        System.out.println(index);*/

        //substring – вырезает указанный промежуток символов
        //возвращает новую строку
        /*String string = "I love testing very much";
        //String string2 = string.substring(6);//
        String string2 = string.substring(7, 20);
        System.out.println(string2);*/

        //replace – возвращает строку, заменяя указанные символы или строки.
        /*String string = "I love testing very much";
        String string2 = string.replace("love", "don't love");
        System.out.println(string2);*/


        //trim убирает начальные и конечные пробелы
        /*String string = " I love testing very much";
        System.out.println(string);
        System.out.println(string.trim());*/

        //split разбивает на массив строк
        /*String string = "I love testing";
        String i = string.split(" ")[0];
        String love = string.split(" ")[1];
        String testing = string.split(" ")[2];
        System.out.println(i);
        System.out.println(love);
        System.out.println(testing);*/
    }
}

