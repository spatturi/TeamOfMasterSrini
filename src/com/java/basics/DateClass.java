package src.com.java.basics;

import org.junit.platform.commons.util.StringUtils;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("\t \t \t \t \t"+date);
//        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
//        String timeIn24Hrs = formatter.format(date);
//        System.out.println(timeIn24Hrs);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime actualTime = LocalTime.now();
        System.out.println(actualTime);

        LocalTime morningStart = LocalTime.parse("08:00:00",formatter);
        LocalTime morningEnd = LocalTime.parse("11:59:59");

        LocalTime eveningStart = LocalTime.parse("16:00:00",formatter);
        LocalTime eveningEnd = LocalTime.parse("20:00:00");

        if (actualTime.isAfter(morningStart) && actualTime.isBefore(morningStart)){
            System.out.println("Good Morning");
        }

        if (actualTime.isAfter(eveningStart) && actualTime.isBefore(eveningEnd)){
            System.out.println("Good Evening");
        }


//        LocalTime time = LocalTime.MIDNIGHT;
//        System.out.println(time);
//        LocalTime time1=LocalTime.NOON;
//        System.out.println(time1);
//        System.out.println(LocalTime.MIN);

//        if (date.after("17:28:00"))
//        System.out.println();
    }
}
