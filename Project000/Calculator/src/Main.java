// https://kataacademy.github.io/kata-program.io/task-calculator?b24form_user=1.176659-1675424624-551c804ae8494d131fd1cad0cc9001a50800e465354f151a923abad650bb32e2

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
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

        HashMap<Integer,String> decAndgreek = new HashMap<>();
        decAndgreek.put(1,"I");
        decAndgreek.put(2,"II");
        decAndgreek.put(3,"III");
        decAndgreek.put(4,"IV");
        decAndgreek.put(5,"V");
        decAndgreek.put(6,"VI");
        decAndgreek.put(7,"VII");
        decAndgreek.put(8,"VIII");
        decAndgreek.put(9,"IX");
        decAndgreek.put(10,"X");
        decAndgreek.put(11,"XI");
        decAndgreek.put(12,"XII");
        decAndgreek.put(13,"XIII");
        decAndgreek.put(14,"XIV");
        decAndgreek.put(15,"XV");
        decAndgreek.put(16,"XVI");
        decAndgreek.put(17,"XVII");
        decAndgreek.put(18,"XVIII");
        decAndgreek.put(19,"XIX");
        decAndgreek.put(20,"XX");
        decAndgreek.put(21,"XXI");
        decAndgreek.put(22,"XXII");
        decAndgreek.put(23,"XXIII");
        decAndgreek.put(24,"XXIV");
        decAndgreek.put(25,"XXV");
        decAndgreek.put(26,"XXVI");
        decAndgreek.put(27,"XXVII");
        decAndgreek.put(28,"XXVIII");
        decAndgreek.put(29,"XXIX");
        decAndgreek.put(30,"XXX");
        decAndgreek.put(31,"XXXI");
        decAndgreek.put(32,"XXXII");
        decAndgreek.put(33,"XXXIII");
        decAndgreek.put(34,"XXXIV");
        decAndgreek.put(35,"XXXV");
        decAndgreek.put(36,"XXXVI");
        decAndgreek.put(37,"XXXVII");
        decAndgreek.put(38,"XXXVIII");
        decAndgreek.put(39,"XXXIX");
        decAndgreek.put(40,"XL");
        decAndgreek.put(41,"XLI");
        decAndgreek.put(42,"XLII");
        decAndgreek.put(43,"XLIII");
        decAndgreek.put(44,"XLIV");
        decAndgreek.put(45,"XLV");
        decAndgreek.put(46,"XLVI");
        decAndgreek.put(47,"XLVII");
        decAndgreek.put(48,"XLVIII");
        decAndgreek.put(49,"XLIX");
        decAndgreek.put(50,"L");
        decAndgreek.put(51,"LI");
        decAndgreek.put(52,"LII");
        decAndgreek.put(53,"LIII");
        decAndgreek.put(54,"LIV");
        decAndgreek.put(55,"LV");
        decAndgreek.put(56,"LVI");
        decAndgreek.put(57,"LVII");
        decAndgreek.put(58,"LVIII");
        decAndgreek.put(59,"LIX");
        decAndgreek.put(60,"LXI");
        decAndgreek.put(61,"LX");
        decAndgreek.put(62,"LXII");
        decAndgreek.put(63,"LXIII");
        decAndgreek.put(64,"LXIV");
        decAndgreek.put(65,"LXV");
        decAndgreek.put(66,"LXVI");
        decAndgreek.put(67,"LXVII");
        decAndgreek.put(68,"LXVIII");
        decAndgreek.put(69,"LXIX");
        decAndgreek.put(70,"LXX");
        decAndgreek.put(71,"LXXI");
        decAndgreek.put(72,"LXXII");
        decAndgreek.put(73,"LXXIII");
        decAndgreek.put(74,"LXXIV");
        decAndgreek.put(75,"LXXV");
        decAndgreek.put(76,"LXXVI");
        decAndgreek.put(77,"LXXVII");
        decAndgreek.put(78,"LXXVIII");
        decAndgreek.put(79,"LXXIX");
        decAndgreek.put(80,"LXXX");
        decAndgreek.put(81,"LXXXI");
        decAndgreek.put(82,"LXXXII");
        decAndgreek.put(83,"LXXXIII");
        decAndgreek.put(84,"LXXXIV");
        decAndgreek.put(85,"LXXXV");
        decAndgreek.put(86,"LXXXVI");
        decAndgreek.put(87,"LXXXVII");
        decAndgreek.put(88,"LXXXVIII");
        decAndgreek.put(89,"LXXXIX");
        decAndgreek.put(90,"X");
        decAndgreek.put(91,"X");
        decAndgreek.put(92,"X");
        decAndgreek.put(93,"X");
        decAndgreek.put(94,"X");
        decAndgreek.put(95,"X");
        decAndgreek.put(96,"X");
        decAndgreek.put(97,"X");
        decAndgreek.put(98,"X");
        decAndgreek.put(99,"X");
        decAndgreek.put(100,"X");

        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваше выражение: ");
            String query = input.nextLine(); //System.out.println(query);
            if (query.equalsIgnoreCase(new String("exit"))) break;
            System.out.println( checkNotationSystem(query, greekAndDec) );

            //Запустить проверку системы исчисления. Какая обнаружена?
                //1 - греческая (greekNotationSystem)
                // или
                //2 - арабская (arabNotationSystem)
            //если греческая:
                //то выполнить конвертацию в арабскую
                //вычислить арабским вычислителем
            //если арабская:
                //то вычислить арабским вычислителем

            System.out.println(calc(query, checkNotationSystem(query, greekAndDec),greekAndDec ));
            System.out.println();
        }
        System.out.println("Работа приложения завершена.");

    }
    public static String checkNotationSystem(String query, HashMap<String,Integer> greekAndDec)
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
//            HashMap<String,Integer> greekAndDec = new HashMap<>();
//            greekAndDec.put("I",1);
//            greekAndDec.put("II",2);
//            greekAndDec.put("III",3);
//            greekAndDec.put("IV",4);
//            greekAndDec.put("V",5);
//            greekAndDec.put("VI",6);
//            greekAndDec.put("VII",7);
//            greekAndDec.put("VIII",8);
//            greekAndDec.put("IX",9);
//            greekAndDec.put("X",10);
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
                //System.out.println("Имеем дело с греческим выражением.");
                return result = "Обнаружена греческая система счисления";
            }


        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }

        return result;

    }

    public static String calc(String query, String typeOfNotationSystem, HashMap<String,Integer> greekAndDec)
    {
        String result = "не удалось решить выражение, введите только арабские или только греческие цифры.";
        String consoleLine = query;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");

        if (typeOfNotationSystem.contains(new String("Обнаружена десятичная система счисления")))
        {
            //System.out.println("Тут нужно вызвать арабский вычислитель.");
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
        }

        if (typeOfNotationSystem.contains(new String("Обнаружена греческая система счисления")))
        {
            System.out.println("Греческий вычислитель нуждается в разработке.");
            //String leftString=null, rightString=null;
            //leftString = parts[0];  ob1 = leftString;
            //rightString = parts[1];  ob2 = rightString;

            //System.out.println(greekAndDec);
            //System.out.println(greekAndDec.get("VII"));
            System.out.println( greekAndDec.get(parts[0]) );
            System.out.println( greekAndDec.get(parts[1]) );
            //System.out.println(greekAndDec.containsKey("VII"));

            try {
                Object ob1 = greekAndDec.get(parts[0]); Object ob2 = greekAndDec.get(parts[1]);
                int x1 = greekAndDec.get(parts[0]); int x2 = greekAndDec.get(parts[1]);
                String s1 = parts[0]; String s2 = parts[1];

                if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
                {
                    //System.out.println("имеем дело с целочисленным выражением");
                    if (consoleLine.contains("+")) {result = new String("Решение: "+s1+"+"+s2+"="+(x1+x2)+";" ); }   //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
                    if (consoleLine.contains("-")) { result = new String("Решение: "+s1+"-"+s2+"="+(x1-x2)+";" ); }  //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
                    if (consoleLine.contains("/")) {result = new String("Решение: "+s1+"/"+s2+"="+(x1/x2)+";" ); }   //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
                    if (consoleLine.contains("*")) { result = new String("Решение: "+s1+"*"+s2+"="+(x1*x2)+";" ); } //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
//                for(String part : parts){
//                    Integer.parseInt(part);
//
//                    //System.out.println(part);
//                }
                }
            }
            catch (Exception e)
            {
                System.out.print("Произошло исключение в греческом вычислителе, требуются исправления.");
            }

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