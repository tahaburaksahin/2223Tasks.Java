package _2324Z.wis.eng.gr39.ppj_19;

import java.util.Arrays;

public class Person {

    private String name;
    private Car[] cars;

    public Person(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public Person(String name) {
        this(name, new Car[0]);
    }

    public String getName() {
        return name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void addCar(Car car) {
        Car[] carsTmp = this.cars;
        this.cars = new Car[carsTmp.length + 1];
        for (int i = 0; i < carsTmp.length; i++) {
            this.cars[i] = carsTmp[i];
        }
        this.cars[cars.length - 1] = car;
    }

    public void show() {
        System.out.println(name);
        for (Car car : cars) {
            System.out.println(car.getName() + " - " + car.getPrice());
        }
        System.out.println("-----------------------------------------");
    }

    public static Car[] getPersonsCars(Person[] persons) {
        int count = 0;
        for (Person p : persons) {
            count += p.cars.length;
        }
        Car[] personsCars = new Car[count];
        int i = 0;
        for (Person p : persons) {
            for (Car c : p.getCars()) {
                personsCars[i++] = c;
            }
        }
        return personsCars;
    }

    public static Car[] expensiveCars(Person[] persons, double price) {
        int count = 0;
        for (Person p : persons) {
            for (Car c : p.getCars()) {
                if (c.getPrice() >= price) {
                    count++;
                }
            }
        }
        Car[] personsCars = new Car[count];
        int i = 0;
        for (Person p : persons) {
            for (Car c : p.getCars()) {
                if (c.getPrice() >= price) {
                    personsCars[i++] = c;
                }
            }
        }
        return personsCars;
    }

    public static String getPrice(Person[] persons, String name, String carName) {
        for (Person p : persons) {
            if (p.name.equals(name)) {
                for (Car c : p.getCars()) {
                    if (c.getName().equals(carName)) {
                        return c.toString();
                    }
                }
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
