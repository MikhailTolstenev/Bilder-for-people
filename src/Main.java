import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(OptionalInt.of(31))
                .setCity("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Иван")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
        System.out.println(mom.getAge().getAsInt());

        try {
            Person dad = new PersonBuilder()
                    .build();
            System.out.println(dad.hasName());
            System.out.println(dad);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(OptionalInt.of(-100)).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

