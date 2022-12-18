package rocks.zipcode.BeansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {
    @Autowired
    private StudentConfig studentConfig;
    @Test
    public void currentStudents() {
//        Student name1 = new Student(1, "Sarah");
//        int expected = 1;
//        studentConfig.currentStudents().add(name1);
//        Students students = studentConfig.currentStudents();
//        Assert.assertEquals(expected,students);
    }

    @Test
    public void previousStudents() {
//        studentConfig.previousStudents().clear();
//        Student name1 = new Student(1, "Sarah");
//        int expected = 1;
//        studentConfig.previousStudents().add(name1);
//        Students students = studentConfig.previousStudents();
//        Assert.assertEquals(expected, students);
    }

}
