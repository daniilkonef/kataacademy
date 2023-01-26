import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите выражение: ");
            //System.out.println(scan1.nextLine());
            //String query = "100*50";
            String query = input.nextLine();
            System.out.println(calc(query));
            System.out.println();
        }

    }

    public static String calc(String query)
    {
        String result = null;
        String consoleLine = query;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");

        int x1 = Integer.parseInt(parts[0]);
        int x2 = Integer.parseInt(parts[1]);

        if (consoleLine.contains("+"))
        {
            //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
            result = new String("Решение: "+x1+"+"+x2+"="+(x1+x2)+";" );
        }
        if (consoleLine.contains("-"))
        {
            //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
            result = new String("Решение: "+x1+"-"+x2+"="+(x1-x2)+";" );
        }
        if (consoleLine.contains("/"))
        {
            //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
            result = new String("Решение: "+x1+"/"+x2+"="+(x1/x2)+";" );
        }
        if (consoleLine.contains("*"))
        {
            //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
            result = new String("Решение: "+x1+"*"+x2+"="+(x1*x2)+";" );
        }

        for(String part : parts){
            Integer.parseInt(part);

            //System.out.println(part);
        }

        return result;
    }
}