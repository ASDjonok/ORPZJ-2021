package lab5;

import java.util.regex.Pattern;

public class Sentence {
    private SentencePart[] sentenceParts;

//    todo check "!!!", "???", "..."
//    todo support symbols like: "\"", " - "
    public Sentence(String sentenceString) {
//        final String[] split = sentenceString.split("((?<=,)? )|(?=[!?.,])");
//        final String[] split = sentenceString.split(" |(?=!!!)|(?=[!?.,])");
//        todo split regex onto named parts
        final String[] sentencePartsStrings = sentenceString.split(" |(?=!!!)|(?=\\?\\?\\?)|(?=\\.\\.\\.)|(?=([!?.,][^!?.]))|(?<![!?.])(?=([!?.]$))");
        sentenceParts = new SentencePart[sentencePartsStrings.length];
        for (int i = 0; i < sentenceParts.length; i++) {
            if (Pattern.matches("\\p{Punct}", sentencePartsStrings[i].substring(0, 1))) {
                sentenceParts[i] = new Punctuation(sentencePartsStrings[i]);
            } else {
                sentenceParts[i] = new Word(sentencePartsStrings[i]);
            }
        }
    }

    public boolean[] getArrayOfWordsExistence(String[] wordsArray) {
        boolean[] arrayOfWordsExistence = new boolean[wordsArray.length];
        Word word;
//        todo try to refactor (functional style or extracting methods)
        for (int i = 0; i < wordsArray.length; i++) {
            word = new Word(wordsArray[i]);
            for (SentencePart sentencePart : sentenceParts) {
                if (word.equals(sentencePart)) {
                    arrayOfWordsExistence[i] = true;
                    break;
                }
            }
        }
        return arrayOfWordsExistence;
    }
}
