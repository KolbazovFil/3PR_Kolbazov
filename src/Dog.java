//публичный класс Dog реализует интерфейс Animal
public class Dog implements Animal {
    public Dog() {
    }
    @Override                           // Переопределение метода
    public void makeSound() {
        System.out.println("Wuf!");
    }
}