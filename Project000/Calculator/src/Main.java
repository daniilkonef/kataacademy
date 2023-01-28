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
//                for(String part : parts){
//                    Integer.parseInt(part);
//
//                    //System.out.println(part);
//                }
            }
        }
        catch (Exception e)
        {
            System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }




//         псевдокод греческого вычислителя
//         Словарь греческиеРазрешенныеЧисла = { массив разрешенных греческих цифр } HashMap<Integer, String> passportsAndNames = new HashMap<>(); https://javarush.com/groups/posts/1940-klass-hashmap-
//         истинность леваяЧастьГодна? = проверить что левая часть входит в Словарь разрешенных символов и вернуть истину или ложь
//         истинность праваяЧастьГодна? = проверить правую часть входит в Словарь разрешенных символов и вернуть истину или ложь
//         если (обе части имеют истину) то:
//              преобразовать левую часть в десятичное число;
//              преобразовать правую часть в десятичное число;

//        HashMap<Integer, String> decAndGreek = new HashMap<>();
//        decAndGreek.put(1,"I");
//        decAndGreek.put(2,"II");
//        decAndGreek.put(3,"III");
//        decAndGreek.put(4,"IV");
//        decAndGreek.put(5,"V");
//        decAndGreek.put(6,"VI");
//        decAndGreek.put(7,"VII");
//        decAndGreek.put(8,"VIII");
//        decAndGreek.put(9,"IX");
//        decAndGreek.put(10,"X");
//        System.out.println(decAndGreek);
//        System.out.println(decAndGreek.get(7));

        HashMap<String,Integer> greekAndDec = new HashMap<>();
        greekAndDec.put("I",1);
        greekAndDec.put("II",2);
        greekAndDec.put("III",3);
        greekAndDec.put("IV",4);
        greekAndDec.put("V",5);
        greekAndDec.put("VI",6);
        greekAndDec.put("VII",7);
        greekAndDec.put("VIII",8);
        greekAndDec.put("IX",9);
        greekAndDec.put("X",10);
        System.out.println(greekAndDec);
        System.out.println(greekAndDec.get("VII"));
        System.out.println(greekAndDec.containsKey("VII"));

        String s1=null, s2=null;
        try {
            s1 = parts[0];  ob1 = s1;
            s2 = parts[0];  ob2 = s2;


        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }

        return result;
    }
}