package subtask1

import java.time.DateTimeException
import java.time.LocalDate

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
//        throw NotImplementedError("Not implemented")
        val mapDayOfWeekInRus = mapOf(
            "MONDAY" to "понедельник",
            "TUESDAY" to "вторник",
            "WEDNESDAY" to "среда",
            "THURSDAY" to "четверг",
            "FRIDAY" to "пятница",
            "SATURDAY" to "суббота",
            "SUNDAY" to "воскресенье"
        )
        val mapMonthInRus = mapOf(
            "JANUARY" to "января",
            "FEBRUARY" to "февраля",
            "MARCH" to "марта",
            "APRIL" to "апреля",
            "MAY" to "мая",
            "JUNE" to "июня",
            "JULY" to "июля",
            "AUGUST" to "августа",
            "SEPTEMBER" to "сентября",
            "OCTOBER" to "октября",
            "NOVEMBER" to "ноября",
            "DECEMBER" to "декабря"
        )

        return try {
            val localDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            "${localDate.dayOfMonth} " +
                    "${mapMonthInRus[localDate.month.toString()]}, " +
                    "${mapDayOfWeekInRus[localDate.dayOfWeek.toString()]}"
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }

    }
}
