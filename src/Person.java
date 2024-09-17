public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender) {
        // явный вызов конструктора
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // Метод для вывода информации о человеке
    public void InfoPerson() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }
    // Метод для увеличения возраста
    public void changeAge() {
        age++;
    }
    // Метод для изменения имени
    public void changeName(String name) {
        this.name = name;
    }
}