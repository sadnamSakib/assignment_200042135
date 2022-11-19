package assignment1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestClass {
    @Test
    void FebruaryTest() {
        calendar calendar = new calendar();
        date d = new date(28,2,2021);
        assertEquals(1 , calendar.next_date(d).day );
        assertEquals(3, calendar.next_date(d).month  );
        assertEquals(2021 , calendar.next_date(d).year );
    }
    @Test
    void leapYearTest() {
        calendar calendar = new calendar();
        date d = new date(28,2,2020);
        assertEquals(29 , calendar.next_date(d).day );
        assertEquals(2, calendar.next_date(d).month  );
        assertEquals(2020 , calendar.next_date(d).year );
    }
    @Test
    void monthShiftTest() {
        calendar calendar = new calendar();
        date d = new date(31,3,2020);
        assertEquals(1 , calendar.next_date(d).day );
        assertEquals(4, calendar.next_date(d).month  );
        assertEquals(2020 , calendar.next_date(d).year );
    }
    @Test
    void yearShiftTest() {
        calendar calendar = new calendar();
        date d = new date(31,12,2020);
        assertEquals(1 , calendar.next_date(d).day);
        assertEquals(1, calendar.next_date(d).month );
        assertEquals(2021 , calendar.next_date(d).year);
    }
    @Test
    void dayShiftTest() {
        calendar calendar = new calendar();
        date d = new date(30,12,2020);
        assertEquals(31 , calendar.next_date(d).day);
        assertEquals(12, calendar.next_date(d).month );
        assertEquals(2020 , calendar.next_date(d).year);
    }

}
