package lab5;

//       9. Задано текст та масив слів. Підрахувати у скількох реченнях зустрічається кожне слово масиву.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String textString = "Привіт!!! Як справи, друже?";
        String[] wordsArray = {"як", "ви"};
        Text text = new Text(textString);
        System.out.println(Arrays.toString(text.getArrayOfQuantitySentencesWithWords(wordsArray)));
    }
}
