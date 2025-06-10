package my_tasks.timeconverter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverterSimple {

    public static void convertTimeInterval(
            ZoneEnum sourceZone,
            int startHour,
            int endHour,
            ZoneEnum targetZone
    ) {
        // Используем текущую дату
        LocalDate today = LocalDate.now();

        // Создаем ZonedDateTime в исходной зоне
        ZonedDateTime startTime = ZonedDateTime.of(today, LocalTime.of(startHour, 0), sourceZone.toZoneId());
        ZonedDateTime endTime = ZonedDateTime.of(today, LocalTime.of(endHour, 0), sourceZone.toZoneId());

        // Конвертируем в целевую зону
        ZonedDateTime convertedStart = startTime.withZoneSameInstant(targetZone.toZoneId());
        ZonedDateTime convertedEnd = endTime.withZoneSameInstant(targetZone.toZoneId());

        // Форматтер для вывода
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm z");

        // Выводим результат
        System.out.println("Converted time interval:");
        System.out.println("From: " + formatter.format(convertedStart));
        System.out.println("To:   " + formatter.format(convertedEnd));
    }

    // Пример вызова метода
    public static void main(String[] args) {
        convertTimeInterval(ZoneEnum.UTC_MINUS_4, 10, 16, ZoneEnum.UTC_PLUS_3);
    }

    public enum ZoneEnum {
        UTC_MINUS_8("UTC-8"),
        UTC_MINUS_4("UTC-4"),
        UTC("UTC"),
        UTC_PLUS_1("UTC+1"),
        UTC_PLUS_3("UTC+3"),
        UTC_PLUS_5("UTC+5"),
        UTC_PLUS_9("UTC+9");

        private final String zoneId;

        ZoneEnum(String zoneId) {
            this.zoneId = zoneId.replace("UTC", "GMT"); // Java понимает GMT
        }

        public ZoneId toZoneId() {
            return ZoneId.of(zoneId);
        }
    }
}
