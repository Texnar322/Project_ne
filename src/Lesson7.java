import java.util.Arrays;
import java.util.Scanner;

public class Lesson7
{
    public static void main(String[] args)
    {
        final int z = 5;
        final int b = 6;
        final int c = 9;
        Scanner a = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        System.out.println("Кол-во строк:");
        int x = a.nextInt();
        System.out.println("Кол-во столбцов");
        int y = a.nextInt();

        int[][] mas = new int[x][y];

        for (int i = 0; i < mas.length; i++)
        {
            for (int j = 0; j < mas.length;  j++)
            {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                mas[i][j] = a.nextInt();
                if (mas[i][j] == z)
                {
                    System.out.println("Данное значение имеется в константах");
                }
                else if (mas[i][j] == b)
                {
                    System.out.println("Данное значение имеется в константах");
                }
                else if (mas[i][j] == c)
                {
                    System.out.println("Данное значение имеется в константах");
                }
            }
        }
    }
}
