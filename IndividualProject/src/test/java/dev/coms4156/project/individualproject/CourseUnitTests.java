package dev.coms4156.project.individualproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * The class with the test methods for Course.java.
 */

@SpringBootTest
@ContextConfiguration
public class CourseUnitTests {

  @BeforeAll
  public static void setupCourseForTesting() {
    testCourse = new Course("Griffin Newbold", "417 IAB", "11:40-12:55", 250);
  }


  @Test
  public void toStringTest() {
    String expectedResult = "\nInstructor: Griffin Newbold; Location: 417 IAB; Time: 11:40-12:55";
    assertEquals(expectedResult, testCourse.toString());
  }

  /**
   * The test course instance used for testing.
   */
  public static Course testCourse;


  /**
   * tests the enrollStudent method.
   */
  @Test
  public void enrollStudentTest() {
    testCourse.setEnrolledStudentCount(200);
    testCourse.enrollStudent();
    assertEquals(201, testCourse.getEnrolledStudentCount());
  }

  /**
   * tests the dropStudent method.
   */
  @Test
  public void dropStudentTest() {
    testCourse.setEnrolledStudentCount(200);
    testCourse.dropStudent();
    assertEquals(199, testCourse.getEnrolledStudentCount());
  }


  /**
   * tests the getCourseLocation method.
   */
  @Test
  public void getCourseLocationTest() {
    String expectedResult = "417 IAB";
    assertEquals(expectedResult, testCourse.getCourseLocation());
  }







}

