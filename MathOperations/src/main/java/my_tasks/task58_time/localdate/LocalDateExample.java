package my_tasks.task58_time.localdate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateExample {
    public static void main(String[] args) throws InterruptedException {
//        Создаем обьект класса LocalDate и выводим текущую дату с помощью метода now().
        LocalDate date = LocalDate.now();
        System.out.println(date);
//        День недели
        System.out.println(date.getDayOfWeek());
//        Месяц
        System.out.println(date.getMonth());
        System.out.println();

//        Чтобы создать обьект класса с определенной датой
        LocalDate date2 = LocalDate.of(1985, Month.AUGUST, 2);
        System.out.println(date2.getDayOfWeek());
        LocalDate date3 = LocalDate.of(1986, Month.MARCH, 19);
//        Сравниваем 2 даты, раньше ли первая чем вторая - beforeIs()
        System.out.println(date2.isBefore(date3));
//        Можно создавать период для расчета повторяющихся событий
        Period period = Period.ofYears(1);

        Duration duration = Duration.ofSeconds(30);

        LocalTime time = LocalTime.now();
        LocalTime finishTime = time.plusSeconds(1);
        int i = 1;
        while (time.isBefore(finishTime)) {
            time = LocalTime.now();
            System.out.println(i);
            i++;
            Thread.sleep(500);
        }

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(date.format(d1));

//        Вывод в человекочитаемом виде
        DateTimeFormatter d2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(date.format(d2));

    }
}
