package objects_and_classes.songs.order_by_age;

public class Person {
    private final String name;
    private final String id;
    private final int age;


    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
