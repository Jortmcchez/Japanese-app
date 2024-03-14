public class HiraganaChar {

    // things a JP char has
    private String JPCharacter;
    private String engPronounce;

    // default constructor that shouldn't be used really
    public HiraganaChar() {
        JPCharacter = "";
        engPronounce = "";
    }
    // input: JP character, ENG pronunciation 
    public HiraganaChar(String character, String pronounce) {
        JPCharacter = character;
        engPronounce = pronounce;
    }
    // get method for pronounciation
    public String getEngPronounce() {
        return engPronounce;
    }
    // get method for JP character
    public String getJPChar() {
        return JPCharacter;
    }
    // set method for JP character which probably shouldn't be used
    public void setJPChar(String character) {
        JPCharacter = character;
    }
    // set method for english pronounciation
    public void setEngPronounce(String pronounce) {
        engPronounce = pronounce;
    }
}