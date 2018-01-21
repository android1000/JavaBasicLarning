package TextAnalyzer;

import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer (String[] str){
        keywords = Arrays.copyOf(str, str.length);
    }

    @Override
    public String[] getKeywords(){
        String[] str=new String[keywords.length];
        str=Arrays.copyOf(keywords, keywords.length);
        return str;
    };

    @Override
    public Label getLabel(){
        return Label.SPAM;
    }
}
