package Homework14;

public class Main {
    public static void main(String[] args) {
        String string ="Testing, is my favourite job";
        String[] words = string.split(" ");
        String word1 = words[0].replace(",", "");

        System.out.println(word1);
        String word2 = words[1];
        String word3 = words[2];
        String word4 = words[3];
        String word5 = words[4];
        boolean res = (word1.length()>word2.length()&&
                       word1.length()>word3.length()&&
                       word1.length()>word4.length()&&
                       word1.length()>word5.length());
        System.out.println(res);
    }

}
