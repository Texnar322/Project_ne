import java.util.Scanner;

public class Lesson10
{
    public static void main(String[] args)
    {
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
                }
            }
        //mas.length+1
        System.out.println("");
        System.out.println("Выводим первую строку массива: ");
        for (int i = y-1; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                  System.out.print(mas[i][j] + " ");
//                if(j==x-1)
//                {
//                    System.out.println("");
//                }
            }
        }
    }
}
