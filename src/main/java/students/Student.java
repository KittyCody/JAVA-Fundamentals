package students;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String hometown;


    public Student(String name, String surname, int age, String hometown) {
        //new empty object
        //in order to create instances of the class
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hometown = hometown;
    }

    //methods -> all operations used on the instances of the class


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

}











