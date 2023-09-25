import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;

    protected OptionalInt age;

    protected String city;

    public Person(String name, String surname, OptionalInt age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public void setAddres(String city) {
        this.city = city;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    boolean hasAge() {
        return (getAge() != null ? true : false);
    }

    boolean hasAddress() {
        return (getCity() != null ? true : false);
    }

    boolean hasName() {
        return (getName() == null ? true : false);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder()
                .setCity(city)
                .setSurname(surname);
        return child;

    }

}