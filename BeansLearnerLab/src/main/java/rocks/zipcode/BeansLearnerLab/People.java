package rocks.zipcode.BeansLearnerLab;

import java.util.ArrayList;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    ArrayList<PersonType> personList = new ArrayList<>();

    public People(ArrayList<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType personType) {
        personList.add(personType);
    }

    public void remove(PersonType personType) {
        personList.remove(personType);
    }

    public void size() {
        personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public Person findById(long id) {
        for (PersonType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public ArrayList<PersonType> findAll(){
        return personList;
    }
}


