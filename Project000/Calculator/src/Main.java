import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Scanner scan1 = new Scanner(System.in);
        //System.out.println("Введите выражение:"); // не матерное
        //System.out.println(scan1.nextLine());
        String txt = "100*50";
        System.out.println(calc(txt));
    }

    public static String calc(String txt)
    {
        String result = null;
        String consoleLine = txt;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");

        int x1 = Integer.parseInt(parts[0]);
        int x2 = Integer.parseInt(parts[1]);

        if (consoleLine.contains("+"))
        {
            //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
            result = new String("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
        }
        if (consoleLine.contains("-"))
        {
            //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
            result = new String("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
        }
        if (consoleLine.contains("/"))
        {
            //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
            result = new String("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
        }
        if (consoleLine.contains("*"))
        {
            //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
            result = new String("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
        }

        for(String part : parts){
            Integer.parseInt(part);

            //System.out.println(part);
        }

        return result;
    }
}