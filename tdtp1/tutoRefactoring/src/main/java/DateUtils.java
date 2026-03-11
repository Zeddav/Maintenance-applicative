import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return LocalDate.now().isAfter(startingDate)
                &&
                LocalDate.now().isBefore(endingDate);
    }

    private static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate now, boolean inclusive) {
        LocalDate startingDay; // sera le paramètre startingDate ou le lendemain du paramètre
        LocalDate endingDay; // sera le paramètre endingDate ou le la veille du paramètre
        if (inclusive) {
            startingDay = startingDate.minusDays(1); // la veille
            endingDay = startingDate.plusDays(1); // le lendemain
        }
        else {
            startingDay = startingDate;
            endingDay = endingDate;
        }
        return now.isAfter(startingDay)
                &&
                now.isBefore(endingDay);
    }

    private static boolean isDateOutsider(LocalDate date, LocalDate startingDate, LocalDate
            endingDate) {
        return !DateUtils.isDateBetween(date, startingDate, endingDate,  true );
    }
}