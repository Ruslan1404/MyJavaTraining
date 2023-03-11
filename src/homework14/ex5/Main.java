package homework14.ex5;

public class Main {
    public static void main(String[] args) {
        String string = "Completely random text in English. " +
                "In it, we just need to determine how many times " +
                "the character 'a' occurs there. And we can use the " +
                "split method and the length method.";
        String[] words = string.toLowerCase().split("a");
        System.out.println(words.length-1);
    }
}
