//публичный класс Cat реализует интерфейс Animal
public class Cat implements Animal {
    public Cat() {
    }
    @Override                           // Переопределение метода
    public void makeSound() {
        System.out.println("Mew!");
    }
}
