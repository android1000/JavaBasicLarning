package NewPackage;

@SuppressWarnings("WeakerAccess")
public class NewClassInNewProject {
    public static void main(String[] args) {
        int count = 5;
        String s = "Fuck yea";

        DoPrintlnMoreTimes(s, count);
    }

    private static void DoPrintlnMoreTimes(String s, int count){
        for (int i=0;i<count;i++){
            System.out.println(s);
        }
    }

}
