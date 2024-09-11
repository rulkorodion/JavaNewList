/*2. Наследование: Класс "Работник" и "Менеджер"
Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.*/
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

