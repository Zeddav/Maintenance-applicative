import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return LocalDate.now().isAfter(startingDate)
                &&
                LocalDate.now().isBefore(endingDate);
    }

    private static boolean isABoolean(LocalDate startingDate, LocalDate endingDate, LocalDate now) {
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }
}