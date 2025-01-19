package DateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
//  import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GetDateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime both = LocalDateTime.now();

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String ti = both.format(format1);

        System.out.println(ti);

        System.out.println(time+"\n"+date+"\n"+both);
    }
}
