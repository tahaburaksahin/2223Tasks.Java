package _2324Z.wis.eng.gr39.ppj_18;

public class Person {

    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public Person(String name) {
//        this.name = name;
//        this.birthYear = 1900;
        this(name, 1900);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static Person getOlderPerson(Person p1, Person p2) {
        if (p1.birthYear < p2.birthYear) {
            return p1;
        } else {
            return p2;
        }
    }

    public static Person getOldestPerson(Person[] people) {
        if (people.length == 0) {
            return null;
        }
        Person theOldest = people[0];
        for (Person person : people) {
            theOldest = getOlderPerson(theOldest, person);
        }
        return theOldest;
    }
}
