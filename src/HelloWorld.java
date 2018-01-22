import ExceptionPackage.*;
import TextAnalyzer.*;
import Ascii.*;
import java.util.function.DoubleUnaryOperator;


public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        do_3_5_7();
        do_3_5_8();
        do_3_5_9();
        do_4_1_9();
        do_4_1_10();
        System.out.println(getCallerClassAndMethodName());
        AnotherMethod();
        AnotherMethod2();
        AnotherMethod3();
    }

    public static void do_3_5_7(){
        System.out.println(integrate(x -> 1,0,10));
    }

    @SuppressWarnings("SameParameterValue")
    private static double integrate(DoubleUnaryOperator f, double a, double b) {
        int n = 1000000;
        double result = 0;
        double h;
        h = (b - a) / n;
        for (int i = 0; i < n; i++) {
            result = result + f.applyAsDouble(a + h * (i + 0.5));
        }
        return result * h;
    }

    @SuppressWarnings("WeakerAccess")
    public static void do_3_5_8(){
        byte[] b = {'C','a','t',' ','i','s',' ','g','o','n','e','!'};//4,5,6,127};
        byte[] b1 = new byte[127];
        byte[] b2 = new byte[0];
        for (int i=0; i<127;i++) b1[i]=(byte)i;
        AsciiCharSequence sq = new AsciiCharSequence(b);
        AsciiCharSequence sq1 = new AsciiCharSequence(b1);
        AsciiCharSequence sq2 = new AsciiCharSequence(b2);
        System.out.println("length: " + sq.length());
        System.out.println("charAt: " + sq.charAt(2));
        System.out.println("subSequence: " + sq.subSequence(1,2));
        System.out.println("subSequence: " + sq1.subSequence(1,2));
        System.out.println("subSequence: " + sq2.subSequence(0,0));
        System.out.println("toString: " + sq.toString());
        for(int i=0; i<sq.length();i++){
            System.out.println(i + " " + String.format("%-3s",new String(new StringBuilder().append(sq.getValue(i)))) +": " +sq.charAt(i));
        }
        /*for (int i=0; i<127;i++) {
            StringBuilder s = new StringBuilder();
            s=s.append(i);
            while (s.length()<3) s=s.append(" ");
            System.out.println(s+": " + sq1.charAt(i));
        }*/
    }


    @SuppressWarnings("WeakerAccess")
    public static void do_3_5_9() {
        @SuppressWarnings("SpellCheckingInspection") String[] kw = {"fuck", "bitch", "сучка", "dota2"};
        @SuppressWarnings("SpellCheckingInspection") String[] inputText = {"sdfsdfuck", "sdfsd", "sdfsdfuc=(", "sdbitchfsd", "сучкаsdfsd", ":|сучкsdfsd", "сучк:(sdfsd", "dota", "dota2", "0123456789", "011111111111:(dota2"};
        SpamAnalyzer sa = new SpamAnalyzer(kw);
        NegativeTextAnalyzer nta = new NegativeTextAnalyzer();
        TooLongTextAnalyzer tta = new TooLongTextAnalyzer(10);
        TextAnalyzer[] analyzers={sa,nta,tta};
        TextAnalyzer[] analyzers1={nta,tta,sa};
        TextAnalyzer[] analyzers2={tta,sa,nta};
        for (String str: inputText) {
            System.out.println(str);
            System.out.println(checkLabels(analyzers,str));
            System.out.println(checkLabels(analyzers1,str));
            System.out.println(checkLabels(analyzers2,str));
            System.out.println("==================================");
        }
    }

    private static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer anal: analyzers){
            if (anal.processText(text)!=Label.OK)  return anal.processText(text);
        }
        return Label.OK;
    }

    public static void do_4_1_9() {
        System.out.println(SqrtIllegalArgumentException.sqrt(25));
    }

    public static void do_4_1_10() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName(){
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        StringBuilder s = new StringBuilder();
        int i=0;
        if (stackTraceElements.length<=2) i=stackTraceElements.length-1;
        for (StackTraceElement ste:stackTraceElements) {
            s=s.append(i).append(": ").append("ClassName - ").append(ste.getClassName()).append(", MethodName - ").append(ste.getMethodName()).append('\n');
            i++;
        }
        return s.toString();

        //return stackTraceElements[i].getClassName().toString()+"#"+stackTraceElements[i].getMethodName().toString();
    }

    public static void AnotherMethod (){
        System.out.println(getCallerClassAndMethodName());
    }

    public static void AnotherMethod2 (){
        AnotherMethod();
    }

    public static void AnotherMethod3 (){
        AnotherMethod2();
    }

}


