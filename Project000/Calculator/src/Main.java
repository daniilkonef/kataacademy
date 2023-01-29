// https://kataacademy.github.io/kata-program.io/task-calculator?b24form_user=1.176659-1675424624-551c804ae8494d131fd1cad0cc9001a50800e465354f151a923abad650bb32e2

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваше выражение: ");
            String query = input.nextLine(); //System.out.println(query);
            if (query.equalsIgnoreCase(new String("exit"))) break;
            System.out.println(checkNotationSystem(query));

            //Запустить проверку системы исчисления. Какая обнаружена?
                //1 - греческая (greekNotationSystem)
                // или
                //2 - арабская (arabNotationSystem)
            //если греческая:
                //то выполнить конвертацию в арабскую
                //вычислить арабским вычислителем
            //если арабская:
                //то вычислить арабским вычислителем

            System.out.println(calc(query));
            System.out.println();
        }
        System.out.println("Работа приложения завершена.");

    }
    public static String checkNotationSystem(String query)
    {
        String result = "Систему исчисления не удалось определить";
        String consoleLine = query;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");

        int x1=0, x2=0; Object ob1=null, ob2=null;

        try {
            x1 = Integer.parseInt(parts[0]);  ob1 = x1;
            x2 = Integer.parseInt(parts[1]);  ob2 = x2;

            if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
            {
                //System.out.println("имеем дело с целочисленным выражением");
                return result = "Обнаружена десятичная система счисления";
            }
        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет недопустимую системы исчилсения.");
        }

        try
        {
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
            //System.out.println(greekAndDec);
            //System.out.println(greekAndDec.get("VII"));
            //System.out.println(greekAndDec.containsKey("VII"));

            String leftString=null, rightString=null;
            leftString = parts[0];  ob1 = leftString;
            rightString = parts[1];  ob2 = rightString;

//            if (greekAndDec.containsKey(leftString))
//            {
//                //System.out.println("Левая часть = "+leftString);
//                x1 = greekAndDec.get(leftString);
//                System.out.println("x1 ="+x1);
//            }
//
//            if (greekAndDec.containsKey(rightString))
//            {
//                //System.out.println("Левая часть = "+leftString);
//                x2 = greekAndDec.get(rightString);
//                System.out.println("x2 ="+x2);
//            }

            if( greekAndDec.containsKey(leftString) && greekAndDec.containsKey(rightString) )
            {
                //System.out.println("имеем дело с целочисленным выражением");
                return result = "Обнаружена греческая система счисления";
            }


        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }

        return result;

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
                if (consoleLine.contains("+")) {result = new String("Решение: "+x1+"+"+x2+"="+(x1+x2)+";" ); }   //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
                if (consoleLine.contains("-")) { result = new String("Решение: "+x1+"-"+x2+"="+(x1-x2)+";" ); }  //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
                if (consoleLine.contains("/")) {result = new String("Решение: "+x1+"/"+x2+"="+(x1/x2)+";" ); }   //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
                if (consoleLine.contains("*")) { result = new String("Решение: "+x1+"*"+x2+"="+(x1*x2)+";" ); } //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
//                for(String part : parts){
//                    Integer.parseInt(part);
//
//                    //System.out.println(part);
//                }
            }
        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }


//         псевдокод греческого вычислителя
//         Словарь греческиеРазрешенныеЧисла = { массив разрешенных греческих цифр } HashMap<Integer, String> passportsAndNames = new HashMap<>(); https://javarush.com/groups/posts/1940-klass-hashmap-
//         истинность леваяЧастьГодна? = проверить что левая часть входит в Словарь разрешенных символов и вернуть истину или ложь
//         истинность праваяЧастьГодна? = проверить правую часть входит в Словарь разрешенных символов и вернуть истину или ложь
//         если (обе части имеют истину) то:
//              преобразовать левую часть в десятичное число;
//              преобразовать правую часть в десятичное число;

        return result;
    }
}