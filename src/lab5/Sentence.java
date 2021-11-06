package lab5;

public class Sentence {
    private SentencePart[] sentenceParts;

//    todo support symbols like: "!!!", "\"", " - "
    public Sentence(String sentenceString) {
//        final String[] split = sentenceString.split("((?<=,)? )|(?=[!?.,])");
//        final String[] split = sentenceString.split(" |(?=!!!)|(?=[!?.,])");
        final String[] split = sentenceString.split(" |(?=!!!)|(?=\\?\\?\\?)|(?=\\.\\.\\.)|(?=([!?.,][^!?.]))");
    }
}
