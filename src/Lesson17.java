import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.*;
import java.lang.Math;

public class Lesson17
{
    //@SuppressWarnings("MismatchedReadAndWriteOfArray")
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        if (scanner.hasNextInt())
        {
            n = scanner.nextInt();
        }
        else
        {
            System.out.print("Введены некорректные данные!");
            return;
        }
        String[] strings = new String[n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Строка " + (i+1) + ": ");
            strings[i] = scanner.next();
            String s = strings[i].replace(" ", "");
            char[] chars = s.toCharArray();
            Set<Character> uniqueChars = new HashSet<Character>();
            for (char c : chars)
            {
                uniqueChars.add(c);

            }
            //System.out.println(uniqueChars.size());
            //Связать номер intset[i] с strings[n]
            int[] intset = new int[i + 1];
            int size = uniqueChars.size();
            intset[i] = size;
            if (n<=1+i)
            {
                System.out.println(NumberUtils.max(intset));
                int total = NumberUtils.max(intset);
//                strings[i] = total;
//                if (total)
//                {
//
//                }
            }
//            if ()
//            {
//                System.out.println(strings[0]);
//            }
                //дописать условие в рамках которого если intset[i] несколько одинаковых то выводить первую строку
            //System.out.println(i);
        }
//        List list = Arrays.asList(ArrayUtils.toObject(intset[i]));
//
//        System.out.println(Collections.max(list));
    }
}
