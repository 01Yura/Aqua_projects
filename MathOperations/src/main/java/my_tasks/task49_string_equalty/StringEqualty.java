package my_tasks.task49_string_equalty;

public class StringEqualty {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Ja" + "va";                  // компилируется в "Java"
        String c = new String("Java");          // новый объект в heap
        String d = c.intern();                  // ссылка из пула
        String e = "Ja" + new String("va");     // создаётся во время выполнения

        System.out.println(a == b);             // #1
        System.out.println(a == c);             // #2
        System.out.println(a == d);             // #3
        System.out.println(a == e);             // #4  <-- твой вопрос
        System.out.println(e.intern() == a);    // #5
    }
}
