package NumberUtils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.Time;
import java.time.Clock;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    NumberUtils numberUtils;
    LocalTime time;

    @BeforeEach
    void setUp() {
        numberUtils = new NumberUtils();
        time = LocalTime.now();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void HourAndSecondIsValidTest(){
        NumberUtils time = new NumberUtils(12, 45);
        assertEquals(12, time.getHour());
        assertEquals(45, time.getMinute());
    }

    @Test
    void convertHourToWordsTest(){
        NumberUtils time = new NumberUtils(6, 10);
        assertEquals("six", time.convertHourToWords());
    }

    @Test
    void zeroHourTimeTest(){
        NumberUtils time = new NumberUtils(0, 10);
        assertEquals("twelve", time.convertHourToWords());
    }

    @Test
    void convertMinuteToWordsTest(){
        NumberUtils time = new NumberUtils(10, 40);
        assertEquals("forty", time.convertMinuteToWords());

        NumberUtils time1 = new NumberUtils(10, 35);
        assertEquals("thirty five", time1.convertMinuteToWords());

        NumberUtils time2 = new NumberUtils(10, 6);
        assertEquals("six", time2.convertMinuteToWords());
    }

    @Test
    void printTimeInWord(){
        NumberUtils time = new NumberUtils(10, 45);
        assertEquals("ten", time.convertHourToWords());
        assertEquals("forty five", time.convertMinuteToWords());
        time.printTimeInWord();

        NumberUtils time1 = new NumberUtils(00, 00);
        assertEquals("twelve", time1.convertHourToWords());
         assertEquals("zero", time1.convertMinuteToWords());
        time1.printTimeInWord();

        NumberUtils time2 = new NumberUtils(01, 00);
        assertEquals("one", time1.convertHourToWords());
         assertEquals("zero", time1.convertMinuteToWords());
        time2.printTimeInWord();

        NumberUtils time3 = new NumberUtils(05, 30);
        assertEquals("five", time3.convertHourToWords());
        assertEquals("thirty", time3.convertMinuteToWords());
        time3.printTimeInWord();
    }

    @Test
    void getCurrentHourTest(){
        System.out.println(NumberUtils.getCurrentHour());
        int hour = time.getHour();
        assertEquals("three", NumberUtils.getCurrentHour());
    }

    @Test
    void getCurrentMinuteTest(){

        System.out.println(NumberUtils.getCurrentMinute());
//        String minute = time.getMinute();
        assertEquals("thirty", NumberUtils.getCurrentMinute());
    }

    @Test
    void whatIsTheTimeTest(){
        NumberUtils.whatIsTheTime();
    }


}


