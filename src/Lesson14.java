import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class Lesson14
{
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = ss.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) Math.round((Math.random() * 30) - 20);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println(NumberUtils.max(array)+ " " + " " + NumberUtils.min(array));
        if (Math.abs(NumberUtils.max(array))>Math.abs(NumberUtils.min(array)))
        {
            System.out.println("Максимальное числов в массиве по модулю больше " + Math.abs(NumberUtils.max(array)));
        }
        else if(Math.abs(NumberUtils.max(array))<Math.abs(NumberUtils.min(array)))
        {
            System.out.println("Минимальное числов в массиве по модулю больше " + Math.abs(NumberUtils.min(array)));
        }
    }
}
