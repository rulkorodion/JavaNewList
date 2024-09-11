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
        Worker worker1 = new Worker("Алексей", 30, "Мужчина", 50000);
        Worker worker2 = new Worker("Ольга", 28, "Женщина", 55000);

        List<Worker> pole = new ArrayList<>();
        pole.add(worker1);
        pole.add(worker2);

        Manager manager = new Manager("Иван", 40, "Мужчина", 100000, pole);

        manager.getManagerInfo();
    }
}
