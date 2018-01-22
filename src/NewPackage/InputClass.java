package NewPackage;

//import java.util.regex;


import Robot.Robot;

@SuppressWarnings("ALL")
public class InputClass {
    public static void main(String[] args){
        String[] roles={
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] textLines= {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };

        StringBuilder res = new StringBuilder();
        int i=0;
        int j;
        for (String str: roles){
            j=0;
            res = res.append(str).append(":").append('\n');
            i++;
            for (String strLines: textLines){
                j++;
                if (strLines.indexOf(str+":")==0){
                    //strLines.replace(0,str.length()+1, new StringBuilder(j).toString());
                    res= res.append(new StringBuilder(strLines).replace(0,str.length()+1, Integer.toString(j) +")")+"\n");
                    //StringBuilder tmpstr=new StringBuilder(strLines).replace(0,str.length()+1, Integer.toString(j) +")");
                    //res[i]=tmpstr.toString();
                    i++;
                }
            }
            res = res.append("\n");
            i++;
        }


//        String s= res.toString()

/*        Random random=new Random();
        Robot robot=new Robot(random.nextInt(20)-10,random.nextInt(20)-10, Direction.UP);
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();
        System.out.println("Начальное состояние: " + robot.getX()+" "+ robot.getY()+ " " + robot.getDirection().name());
        moveRobot(robot,random.nextInt(20)-10,random.nextInt(20)-10);
        System.out.println("Конечное состояние: "+robot.getX()+" "+ robot.getY()+ " " + robot.getDirection().name());
*/
        //double d1=0.10001;
        //double d2=0.1;
        //System.out.println(java.lang.Double.compare(d1,d2));
        /*ComplexNumber cn1=new ComplexNumber(0.111,0.2);
        ComplexNumber cn2=new ComplexNumber(0.111,0.2);
        System.out.println(cn1.equals(cn2));
        int h1=cn1.hashCode();
        int h2=cn2.hashCode();
        System.out.println(h1);
        System.out.println(h2);*/
        /*int a,b,c;
        double d;
        String s;
        a=new Scanner(System.in).nextInt();
        s=new Scanner(System.in).next();
        b=a+5;
        System.out.println(b);
        d=Math.sqrt(b);
        System.out.println(d);
        System.out.println(s); */
        //double a,b,c;
        /*int d=-500;
        byte e=(byte)d;
        //a=b=0.000000000000000000000000001;
        //c  =0.000000000000000000000000002;
        //System.out.println(e);
        //char symbol='\\';
        //d=(int) symbol;
        int f = 23;
        String s1,s2;//,s2,s3,s4;
        //s='A' + '1' + "2";
        //s='A' + "12"
        s1= new String("Madam, I'm Adam!").replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        //s1=s1.replaceAll("[^a-zA-Z0-9]", "").;
        s2 =new StringBuilder(s1).reverse().toString();
        //s3=new String("Madam, I'm Adam!");
        //s3.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        //s2="A" + 12;
        //s3='A' + "12";
        //s4="A" + ('\t' + '\u0003');
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s1.equals(s2));
        /*String[] strs = new String[s1.length()];
        String[] catsNames = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };
        for (int i=0;i<s1.length();i++){
            char ss=new StringBuilder(s1).charAt(i);
            System.out.println(ss);
        }
        for (String str : catsNames){
            System.out.println(str);
        } */
        /*int value=5;
        BigInteger res=BigInteger.valueOf(1);;
        for (int i=2;i<=value;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        //System.out.println(res.toString());
        int[] a1={0, 2, 2} ;
        int[] a2={1, 3};
        int[] a3= new int[a1.length+a2.length];
        //System.out.println(a1.length);
        //System.out.println(a2.length);
        //System.out.println(a3.length);
        int a=0;
        int b=0;
        boolean flag;
/*        if (a1.length==0 & a2.length > 0) for(int i=0;i<a2.length;i++) a3[i]=a2[i];
         else if (a2.length==0 & ) for(int i=0;i<a1.length;i++) a3[i]=a2[i];
               else if (a1.length>0 & a2.length>0){
                    int res=0;
                    while(int k=0 < a3.length)

                        a3[k]=res;
        }*/
        /*int i,k,j;
        for (i=0; i<a1.length;){
             for(j=0;j<a2.length;){
                  if (a1[i]=>a2[j]){
                  a3[k]=a2[j];
                  j++;
                  k++;
                  }
             }
             a3[k]=a1[i];
             i++;
             k++;
        }

        for (int k=0; k<a3.length;k++) {
            System.out.print("a="+a+", b="+b+". ");
            System.out.print("a1["+a+"]="+a1[a]+", b1["+b+"]="+a2[b]+". ");
            if (a1[a]>=a2[b]) {
                //System.out.print(" Len a2="+ a2.length + ". ");
                a3[k]=a2[b];
                if (b<a2.length) {
                    System.out.print("Increment b! ");
                    b++;
                }
                else {
                    System.out.print("Increment a! ");
                    a++;
                }

            }
            else {
                //System.out.print(" Len a1="+ a1.length + ". ");
                a3[k]=a1[a];
                if (a<a1.length){
                    System.out.print("Increment a! ");
                    a++;
                }
                else{
                    System.out.print("Increment b! ");
                    b++;
                }
            }
            System.out.println("a3["+k+"]="+a3[k]+".");
            //System.out.println(a3[k]);
        }
        //for (int i=0;i<a1.length;i++) a3[i]=a1[i];
        //for (int i=a1.length;i<a3.length;i++) a3[i]=a2[i-a1.length];
        //Arrays.sort(a3);
        //for (int j=0; j <a3.length-1;j++) {
        /*for (int i = 0; i < a3.length-1; i++) {
                if (a3[i] > a3[i + 1]) {
                    d = a3[i];
                    a3[i] = a3[i + 1];
                    a3[i + 1] = d;
                }
        }
        }*/
        //for (int i =0; i<a3.length;i++) System.out.println(a3[i]);

        //for (int k=0;k<a3.length;k++) System.out.println(a3[k]);

        //;
        //System.out.println(s4);
        //int[] a= new int[0];
        //System.out.println(a.length);

        /*String s;
        boolean bl;
        long lg;
        float fl;
        byte bt;
        char cr;
        d=s; //string->int
        s=d; //int->string
        d=bl; //bollean->int
        bl=d; //int-boolean
        fl=lg; //long->float
        lg=fl; //float->long
        cr=bt; //byte->char
        bt=cr; //char->byte
        d=cr; //char->int
        cr=d; //int->char
        lg=d; //int->long
        d=lg; //long->int
        java.lang.Integer.bitCount(d);
        //d=s;*/
        //System.out.println(symbol);
        //System.out.println(d);
        //System.out.println(f);
        //System.out.println(d+f);
        //char symb=(char)(d+f);
        //int x=1;
        /*d=1;
        boolean bl=false;
        d=java.lang.Math.abs(d);
        int x=1;
        while (x <=d){
            x=x*2;
            if (x==d) bl=true;
        }
        System.out.println(bl);
        System.out.println((char)((int)'\\'+f));
        */

        //symbol=(d>>>f)
        //System.out.println((char)(d>>>f));
        //return  ;
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Необходимо изменить: " +robot.getX() + " => " + toX);
        if (robot.getX()>toX){
            while (robot.getDirection().name() != "LEFT" ){
                robot.turnRight();
                System.out.println("Направление: " + robot.getDirection().name() );
            }
        }
        else{
            while (robot.getDirection().name() != "RIGHT") {
                robot.turnRight();
                System.out.println("Направление: " + robot.getDirection().name() );
            }
        }

        while (robot.getX()!=toX) {
            robot.stepForward();
            System.out.println("Шажок: " +robot.getX() + " => " + toX );
        }

        System.out.println("Необходимо изменить: " +robot.getY() + " => " + toY);
        if (robot.getY()>toY){
            while (robot.getDirection().name() != "DOWN" ){
                robot.turnRight();
                System.out.println("Направление: " + robot.getDirection().name() );
            }
        }
        else{
            while (robot.getDirection().name() != "UP"){
                robot.turnRight();
                System.out.println("Направление: " + robot.getDirection().name() );
            }
        }
        while (robot.getY()!=toY) {
            robot.stepForward();
            System.out.println("Шажок: " +robot.getY() + " => " + toY );
        }
    }

}