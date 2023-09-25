import java.util.OptionalInt;

public class PersonBuilder {
    protected String name;
    protected String surname;

    protected OptionalInt age;

    protected String city;


    public PersonBuilder setName(String name) {
        this.name = name;

        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(OptionalInt age) {
        this.age = age;
        if (age != null) {
            if (age.getAsInt() < 0) {
                throw new IllegalArgumentException("Возраст не может быть меньше нуля");
            }
        }
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null && surname == null) {
            throw new IllegalArgumentException("Нет данных о имени и/или фамилии");
        }

        Person person = new Person(name, surname, age, city);
        return person;

    }
}

