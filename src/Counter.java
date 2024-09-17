public class Counter {
    // Для учёта количества объектов
    private static int objectCount = 0;
    // Конструктор увеличивающий счетчик при создании объекта
    public Counter() {
        increaseCount();
    }
    // Метод для увеличения счетчика объектов
    private void increaseCount() {
        objectCount++;
    }
    // Метод для получения количества созданных объектов
    public static int getObjectCount() {
        return objectCount;
    }
}