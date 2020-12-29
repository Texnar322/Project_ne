import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        Scanner o = new Scanner(System.in);
        System.out.println("Введите число x :");
        int x = u.nextInt();
        System.out.println("Введите число y :");
        int y = u.nextInt();
        System.out.println("Введите знак для выполнения выражения :");
        String symbol = o.next();
        switch (symbol)
            {
                case "-":
                    System.out.println(x-y);
                case "+":
                    System.out.println(x+y);
                case "/":
                    System.out.println(x/y);
                case "*":
                    System.out.println(x*y);
            }
    }
}
