import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac4 {
    public static void main(String[] args) {
        // 2024/04/24に24日を加算する
        String today = addDay("2024/04/24", 24);
        System.out.println(today);
    }

    public static String addDay(String yyyymmdd, int addDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        try {
            Date d = sdf.parse(yyyymmdd);
            calendar.setTime(d);
            calendar.add(Calendar.DAY_OF_MONTH, addDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(calendar.getTime());
    }
}
