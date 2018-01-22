package ExceptionPackage;

public class CallerClassAndMethodName {
    public static String getCallerClassAndMethodName(){
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        StringBuilder s = new StringBuilder();
        for(StackTraceElement ste:stackTraceElements){
            s=s.append(ste.toString()).append("#");
        }
        return s.toString();
    }
}
