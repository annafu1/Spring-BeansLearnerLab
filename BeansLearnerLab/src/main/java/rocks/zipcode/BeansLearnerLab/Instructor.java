package rocks.zipcode.BeansLearnerLab;

import java.util.Collection;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = ((Collection<?>) learners).size();
//        int count = 0;
//        for (Learner studLearning : learners) {
//            count++;
//        }
        double numberOfHoursPerLearner = numberOfHours / count;
        for (Learner studLearning : learners) {
            studLearning.learn(numberOfHoursPerLearner);
        }
    }
}
