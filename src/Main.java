/*1. Класс "Человек"
Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.
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
}*/

/*2. Наследование: Класс "Работник" и "Менеджер"
Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.

public class Worker extends Person {
    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public void getWorkerInfo() {
        getInfo();
        System.out.println("Зарплата: " + salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker {
    private List<Worker> pole;
    public Manager(String name, int age, String gender, double salary, List<Worker> pole) {
        super(name, age, gender, salary);
        this.pole = pole;
    }

    public void getManagerInfo() {
        getWorkerInfo();
        System.out.println("Количество подчиненных: " + pole.size());
        System.out.println("Информация о подчиненных:");
        for (Worker worker : pole) {
            worker.getWorkerInfo();
        }
    }

    public void setPole(List<Worker> pole) {
        this.pole = pole;
    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("Алексей", 22, "Мужчина", 80000);
        Worker worker2 = new Worker("Ольга", 28, "Женщина", 75000);

        List<Worker> pole = new ArrayList<>();
        pole.add(worker1);
        pole.add(worker2);

        Manager manager = new Manager("Иван", 25, "Мужчина", 100000, pole);

        manager.getManagerInfo();
    }
}*/

/*3. Полиморфизм: Животные
Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.
public interface Animal {
    void makeSound();
}
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав гав гав");
    }
}
public class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Муууууууууу");
    }
}
public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу мяу");
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}*/

