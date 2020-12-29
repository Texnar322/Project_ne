import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lesson17
{
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
            System.out.println(uniqueChars.size());
            if (i>3)
            {
                System.out.println("Ответ: " + strings[0]);
            }
//            else ()
//            {
//
//            }
        }



    }
}
