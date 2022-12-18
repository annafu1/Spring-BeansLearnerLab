package testBeforePart10;

//import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import rocks.zipcode.BeansLearnerLab.Instructor;
import rocks.zipcode.BeansLearnerLab.Student;
import rocks.zipcode.BeansLearnerLab.Students;

import java.util.ArrayList;

public class InstructorTest {

    @Test
    public void learnTest() {
        Instructor instructor = new Instructor(1L, "joe");
        Student students = new Student(1L, "");
        instructor.teach(students,5.00);
        double expected = 5.00;
        double actual = students.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lectureTest() {
        ArrayList<Student>studentList = new ArrayList<>();
        Instructor instructor = new Instructor(2L, "");
        Student student1 = new Student(3L, "");
        Student student2 = new Student(4L, "");
        studentList.add(student1);
        studentList.add(student2);
        instructor.lecture(studentList,10.00);
        double expected = 5.00;
        double actual = student1.getTotalStudyTime();
        System.out.println("@"+ actual);
        Assert.assertEquals(expected,actual);
    }

}
