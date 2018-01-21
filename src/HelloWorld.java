import ExceptionPackage.SqrtIllegalArgumentException;
import TextAnalyzer.*;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //do_3_5_9();
        do_4_1_9();
    }

    public static void do_3_5_9() {
        String[] kw = {"fuck", "bitch", "сучка", "dota2"};
        String[] inputText = {"sdfsdfuck", "sdfsd", "sdfsdfuc=(", "sdbitchfsd", "сучкаsdfsd", ":|сучкsdfsd", "сучк:(sdfsd", "dota", "dota2", "0123456789", "011111111111:(dota2"};
        SpamAnalyzer sa = new SpamAnalyzer(kw);
        NegativeTextAnalyzer nta = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tta = new TooLongTextAnalyzer(10);
        TextAnalyzer[] analyzers={sa,nta,tta};
        TextAnalyzer[] analyzers1={nta,tta,sa};
        TextAnalyzer[] analyzers2={tta,sa,nta};
        for (int i=0;i<inputText.length;i++) {
            System.out.println(inputText[i]);
            System.out.println(checkLabels(analyzers,inputText[i]));
            System.out.println(checkLabels(analyzers1,inputText[i]));
            System.out.println(checkLabels(analyzers2,inputText[i]));
            System.out.println("==================================");
        }
    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer anal: analyzers){
            if (anal.processText(text)!=Label.OK)  return anal.processText(text);
        }
        return Label.OK;
    }

    public static void do_4_1_9() {
        System.out.println(SqrtIllegalArgumentException.sqrt(-1));
    }

}


