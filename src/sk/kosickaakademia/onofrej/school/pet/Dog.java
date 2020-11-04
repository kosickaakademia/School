package sk.kosickaakademia.onofrej.school.pet;

import java.util.Date;

public class Dog implements Animal{
    private String name;
    private String rasa;
    private Date dob;

    public Dog(String name, String rasa) {
        this.name = name;
        this.rasa = rasa;
    }
}
