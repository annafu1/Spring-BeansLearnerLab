package rocks.zipcode.BeansLearnerLab;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        for (Learner studLearning : learners) {
            count++;
        }
        double numberOfHoursPerLearner = numberOfHours / count;
        for (Learner studLearning : learners) {
            studLearning.learn(numberOfHoursPerLearner);
        }
    }
}
