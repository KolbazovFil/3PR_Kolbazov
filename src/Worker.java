//Чтобы унаследовать один класс от другого, нужно после объявления нашего класса указать ключевое слово extends и написать имя родительского класса.
public class Worker extends Person{

    //Заработная плата
    public double salary;

    // Метод работника
    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);                                                   // Базовый класс еще называют “суперклассом”
        this.salary = salary;
    }
}