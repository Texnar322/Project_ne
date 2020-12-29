import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Lesson16
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите уравнение");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] result = s.split("");
        //s.toCharArray();
        String symbol = result[1];
        String a = result[0];
        String b = result[2];
        String c = result[4];
       // Pattern p = Pattern.compile("\\d+");
        //Matcher m = p.matcher(s);
        String regex = "[0-9]";
        //int xx = Integer.parseInt(x);
        if (symbol.equals("-"))
        {
            System.out.println("Уравнение с -");
            if (a.equals("x"))
            {
                System.out.println("1" );//+ a-b
                System.out.println("x-5=7");

                //System.out.println("Ответ: x = " + m);

            }
            else if (b.equals("x"))
            {
                System.out.println("2");
                System.out.println("5-x=5");
                System.out.println("Ответ: x = " + "5");
            }
            else if (c.equals("x"))
            {
                System.out.println("3");
                System.out.println("5-5=x");

            }
        }
        else if (symbol.equals("+"))
        {

            System.out.println("Уравнение с +");



        }
        else
            {
                System.out.println("Формат уравнения неверный");
            }

    }
}
