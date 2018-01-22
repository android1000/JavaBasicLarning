package TextAnalyzer;

@SuppressWarnings("CanBeFinal")
public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    public TooLongTextAnalyzer(int var1){
        this.maxLength=var1;
    }

    public Label processText(String text) {
        return text.length()<=getMaxLength() ? Label.OK : Label.TOO_LONG;
    }

    public int getMaxLength(){
        return this.maxLength;
    }
}
