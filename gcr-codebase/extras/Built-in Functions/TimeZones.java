import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones {

    static void displayTimeZones() {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT Time : " + gmt);
        System.out.println("IST Time : " + ist);
        System.out.println("PST Time : " + pst);
    }

    public static void main(String[] args) {
        displayTimeZones();
    }
}
