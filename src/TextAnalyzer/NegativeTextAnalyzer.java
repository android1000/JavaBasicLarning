package TextAnalyzer;

import java.util.Arrays;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] Smiles ={":(", "=(", ":|"};

    public NegativeTextAnalyzer(){}

    @Override
    public String[] getKeywords(){
        String[] str=new String[Smiles.length];
        str= Arrays.copyOf(Smiles, Smiles.length);
        return str;
    };

    @Override
    public Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}
