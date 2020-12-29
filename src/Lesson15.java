import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double x = a.nextDouble();
        System.out.println("Введите кол-во рублей");
        double y = a.nextDouble();
        double z = y/x;
        double two = Math.round(z * 100.0) / 100.0;
        System.out.println("Итог " + two);
    }
}
