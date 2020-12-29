import java.util.Scanner;

public class Lesson9
{
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = ss.nextInt();
        double [] array = new double[x];
        System.out.println("Введите числа в массив");
        int length1 = array.length;
        double d;
        double sum = 0;
        for (int i = 0; i < x; i++)
            {
                array[i] = ss.nextDouble();
            }
        for (int j = 0; j < array.length; j++)
        {
            sum += array[j];

        }
        d = sum / array.length;
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(" " + array[i]*d + " ");
        }



    }
}
