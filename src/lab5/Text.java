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
//        todo add realization
        return new int[0];
    }
}
