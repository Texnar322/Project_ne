public class Lesson12
{
    public static void main(String[] args)
    {
     String a = "I like Java!!!";
     boolean one;
     String b;
     String c;
     if (one = a.contains("Java"))
     {
         if (one = a.startsWith("I like"))
         {
             if (one = a.endsWith("!!!"))
             {
                 System.out.println(a.toUpperCase());
                 b = a.substring(7, 11);
                 c = b.replace('a', 'o');
                 System.out.println(c);
             }
             else
             {
                 System.out.println("Формат строки неверный (!!!)");
             }

         }
         else
         {
             System.out.println("Формат строки неверный (I like)");
         }
     }
     else
         {
             System.out.println("Формат строки неверный (Java)");
         }

    }
}
