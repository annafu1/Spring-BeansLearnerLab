package rocks.zipcode.BeansLearnerLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor>{

    public Instructors(ArrayList<Instructor> personList) {
        super(personList);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return super.spliterator();
    }
}
