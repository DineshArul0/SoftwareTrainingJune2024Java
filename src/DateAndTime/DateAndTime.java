package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public DateAndTime(){
        getCurrentDate();
        getCurrentTime();
    }

    LocalDate date=null;
    LocalTime time=null;
    DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH:mm:ss");
    //to get the current Date
    //to add somedays to the current Date
    //to sub somedays from the current Date

    //to get the current Time

    // to formatt the date to our required

    public LocalDate getCurrentDate(){
        LocalDateTime localDateTime=LocalDateTime.now();
        date=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(localTime);
        return date;
    }

    public String addDays(int days){
        String datee=date.plusDays(days).format(dateFormatter);
        return datee;
    }

    public String getAdultDOB(){
        String datee=String.valueOf(date.minusYears(19));
    return datee;
    }


    ///////////////////////////////////////////// Time
public LocalTime getCurrentTime(){
        time=LocalTime.now();
        return time;
}
public String Addhours(int hours){
        String timee=time.plusHours(hours).format(timeFormatter);
        return timee;
}


}
