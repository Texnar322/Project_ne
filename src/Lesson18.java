import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson18
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Угадайте загадку “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.");
        String response = "Заархивированный вирус";
        String prompt = "Подсказка";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ответ ");
        String responseone = reader.readLine();
        if (responseone.equals(response))//Правильный ответ
        {
            System.out.println("Правильно!");
        }
        else if (responseone.equals(prompt))//Подсказка
        {
            System.out.println("Воспользуешься архиватором будет плохо)");
            String responseonepromt = reader.readLine();
            if (responseonepromt.equals(response))//Первый ответ правильный c подсказкой
            {
                System.out.println("Правильно!");
            }
            else if (!responseonepromt.equals(response))//Первый ответ неправильный c подсказкой
            {
                System.out.println("Подумай еще!");
                System.out.println("Введите ответ ");
                String responsetwopromt = reader.readLine();
                if (responsetwopromt.equals(response))//Второй ответ правильный с подсказкой
                {
                    System.out.println("Правильно!");
                }
                else if (responsetwopromt.equals(prompt))
                {
                    System.out.println("Подсказка уже недоступна");
                }
                if (!responsetwopromt.equals(response))
                {
                    System.out.println("Подумай еще!");
                    System.out.println("Введите ответ ");
                    String responsethreepromt = reader.readLine();//Третий ответ
                    if (responsethreepromt.equals(response))
                    {
                        System.out.println("Правильно!");
                    }
                    else if (responsethreepromt.equals(prompt))
                    {
                        System.out.println("Подсказка уже недоступна");
                        if (!responsethreepromt.equals(response))
                        {
                            System.out.println("Обидно, приходи в другой раз");
                        }
                    }
                    else if (!responsethreepromt.equals(response))
                    {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
            }
        }
        else if (!responseone.equals(response))
        {
            System.out.println("Подумай еще!");
            System.out.println("Введите ответ ");
            String responsetwo = reader.readLine();//Второй ответ
            if (responsetwo.equals(response))
            {
                System.out.println("Правильно!");
            }
            else if (responseone.equals(prompt))
            {
                System.out.println("Подсказка уже недоступна");
            }
            else if (!responsetwo.equals(response))
            {
                System.out.println("Подумай еще!");
                System.out.println("Введите ответ ");
                String responsethree = reader.readLine();//Третий ответ
                if (responsethree.equals(response))
                {
                    System.out.println("Правильно!");
                }
                else if (responseone.equals(prompt))
                {
                    System.out.println("Подсказка уже недоступна");
                }
                else if (!responsethree.equals(response))
                {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
