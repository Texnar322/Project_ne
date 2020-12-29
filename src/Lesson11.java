import java.util.Scanner;

public class Lesson11
{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String x = a.next();
        int xx = Integer.parseInt(x);
        System.out.println("Введите второе число:");
        int y = a.nextInt();
        double yy = y;
        if (xx>y)
        {

            System.out.println("Большее число " + xx);
            System.out.println("Меньшее число " + yy);
        }
        else if (xx<y)
        {

            System.out.println("Большее число " + yy);
            System.out.println("Меньшее число " + xx);
        }
        else
        {
            System.out.println("Числа равны");
        }
    }

}
