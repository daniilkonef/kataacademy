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

        HashMap<Integer,String> decAndGreek = new HashMap<>();
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
        decAndGreek.put(11,"XI");
        decAndGreek.put(12,"XII");
        decAndGreek.put(13,"XIII");
        decAndGreek.put(14,"XIV");
        decAndGreek.put(15,"XV");
        decAndGreek.put(16,"XVI");
        decAndGreek.put(17,"XVII");
        decAndGreek.put(18,"XVIII");
        decAndGreek.put(19,"XIX");
        decAndGreek.put(20,"XX");
        decAndGreek.put(21,"XXI");
        decAndGreek.put(22,"XXII");
        decAndGreek.put(23,"XXIII");
        decAndGreek.put(24,"XXIV");
        decAndGreek.put(25,"XXV");
        decAndGreek.put(26,"XXVI");
        decAndGreek.put(27,"XXVII");
        decAndGreek.put(28,"XXVIII");
        decAndGreek.put(29,"XXIX");
        decAndGreek.put(30,"XXX");
        decAndGreek.put(31,"XXXI");
        decAndGreek.put(32,"XXXII");
        decAndGreek.put(33,"XXXIII");
        decAndGreek.put(34,"XXXIV");
        decAndGreek.put(35,"XXXV");
        decAndGreek.put(36,"XXXVI");
        decAndGreek.put(37,"XXXVII");
        decAndGreek.put(38,"XXXVIII");
        decAndGreek.put(39,"XXXIX");
        decAndGreek.put(40,"XL");
        decAndGreek.put(41,"XLI");
        decAndGreek.put(42,"XLII");
        decAndGreek.put(43,"XLIII");
        decAndGreek.put(44,"XLIV");
        decAndGreek.put(45,"XLV");
        decAndGreek.put(46,"XLVI");
        decAndGreek.put(47,"XLVII");
        decAndGreek.put(48,"XLVIII");
        decAndGreek.put(49,"XLIX");
        decAndGreek.put(50,"L");
        decAndGreek.put(51,"LI");
        decAndGreek.put(52,"LII");
        decAndGreek.put(53,"LIII");
        decAndGreek.put(54,"LIV");
        decAndGreek.put(55,"LV");
        decAndGreek.put(56,"LVI");
        decAndGreek.put(57,"LVII");
        decAndGreek.put(58,"LVIII");
        decAndGreek.put(59,"LIX");
        decAndGreek.put(60,"LXI");
        decAndGreek.put(61,"LX");
        decAndGreek.put(62,"LXII");
        decAndGreek.put(63,"LXIII");
        decAndGreek.put(64,"LXIV");
        decAndGreek.put(65,"LXV");
        decAndGreek.put(66,"LXVI");
        decAndGreek.put(67,"LXVII");
        decAndGreek.put(68,"LXVIII");
        decAndGreek.put(69,"LXIX");
        decAndGreek.put(70,"LXX");
        decAndGreek.put(71,"LXXI");
        decAndGreek.put(72,"LXXII");
        decAndGreek.put(73,"LXXIII");
        decAndGreek.put(74,"LXXIV");
        decAndGreek.put(75,"LXXV");
        decAndGreek.put(76,"LXXVI");
        decAndGreek.put(77,"LXXVII");
        decAndGreek.put(78,"LXXVIII");
        decAndGreek.put(79,"LXXIX");
        decAndGreek.put(80,"LXXX");
        decAndGreek.put(81,"LXXXI");
        decAndGreek.put(82,"LXXXII");
        decAndGreek.put(83,"LXXXIII");
        decAndGreek.put(84,"LXXXIV");
        decAndGreek.put(85,"LXXXV");
        decAndGreek.put(86,"LXXXVI");
        decAndGreek.put(87,"LXXXVII");
        decAndGreek.put(88,"LXXXVIII");
        decAndGreek.put(89,"LXXXIX");
        decAndGreek.put(90,"XC");
        decAndGreek.put(91,"XCI");
        decAndGreek.put(92,"XCII");
        decAndGreek.put(93,"XCIII");
        decAndGreek.put(94,"XCIV");
        decAndGreek.put(95,"XCV");
        decAndGreek.put(96,"XCVI");
        decAndGreek.put(97,"XCVII");
        decAndGreek.put(98,"XCVIII");
        decAndGreek.put(99,"XCIX");
        decAndGreek.put(100,"C");

        //System.out.println(decAndGreek.get(100));

        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваше выражение: ");
            String query = input.nextLine(); //System.out.println(query);
            if (query.equalsIgnoreCase(new String("exit"))) break;
            //System.out.println( checkNotationSystem(query, greekAndDec) );

            //Запустить проверку системы исчисления. Какая обнаружена?
                //1 - греческая (greekNotationSystem)
                // или
                //2 - арабская (arabNotationSystem)
            //если греческая:
                //то выполнить конвертацию в арабскую
                //вычислить арабским вычислителем
            //если арабская:
                //то вычислить арабским вычислителем

            System.out.println( calc(query, checkNotationSystem(query, greekAndDec),greekAndDec, decAndGreek )); // HashMap<Integer,String> decAndGreek
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
                //return result = null;
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
                //return result = null;
            }


        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет смешанные системы исчисления,");
        }

        return result;

    }

    public static String calc(String query, String typeOfNotationSystem, HashMap<String,Integer> greekAndDec, HashMap<Integer,String> decAndGreek)
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
            //System.out.println("Греческий вычислитель нуждается в разработке.");
            //String leftString=null, rightString=null;
            //leftString = parts[0];  ob1 = leftString;
            //rightString = parts[1];  ob2 = rightString;

            //System.out.println(greekAndDec);
            //System.out.println(greekAndDec.get("VII"));
            //System.out.println( greekAndDec.get(parts[0]) );
            //System.out.println( greekAndDec.get(parts[1]) );
            //System.out.println(greekAndDec.containsKey("VII"));

            try {
                Object ob1 = greekAndDec.get(parts[0]); Object ob2 = greekAndDec.get(parts[1]);
                int x1 = greekAndDec.get(parts[0]); int x2 = greekAndDec.get(parts[1]);
                String s1 = parts[0]; String s2 = parts[1];

                if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
                {
                    //System.out.println("имеем дело с целочисленным выражением");
                    if (consoleLine.contains("+")) {result = new String("Решение: "+s1+"+"+s2+"="+decAndGreek.get(x1+x2).toString()+";" ); }   //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
                    if (consoleLine.contains("-")) { result = new String("Решение: "+s1+"-"+s2+"="+decAndGreek.get(x1-x2).toString()+";" ); }  //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
                    if (consoleLine.contains("/")) {result = new String("Решение: "+s1+"/"+s2+"="+decAndGreek.get(x1/x2).toString()+";" ); }   //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
                    if (consoleLine.contains("*")) { result = new String("Решение: "+s1+"*"+s2+"="+decAndGreek.get(x1*x2).toString()+";" ); } //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
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