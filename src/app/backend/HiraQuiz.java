import java.util.Collections;
import java.util.Arrays;
import java.util.List;

// class to create a ranozmied hiragana quiz
public class HiraQuiz {

    private HiraganaDictionary quizDic;
    private String randomizedQuiz = "";

    public HiraQuiz() {
        quizDic = new HiraganaDictionary();
        HiraganaChar[] dictArray = quizDic.getDictionary();
        List<HiraganaChar> dictList = Arrays.asList(dictArray);
        Collections.shuffle(dictList);
        dictList.toArray(dictArray);
        for (HiraganaChar item : dictArray) {
            randomizedQuiz += item.getJPChar() + ", " + item.getEngPronounce() + "\n";
        }
    }
    // static method to get a string of a randomized hiragana quiz
    public static String newQuiz() {
        HiraQuiz newRandomizedQuiz = new HiraQuiz();
        String quizString = newRandomizedQuiz.getRandomizedQuiz();
        return quizString;
    }
    public String getRandomizedQuiz() {
        return randomizedQuiz;
    }
}
