import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = i.nextInt();
        if (x == 1)
        {
            System.out.println("Выберите единицу измерения: 1 - килограм, 2 - центнер, 3 - тонн");
            int x1 = i.nextInt();
            if (x1==1)//метры
            {
                System.out.println("Введите число");
                int x11 = i.nextInt();
                System.out.println("килограм:" + x11);
            }
            else if (x1==2)//центнер
            {
                System.out.println("Введите число");
                int x12 = i.nextInt();
                System.out.println("центнер:" + x12*100);
            }
            else if (x1==3)//центнер
            {
                System.out.println("Введите число");
                int x13 = i.nextInt();
                System.out.println("Тонн:" + x13*1000);
            }
        }
        else if (x == 2)
        {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int x2 = i.nextInt();
            if (x2==1)//метры
            {
                System.out.println("Введите число");
                int x21 = i.nextInt();
                System.out.println("Метры:" + x21);
            }
            else if (x2==2)
            {
                System.out.println("Введите число");
                int x21 = i.nextInt();
                System.out.println("миля:" + x21/1609);
            }
            else if (x2==3)
            {
                System.out.println("Введите число");
                int x23 = i.nextInt();
                System.out.println("ярд:" + x23*1.094);
            }
            else if (x2==4)
            {
                System.out.println("Введите число");
                int x24 = i.nextInt();
                System.out.println("фут:" + x24*3.281);
            }
        }





    }
}
