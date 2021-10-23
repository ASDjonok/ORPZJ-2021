package lab5;

//       9. Задано текст та масив слів. Підрахувати у скількох реченнях зустрічається кожне слово масиву.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String textString = "Привіт! Як справи?";
        String[] wordsArray = {"як", "ти"};
        Text text = new Text(textString);
        System.out.println(Arrays.toString(text.getArrayOfQuantitySentencesWithWords(wordsArray)));
    }
}
