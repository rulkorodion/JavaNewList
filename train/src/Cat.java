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
}
