package rocks.zipcode.BeansLearnerLab;

public interface Teacher {
    void teach (Learner learner, double numberOfHours);

    void lecture(Iterable <? extends Learner>learners, double numberOfHours);
}
