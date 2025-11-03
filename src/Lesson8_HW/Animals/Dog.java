package Lesson8_HW.Animals;

public class Dog extends Animal{
    String name;

    private Dog(String type, String classification, int age, String name) {
        super(type, classification, age);
        this.name = name;
    }
        // Вариант обхода приватного  конструктора 1. Создаем публичный конструктор и в нём вызываем приватный
    public Dog(){
        this("Unknown","Unknown",3,"XZ");
    }

    @Override
    public void voice(){
        System.out.println("Dog says AUF");
    }


    @Override
    public void eat(String food){
        String foodToEat = "Meat";
        if(food.equals(foodToEat)) {
            System.out.println(name + " likes to eat " + food);
        }
        else {
            System.out.println("AUF This is not my food!");
        }
    }
    // Вариант с обходом приватного конструктора 2. Так как приватный конструктор может быть вызван напрямую только в
   //своем классе, то можно создать метод, который вызывает конструктор и передает его в другой класс. Если передаем в
    //static, то метод тоже должен быть статическим. Создаем статик метод, который возвращает объект класса и работаем
    //с ним в другом классе

    public static Dog getPrivateCostructor(){
        return new Dog("Predator","Wild", 4, "Simba");
    }
    
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "\n type='" + type + '\'' +
                "\n classification='" + classification + '\'' +
                "\n age=" + age +
                '}';
    }
}
