package TextAnalyzer;

import java.util.Arrays;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] Smiles ={":(", "=(", ":|"};

    public NegativeTextAnalyzer(){}

    @Override
    public String[] getKeywords(){
        return Arrays.copyOf(Smiles, Smiles.length);
    }

    @Override
    public Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}
