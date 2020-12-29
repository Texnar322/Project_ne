
import java.io.IOException;
import java.util.Scanner;


public class Lesson4 {
    public static void main(String[] args) throws IOException
    {

        Scanner i = new Scanner(System.in);
        System.out.println("Введите число для x :" );
        int x = i.nextInt();
        System.out.println("Введите число для y :" );
        int y = i.nextInt();
        System.out.println("Введите число для z :" );
        int z = i.nextInt();
        int avg = (x + y + z)/3;
        System.out.println("Среднее арифметическое число :" + avg);
        double avddouble = avg/2;
        double avddoublemath = Math.floor(avddouble);
        if (avddoublemath >3)
            {
                System.out.println("Программа выполнена корректно");
            }

    }
}
