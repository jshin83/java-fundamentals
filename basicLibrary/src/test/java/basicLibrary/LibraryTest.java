/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    Library classUnderTest;
    @Before
    public void init() {
        classUnderTest = new Library();
    }

    //tests for first function
    @Test public void fourRoll() {
        int[] result = classUnderTest.roll(4);
        System.out.println(Arrays.toString(result));
        assertEquals("roll should return array of 4 elements", 4, result.length);
    }

    @Test public void oneRoll() {
        int[] result = classUnderTest.roll(1);
        System.out.println(Arrays.toString(result));
        assertEquals("roll should return array of 1 elements", 1, result.length);
    }

    @Test public void twoRoll() {
        int[] result = classUnderTest.roll(2);
        System.out.println(Arrays.toString(result));
        assertEquals("roll should return array of 2 elements", 2, result.length);
    }

    @Test public void zeroRoll() {
        int[] result = classUnderTest.roll(0);
        System.out.println(Arrays.toString(result));
        assertEquals("roll should return array of 0 elements", 0, result.length);
    }

    // tests for second function
    @Test public void noDuplicates() {
        int[] noDupArr = new int[] { 1, 2, 3, 4, 5, 6 };
        assertFalse("This array does not contain duplicates", classUnderTest.containsDuplicates(noDupArr));
    }

    @Test public void hasDuplicates() {
        int[] dupArr = new int[] { 1, 2, 1, 4, 5, 6 };
        assertTrue("This array contains duplicates", classUnderTest.containsDuplicates(dupArr));
    }

    @Test public void oneElDupArr() {
        int[] oneElArr = new int[] { 1 };
        assertFalse("This array of one element does not contain duplicates",
                classUnderTest.containsDuplicates(oneElArr));
    }

    @Test public void zeroElDupArr() {
        int[] zeroElArr = new int[] {};
        assertFalse("This empty array does not contain duplicates",
                classUnderTest.containsDuplicates(zeroElArr));
    }

    //tests for third function
    @Test public void getAve() {
        int[] arr = new int[] { 1, 2, 3 };
        assertEquals("Average should be 2.", 2, classUnderTest.calcAverages(arr));
    }

    @Test public void zeroAve() {
        int[] arr = new int[] { };
        assertEquals("Average should be 0 for an empty array.", 0, classUnderTest.calcAverages(arr));
    }

    @Test public void oneElAve() {
        int[] arr = new int[] { 3 };
        assertEquals("Average should be itself for one element array.", 3,
                classUnderTest.calcAverages(arr));
    }

    //tests for fourth function
    @Test public void arrayOfArrays() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(classUnderTest.arrayOfArrays(weeklyMonthTemperatures)));

        assertEquals("Should return array with lowest average", weeklyMonthTemperatures[2],
                classUnderTest.arrayOfArrays(weeklyMonthTemperatures));
    }

    @Test public void emptyArrays() {
        int[][] weeklyMonthTemperatures = {};
        assertArrayEquals("Should return array with lowest average", new int[]{},
                classUnderTest.arrayOfArrays(weeklyMonthTemperatures));
    }

    @Test public void oneArray() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60}
        };
        assertEquals("Should return array with lowest average", weeklyMonthTemperatures[0],
                classUnderTest.arrayOfArrays(weeklyMonthTemperatures));
    }

    // map testing
    @Test public void uniqueTemperatures() {
        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String shouldBeResult = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";

        assertEquals(" ", shouldBeResult, classUnderTest.analyze2DForValues(weeklyMonthTemperatures));
    }

    @Test public void winner() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        assertEquals("should equal Bush", "Bush received the most votes!",
                classUnderTest.tally(votes));
    }


}
