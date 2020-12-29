

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.*;


public class Lesson13
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Введите строку из слов");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = "dawawdawdawdawdawd rfrfrffr rfsfsrf efsf";
        String[] result = a.split(" ");
        Pattern patlatletter = Pattern.compile("[а-яА-Я]{2,100}");
        Matcher matlatletter = patlatletter.matcher(Arrays.toString(result));
        Pattern patkirletter = Pattern.compile("[a-zA-Z0-9_]{2,100}");
        Matcher matkirletter = patkirletter.matcher(Arrays.toString(result));
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
            if(matlatletter.matches()==true)
            {
                System.out.println("Латиница");
            }
            else if (matkirletter.matches()==false)
            {
                System.out.println("Кирилица");
            }

        }



        //String str = "begin middle end";
       // str = StringUtils.;  //str =" middle "

//        boolean found = Pattern.matches("[a-zA-Z0-9_]{1}", a);
//        if(found)
//            System.out.println("Найдено");
//        else
//            System.out.println("Не найдено");

    //String zz = matlatletter.

//        else
//            {
//                System.out.println("Не то не другое");
//        }
        //System.out.println(bar);
    }
}
