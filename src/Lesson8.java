import java.util.Scanner;

public class Lesson8
{
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Введите положительное число:");
        int b=0;
        int a;
        if (ss.hasNext())
        {
            a = ss.nextInt();
            if (a > 0)
                {
                for (int i = a; i > 0; i--)
                    {
                    if (i % 2 !=0)
                        {
                        b += i;
                            System.out.println(b);
                        }

                    }
                }
            else {
                System.out.println("Неверный формат");
            }
            System.out.println("Сумма нечетных числе равна " + a + " = " + b);
        }
    }
}
