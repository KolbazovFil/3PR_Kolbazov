//публичный класс Cow реализует интерфейс Animal
public class Cow implements Animal {
    public Cow() {
    }
    @Override                           // Переопределение метода
    public void makeSound() {
        System.out.println("Moo!");
    }
}
