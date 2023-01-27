import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите выражение: ");
            String query = input.nextLine();
            System.out.println(calc(query));
            System.out.println();
        }

    }

    public static String calc(String query)
    {
        String result = "не удалось решить выражение, введите только арабские или только греческие цифры.";
        String consoleLine = query;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");

        int x1=0, x2=0; Object ob1=null, ob2=null;
        try {
            x1 = Integer.parseInt(parts[0]);  ob1 = x1;
            x2 = Integer.parseInt(parts[1]);  ob2 = x2;
        }
        catch (Exception e)
        {
            System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }


        if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
        {
            //System.out.println("имеем дело с целочисленным выражением");
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
        }

        // псевдокод греческого вычислителя
        // массивСтрок греческиеРазрешенныеЧисла = { массив разрешенных греческих цифр } HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> decAndGreek = new HashMap<>();
        decAndGreek.put(1,"I");
        decAndGreek.put(2,"II");
        decAndGreek.put(3,"III");
        decAndGreek.put(4,"IV");
        decAndGreek.put(5,"V");
        decAndGreek.put(6,"VI");
        decAndGreek.put(7,"VII");
        decAndGreek.put(8,"VIII");
        decAndGreek.put(9,"IX");
        decAndGreek.put(10,"X");

        // истинность леваяЧастьГодна? = проверить что левая входит в массив разрешенных символов и вернуть истину или ложь
        // истинность праваяЧастьГодна? = проверить правую часть на соответствие разрешенному символу и вернуть истину или ложь
        // если (обе части имеет истину) то:
        //      преобразовать левую часть в десятичное число;
        //      преобразовать правую часть в десятичное число;
        //

        return result;
    }
}