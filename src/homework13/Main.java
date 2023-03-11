package homework13;

public class Main {
    public static void main(String[] args) {
        //раздел 2, задание 1
        int first;
        int second;
        int third;
        first = 5;
        second = first * 5;
        third = second - first;
        String result = "first, second, third";

        System.out.println(result);
        System.out.println(first+second);
        System.out.println(third%first);

        //раздел 2, задание 2
        String string1 = "Казнить";
        String string2 = "нельзя";
        String string3 = "помиловать";
        String string4 = ",";
        String string5 = ".";
        System.out.println(string1 + string4 +" "+ string2 +" "+ string3 + string5);
        System.out.println(string1 +" "+ string2 + string4 + " " + string3 + string5);

        //раздел 2, задание 3
        String frase = "Anyone who has never made" + "\n" + "a mistake has never tried" + "\n" + "anything new. Albert Einstein.";
        System.out.println(frase);


    }
}
