package rocks.zipcode.BeansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;

public class ClassroomConfig {
    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohorts(ArrayList<Instructors> instructors, ArrayList<Students> students) {
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohorts(ArrayList<Instructors> instructors, ArrayList<Students> students) {
        return new Classroom(instructors, students);
    }
}
