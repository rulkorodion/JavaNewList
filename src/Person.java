
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Гендер: " + gender);
    }

    public void upAge() {
        this.age++;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Person person = new Person("Линка", 19, "Женщина");
        person.getInfo();
        person.upAge();
        person.changeName("Лиза");
        person.getInfo();

    }

}
