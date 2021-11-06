package lab5;

public class Text {
    private Sentence[] sentences;

    public Text(String textString) {
        final String[] sentencesStrings = textString.split("(?<=[.?!]) ");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    /**
     * Підрахувати у скількох реченнях зустрічається кожне слово масиву.
     * @param wordsArray
     * @return
     */
    public int[] getArrayOfQuantitySentencesWithWords(String[] wordsArray) {
        int[] arrayOfQuantitySentencesWithWords = new int[wordsArray.length];
        boolean[] arrayOfWordsExistence;
        for (Sentence sentence : sentences) {
            arrayOfWordsExistence = sentence.getArrayOfWordsExistence(wordsArray);
            for (int i = 0; i < arrayOfWordsExistence.length; i++) {
                if (arrayOfWordsExistence[i]) {
                    arrayOfQuantitySentencesWithWords[i]++;
                }
            }
        }
        return arrayOfQuantitySentencesWithWords;
    }
}
