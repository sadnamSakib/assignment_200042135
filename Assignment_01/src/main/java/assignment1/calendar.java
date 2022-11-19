package assignment1;

import java.util.Arrays;
import java.util.List;

public class calendar {

    public boolean isLastDayOfMonth(date d) {

        List<Integer> monthsWith31Days = Arrays.asList(1,3,5,7,8,10,12);
        boolean lastDayOfFebruary = (isLeapYear(d) && isFebruary(d) && d.day==29) || (!isLeapYear(d) && isFebruary(d) && d.day ==28);
        boolean lastDayOfOtherMonths = (d.day==31 && monthsWith31Days.contains(d.month)) || (d.day==30 && !monthsWith31Days.contains(d.month));
        return  lastDayOfFebruary || lastDayOfOtherMonths;

    }
    public boolean isLeapYear(date d) {
        return (d.year % 400 == 0 || (d.year % 4 == 0 && d.year % 100 != 0));
    }
    public boolean isFebruary(date d) {
        return d.month == 2;
    }
    public boolean isLastDayOfYear(date d){
        return (d.month==12 && d.day==31);
    }
    public date next_date(date d) {

        int month = d.month;
        int day = d.day;
        int year = d.year;
        if(isLastDayOfYear(d)){
            day=1;
            month=1;
            year++;
        }
        else if(isLastDayOfMonth(d)){
            day=1;
            month++;
        }
        else{
            day++;
        }
        date tomorrowsDate = new date(day, month, year);
        return tomorrowsDate;
    }

}
