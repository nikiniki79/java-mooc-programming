import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        int max = Integer.MAX_VALUE;
        Person returnObj = null;
        for (Person person : persons) {
            if (person.getHeight() < max) {
                returnObj = person;
                max = returnObj.getHeight();
            }
        }

        return returnObj;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }

        int max = Integer.MAX_VALUE;
        Person returnObj = null;
        for (Person person : persons) {
            if (person.getHeight() < max) {
                returnObj = person;
                max = returnObj.getHeight();
            }
        }
        persons.remove(returnObj);

        return returnObj;
    }
}