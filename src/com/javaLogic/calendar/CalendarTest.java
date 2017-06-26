package com.javaLogic.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by macbook on 6/17/17.
 */
public class CalendarTest {

    public static void main(String[] args) {
        CalendarTest calendarTest = new CalendarTest();
        Calendar c = Calendar.getInstance();
        System.out.println("The Calander type is:::"+c.getCalendarType());
        System.out.println(c.getTimeInMillis());
        System.out.println(c.HOUR_OF_DAY);
        System.out.println(c.DAY_OF_MONTH);
        System.out.println(c.DAY_OF_YEAR);
        System.out.println(c.getTime());

        c.set(c.DATE,19);
        System.out.println(c.getTime());

    }
}
