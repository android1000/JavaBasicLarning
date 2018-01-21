package TextAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    public TooLongTextAnalyzer(int var1){
        this.maxLength=var1;
    }

    public Label processText(String text) {
        return text.length()<=this.maxLength ? Label.OK : Label.TOO_LONG;
    }

    public int getMaxLength(){
        return this.maxLength;
    }
}
