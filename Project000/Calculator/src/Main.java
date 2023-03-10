// TODO READY Техзадание https://kataacademy.github.io/kata-program.io/task-calculator?b24form_user=1.176659-1675424624-551c804ae8494d131fd1cad0cc9001a50800e465354f151a923abad650bb32e2
// TODO READY - 1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
// TODO READY - 2. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
// TODO READY - 3. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
// TODO READY - 4. Калькулятор умеет работать только с целыми числами.
// TODO READY - 5. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
// TODO READY - 6. При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.
// TODO READY - 7. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
// TODO READY - 8. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
// TODO READY - 9. Результатом операции деления является целое число, остаток отбрасывается.
// TODO READY - 10. Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа, если результат работы меньше единицы, выбрасывается исключение.
// закончил разработку в 04/02/2023 17-26

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        HashMap<String,Integer> romansAndArabs = new HashMap<>();
        romansAndArabs.put("I",1);
        romansAndArabs.put("II",2);
        romansAndArabs.put("III",3);
        romansAndArabs.put("IV",4);
        romansAndArabs.put("V",5);
        romansAndArabs.put("VI",6);
        romansAndArabs.put("VII",7);
        romansAndArabs.put("VIII",8);
        romansAndArabs.put("IX",9);
        romansAndArabs.put("X",10);

        HashMap<Integer,String> arabsAndRomans = new HashMap<>();
        arabsAndRomans.put(1,"I");
        arabsAndRomans.put(2,"II");
        arabsAndRomans.put(3,"III");
        arabsAndRomans.put(4,"IV");
        arabsAndRomans.put(5,"V");
        arabsAndRomans.put(6,"VI");
        arabsAndRomans.put(7,"VII");
        arabsAndRomans.put(8,"VIII");
        arabsAndRomans.put(9,"IX");
        arabsAndRomans.put(10,"X");
        arabsAndRomans.put(11,"XI");
        arabsAndRomans.put(12,"XII");
        arabsAndRomans.put(13,"XIII");
        arabsAndRomans.put(14,"XIV");
        arabsAndRomans.put(15,"XV");
        arabsAndRomans.put(16,"XVI");
        arabsAndRomans.put(17,"XVII");
        arabsAndRomans.put(18,"XVIII");
        arabsAndRomans.put(19,"XIX");
        arabsAndRomans.put(20,"XX");
        arabsAndRomans.put(21,"XXI");
        arabsAndRomans.put(22,"XXII");
        arabsAndRomans.put(23,"XXIII");
        arabsAndRomans.put(24,"XXIV");
        arabsAndRomans.put(25,"XXV");
        arabsAndRomans.put(26,"XXVI");
        arabsAndRomans.put(27,"XXVII");
        arabsAndRomans.put(28,"XXVIII");
        arabsAndRomans.put(29,"XXIX");
        arabsAndRomans.put(30,"XXX");
        arabsAndRomans.put(31,"XXXI");
        arabsAndRomans.put(32,"XXXII");
        arabsAndRomans.put(33,"XXXIII");
        arabsAndRomans.put(34,"XXXIV");
        arabsAndRomans.put(35,"XXXV");
        arabsAndRomans.put(36,"XXXVI");
        arabsAndRomans.put(37,"XXXVII");
        arabsAndRomans.put(38,"XXXVIII");
        arabsAndRomans.put(39,"XXXIX");
        arabsAndRomans.put(40,"XL");
        arabsAndRomans.put(41,"XLI");
        arabsAndRomans.put(42,"XLII");
        arabsAndRomans.put(43,"XLIII");
        arabsAndRomans.put(44,"XLIV");
        arabsAndRomans.put(45,"XLV");
        arabsAndRomans.put(46,"XLVI");
        arabsAndRomans.put(47,"XLVII");
        arabsAndRomans.put(48,"XLVIII");
        arabsAndRomans.put(49,"XLIX");
        arabsAndRomans.put(50,"L");
        arabsAndRomans.put(51,"LI");
        arabsAndRomans.put(52,"LII");
        arabsAndRomans.put(53,"LIII");
        arabsAndRomans.put(54,"LIV");
        arabsAndRomans.put(55,"LV");
        arabsAndRomans.put(56,"LVI");
        arabsAndRomans.put(57,"LVII");
        arabsAndRomans.put(58,"LVIII");
        arabsAndRomans.put(59,"LIX");
        arabsAndRomans.put(60,"LXI");
        arabsAndRomans.put(61,"LX");
        arabsAndRomans.put(62,"LXII");
        arabsAndRomans.put(63,"LXIII");
        arabsAndRomans.put(64,"LXIV");
        arabsAndRomans.put(65,"LXV");
        arabsAndRomans.put(66,"LXVI");
        arabsAndRomans.put(67,"LXVII");
        arabsAndRomans.put(68,"LXVIII");
        arabsAndRomans.put(69,"LXIX");
        arabsAndRomans.put(70,"LXX");
        arabsAndRomans.put(71,"LXXI");
        arabsAndRomans.put(72,"LXXII");
        arabsAndRomans.put(73,"LXXIII");
        arabsAndRomans.put(74,"LXXIV");
        arabsAndRomans.put(75,"LXXV");
        arabsAndRomans.put(76,"LXXVI");
        arabsAndRomans.put(77,"LXXVII");
        arabsAndRomans.put(78,"LXXVIII");
        arabsAndRomans.put(79,"LXXIX");
        arabsAndRomans.put(80,"LXXX");
        arabsAndRomans.put(81,"LXXXI");
        arabsAndRomans.put(82,"LXXXII");
        arabsAndRomans.put(83,"LXXXIII");
        arabsAndRomans.put(84,"LXXXIV");
        arabsAndRomans.put(85,"LXXXV");
        arabsAndRomans.put(86,"LXXXVI");
        arabsAndRomans.put(87,"LXXXVII");
        arabsAndRomans.put(88,"LXXXVIII");
        arabsAndRomans.put(89,"LXXXIX");
        arabsAndRomans.put(90,"XC");
        arabsAndRomans.put(91,"XCI");
        arabsAndRomans.put(92,"XCII");
        arabsAndRomans.put(93,"XCIII");
        arabsAndRomans.put(94,"XCIV");
        arabsAndRomans.put(95,"XCV");
        arabsAndRomans.put(96,"XCVI");
        arabsAndRomans.put(97,"XCVII");
        arabsAndRomans.put(98,"XCVIII");
        arabsAndRomans.put(99,"XCIX");
        arabsAndRomans.put(100,"C");

        //System.out.println(arabsAndRomans.get(100));

        while (true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите ваше выражение: ");
            String query = input.nextLine(); //System.out.println(query);
            if (query.equalsIgnoreCase(new String("exit"))) break;
            //System.out.println( checkNotationSystem(query, romansAndArabs) );

            //Запустить проверку системы исчисления. Какая обнаружена?
                //1 - греческая (greekNotationSystem)
                // или
                //2 - арабская (arabNotationSystem)
            //если греческая:
                //то выполнить конвертацию в арабскую
                //вычислить арабским вычислителем
            //если арабская:
                //то вычислить арабским вычислителем
            try
                {

                    String message = calc(query, checkNotationSystem(query, romansAndArabs),romansAndArabs, arabsAndRomans );
                    System.out.println( message );
                }
            catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    break;
                }
//            catch (MinusException e)
//            {
//                System.out.println();
//            }

            System.out.println();
        }
        System.out.println("Работа приложения завершена.");

    }
    public static String checkNotationSystem(String query, HashMap<String,Integer> greekAndDec) throws Exception //throws Exception
    {
        String result = "Систему исчисления не удалось определить";
        String consoleLine = query;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");

        //ob1 = Double.parseDouble(parts[0]); ob2 = parts[1];
        //if (ob1 instanceof Double) throw new Exception("Обнаружена дробь в х1");

        //String example = "1331.2";
        String example1 = parts[0];
        String example2 = parts[1];
        if (Pattern.matches("^[\\+\\-]{0,1}[0-9]+[\\.\\,][0-9]+$", (CharSequence) example1)) {
            System.out.println("matches double");
            throw new Exception("Обнаружена дробь в первом числе. Дроби запрещены п4 Техзадания.");
        }
        if (Pattern.matches("^[\\+\\-]{0,1}[0-9]+[\\.\\,][0-9]+$", (CharSequence) example2)) {
            System.out.println("matches double");
            throw new Exception("Обнаружена дробь во втором числе. Дроби запрещены п4 Техзадания.");
        }

        try {
            int x1=0, x2=0; Object ob1=null, ob2=null;
            x1 = Integer.parseInt(parts[0]);  ob1 = x1;
            x2 = Integer.parseInt(parts[1]);  ob2 = x2;

            if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
            {
                //System.out.println("имеем дело с целочисленным выражением");
                return result = "Обнаружена арабская система счисления";

            }
        }
        catch (Exception e)
        {
            //System.out.print("Ваше выражение имеет недопустимую системы исчилсения.");
        }

        try
        {
            int x1=0, x2=0; Object ob1=null, ob2=null;
            String leftString=null, rightString=null;
            leftString = parts[0];  ob1 = leftString;
            rightString = parts[1];  ob2 = rightString;

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

    public static String calc(String query, String typeOfNotationSystem, HashMap<String,Integer> greekAndDec, HashMap<Integer,String> decAndGreek) throws Exception, MinusException
    {
        String result = "не удалось решить выражение, введите только арабские или только греческие цифры.";
        String consoleLine = query;
        String[] parts = consoleLine.split("\\+|\\-|\\*|\\/");
        //if(!(ob1 instanceof Integer)||!(ob2 instanceof Integer)) throw new Exception("Ошибка: введенное число имеет смешанную систему исчисления. Это запрещено согласно п5 Технического Задания."); //хотя мой калькцлятор способен работать с числами больше 10

        if (typeOfNotationSystem.contains(new String("Обнаружена арабская система счисления")))
        {
            //System.out.println("Тут нужно вызвать арабский вычислитель.");

            int x1=0, x2=0; Object ob1=null, ob2=null;
            //try {
                x1 = Integer.parseInt(parts[0]);  ob1 = x1;
                x2 = Integer.parseInt(parts[1]);  ob2 = x2;
                if(x1>10 || x2>10) throw new Exception("Ошибка: введенное число превышает 10. Это запрещено согласно п3 Технического Задания."); //хотя мой калькцлятор способен работать с числами больше 10

                if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
                {
                    //System.out.println("имеем дело с целочисленным выражением");
                    if (consoleLine.contains("+")) {result = new String("Решение: "+x1+"+"+x2+"="+(x1+x2)+";" ); }   //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
                    if (consoleLine.contains("-")) {result = new String("Решение: "+x1+"-"+x2+"="+(x1-x2)+";" ); }  //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
                    if (consoleLine.contains("/")) {result = new String("Решение: "+x1+"/"+x2+"="+(x1/x2)+";" ); }   //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
                    if (consoleLine.contains("*")) {result = new String("Решение: "+x1+"*"+x2+"="+(x1*x2)+";" ); } //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
                }
            //}
            //catch (Exception e)
            //{
                //System.out.print("Ваше выражение имеет смешанные системы исчисления,");
            //}
        }

        if (typeOfNotationSystem.contains(new String("Обнаружена греческая система счисления")))
        {
//            try
//            {
                    Object ob1 = greekAndDec.get(parts[0]); Object ob2 = greekAndDec.get(parts[1]);
                    int x1 = greekAndDec.get(parts[0]); int x2 = greekAndDec.get(parts[1]);
                    String s1 = parts[0]; String s2 = parts[1];
                    //if ( ((Integer) ob1).intValue() < ((Integer) ob2).intValue() ) throw new Exception("Римская математика не умеет работать с отрицательными числами.");
                    //if ( x1 < x2 ) throw new MinusException("Римская математика не умеет работать с отрицательным результатом и если он меньше единицы. И это запрещено п10 Техзадания.");
                    //if ( (x1-x2)==0 ) throw new MinusException("Римская математика не умеет работать с нулевым результатом. И это запрещено п10 Техзадания.");
                    if( (ob1 instanceof Integer) && (ob2 instanceof Integer))
                    {

                        //System.out.println("имеем дело с целочисленным выражением");
                        if (consoleLine.contains("+")) {result = new String("Решение: "+s1+"+"+s2+"="+decAndGreek.get(x1+x2).toString()+";" ); }   //System.out.println("Ваше выражение: "+x1+"+"+x2+"="+(x1+x2)+";" );
                        if (consoleLine.contains("-"))
                        {
                            if ( (x1-x2)==0 ) throw new MinusException("Римская математика не умеет работать с нулевым результатом. И это запрещено п10 Техзадания.");
                            if ( x1 < x2 ) throw new MinusException("Римская математика не умеет работать с отрицательным результатом и если он меньше единицы. И это запрещено п10 Техзадания.");
                            result = new String("Решение: "+s1+"-"+s2+"="+decAndGreek.get(x1-x2).toString()+";" );
                        }  //System.out.println("Ваше выражение: "+x1+"-"+x2+"="+(x1-x2)+";" );
                        if (consoleLine.contains("/")) {result = new String("Решение: "+s1+"/"+s2+"="+decAndGreek.get(x1/x2).toString()+";" ); }   //System.out.println("Ваше выражение: "+x1+"/"+x2+"="+(x1/x2)+";" );
                        if (consoleLine.contains("*")) {result = new String("Решение: "+s1+"*"+s2+"="+decAndGreek.get(x1*x2).toString()+";" ); } //System.out.println("Ваше выражение: "+x1+"*"+x2+"="+(x1*x2)+";" );
                    }
                //}
    //            catch (Exception e)
    //            {
    //                result = "отрицательно!";
    //                System.out.print(e.getMessage());
    //            }

        }
        else throw new MinusException("Такое выражение запрещено согалсно п5 Техзадания.");

//         псевдокод римсккого вычислителя
//         Словарь римсккиеРазрешенныеЧисла = { массив разрешенных римских цифр } HashMap<Integer, String> passportsAndNames = new HashMap<>(); https://javarush.com/groups/posts/1940-klass-hashmap-
//         истинность леваяЧастьГодна? = проверить что левая часть входит в Словарь разрешенных символов и вернуть истину или ложь
//         истинность праваяЧастьГодна? = проверить правую часть входит в Словарь разрешенных символов и вернуть истину или ложь
//         если (обе части имеют истину) то:
//              преобразовать левую часть в арабское число;
//              преобразовать правую часть в арабское число;
        if(result.contains("не удалось решить выражение, введите только арабские или только римские цифры.")) throw new Exception("Ошибка: Введенное выражение запрещено обрабатывать согласно п5,п8 Техзадания.");
        return result;
    }
}