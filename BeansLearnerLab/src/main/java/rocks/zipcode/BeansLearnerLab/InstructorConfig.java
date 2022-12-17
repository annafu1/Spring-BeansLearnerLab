package rocks.zipcode.BeansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
@Configuration
public class InstructorConfig {

        @Bean
        public Instructors tcUsaInstructors(ArrayList<Instructor> tcUsaInstructors) {
            return new Instructors(tcUsaInstructors);
        }
        @Bean
        public Instructors tcUKInstructors(ArrayList<Instructor> tcUKInstructors) {
            return new Instructors(tcUKInstructors);
        }

        @Primary
        @Bean(name = "instructors")
        public Instructors ZipCodeWilmington(ArrayList<Instructor> ZipCodeWilmington) {
            return new Instructors(ZipCodeWilmington);
        }
}
