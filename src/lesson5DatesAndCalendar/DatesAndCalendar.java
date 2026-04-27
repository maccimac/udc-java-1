package lesson5DatesAndCalendar;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {

    public static void main(String[] args) {
      displaySetDate(); 
    }

    static void displayCurrentDate() {
        // java.util.Date currentDate = new java.util.Date();
        // System.out.println("Current date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Date date = new java.util.Date();
        System.out.println(date);
    }

    static void displaySetDate(){
      Calendar calendar = Calendar.getInstance();
      // calendar.getInstance().set(2024, Calendar.JUNE, 15);
      calendar.getInstance().set(2031, 02, 02);
      
      Date date = calendar.getTime();
      System.out.println(date);
    }

}
