/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App classUnderTest;

    @Before public void init() {
        classUnderTest = new App();

    }

    @Test public void emptyFile() {
        assertEquals("there should be no errors for an empty file", "",
                classUnderTest.readFile("src/test/resources/empty.js"));
    }

    @Test public void oneErrorFile() {
        assertEquals("there should be one error for an empty file", "\nLine 3: Missing Semicolon.",
                classUnderTest.readFile("src/test/resources/one-error.js"));
    }

    @Test public void fewErrorsFile() {
        assertEquals("there should be few errors",
                        "\nLine 3: Missing Semicolon.\n" +
                        "Line 7: Missing Semicolon.\n" +
                        "Line 11: Missing Semicolon.",
                classUnderTest.readFile("src/test/resources/few-errors.js"));
    }

    @Test public void manyErrorsFile() {
        assertEquals("there should be one error for an empty file",
                "\nLine 3: Missing Semicolon.\n" +
                        "Line 7: Missing Semicolon.\n" +
                        "Line 11: Missing Semicolon.\n" +
                        "Line 15: Missing Semicolon.\n" +
                        "Line 19: Missing Semicolon.\n" +
                        "Line 23: Missing Semicolon.",
                classUnderTest.readFile("src/test/resources/many-errors.js"));
    }

    @Test public void noErrorsFile() {
        assertEquals("there should be no errors for a file with no errors", "",
                classUnderTest.readFile("src/test/resources/no-errors.js"));
    }
}
