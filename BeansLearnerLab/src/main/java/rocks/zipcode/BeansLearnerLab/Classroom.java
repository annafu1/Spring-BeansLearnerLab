package rocks.zipcode.BeansLearnerLab;

import java.util.ArrayList;

public class Classroom {
    ArrayList<Instructors> instructors;
    ArrayList<Students> students;

    public Classroom(ArrayList<Instructors> instructors, ArrayList<Students> students) {
        this.instructors = instructors;
        this.students = students;
    }

//    public void hostLecture(Teacher teacher, double numberOfHours) {
//        teacher.lecture((Iterable<? extends Learner>) students,numberOfHours);
//    }
}
